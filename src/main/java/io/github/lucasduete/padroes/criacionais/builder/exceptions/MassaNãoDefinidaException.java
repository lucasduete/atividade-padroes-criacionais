package io.github.lucasduete.padroes.criacionais.builder.exceptions;

public class MassaNãoDefinidaException extends RuntimeException {

    public MassaNãoDefinidaException() {
        super("Nenhuma massa foi definida para esta pizza!!11!");
    }

}
