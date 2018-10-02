package io.github.lucasduete.padroes.criacionais.builder.exceptions;

import io.github.lucasduete.padroes.criacionais.builder.enums.TipoMassaEnum;

public class JaTemMassaException extends RuntimeException {

    public JaTemMassaException() {
        super("Já tem uma massa definida para esta Pizza!");
    }

    public JaTemMassaException(TipoMassaEnum tipoMassa) {
        super("A massa " + tipoMassa + " já foi definida para esta pizza!");
    }

}
