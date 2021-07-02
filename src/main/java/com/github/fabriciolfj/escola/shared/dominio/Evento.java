package com.github.fabriciolfj.escola.shared.dominio;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();

    TipoEvento getTipo();

    Map<String, Object> values();
}
