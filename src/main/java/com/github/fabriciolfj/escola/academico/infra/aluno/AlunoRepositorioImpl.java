package com.github.fabriciolfj.escola.academico.infra.aluno;

import com.github.fabriciolfj.escola.academico.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.academico.dominio.aluno.Aluno;
import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.academico.dominio.aluno.FabricaDeAluno;
import com.github.fabriciolfj.escola.academico.dominio.aluno.Telefone;
import com.github.fabriciolfj.escola.academico.dominio.exceptions.AlunoNaoEncontrado;
import com.github.fabriciolfj.escola.academico.dominio.exceptions.FalhaProcessoRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class AlunoRepositorioImpl implements RepositorioDeAlunos {

    private final Connection connection;

    public AlunoRepositorioImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSER INTO ALUNO VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());
            ps.execute();

            sql = "INSERT INTO TELEFONE VALUES(?,?)";
            ps = connection.prepareStatement(sql);
            for (Telefone telefone : aluno.getTelefones()) {
                ps.setString(1, telefone.getDdd());
                ps.setString(2, telefone.getNumero());
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        try {
            String sql = "SELECT * FROM ALUNO WHERE CPF = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getNumero());
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return new FabricaDeAluno()
                        .comNomeCpfEEmail(resultSet.getString("nome"), resultSet.getString("CPF"), resultSet.getString("email"))
                        .criar();
            }

            throw new AlunoNaoEncontrado("Aluno não encontrado");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Aluno> listaAlunosMatriculados() {
        try {
            String sql = "SELECT * FROM ALUNO";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            var list = new ArrayList<Aluno>();
            while (resultSet.next()) {
                list.add(new FabricaDeAluno()
                        .comNomeCpfEEmail(resultSet.getString("nome"), resultSet.getString("CPF"), resultSet.getString("email"))
                        .criar());
            }

            return list;
        } catch (Exception e) {
            throw new FalhaProcessoRepositorio(e.getMessage());
        }
    }
}
