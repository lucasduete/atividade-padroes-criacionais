package io.github.lucasduete.padroes.criacionais.builder.exceptions;

public class LimiteIngredientesAlcançadadoException extends RuntimeException {

    public LimiteIngredientesAlcançadadoException() {
        super("O limite de 6 ingredientes foi alcançado para esta pizza, não é possivel construir uma pizzão tão exagerada");
    }

}
