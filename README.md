# Exemplo serviço utilizando clean architecture

## Conceitos relacionados com domain drive design

### Entidade
- representação de um objeto de negócio

### Invariante
- regra de negócio que deve ser sempre verdadeira para os objetos válidos.

### Value object
- representação de uma parte da entidade, que a mesma seja única. Exemplo: cpf

### Agregate
- uma entidade que possi vários value object

### Eventos
- ações que ocorrem de forma desacoplada, diante a um acontecimento. Exemplo: pedido foi atualizado, eventos: imprimir, enviar por email, transmitir para uma middleware
