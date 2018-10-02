package io.github.lucasduete.padroes.criacionais.builder.exceptions;

public class NãoTemIngredientesException extends RuntimeException {

    public NãoTemIngredientesException() {
        super("Não é possível construir uma pizza de massa");
    }

}
