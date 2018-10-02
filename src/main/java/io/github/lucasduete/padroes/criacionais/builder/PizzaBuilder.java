package io.github.lucasduete.padroes.criacionais.builder;

import io.github.lucasduete.padroes.criacionais.builder.enums.IngrendienteEnum;
import io.github.lucasduete.padroes.criacionais.builder.enums.TipoMassaEnum;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private TipoMassaEnum tipoMassa;
    private List<IngrendienteEnum> ingredientes;

    public PizzaBuilder() {
        tipoMassa = null;
        this.ingredientes = new ArrayList<>();
    }

    public PizzaBuilder comMassaPan() {
        this.tipoMassa = TipoMassaEnum.Pan;
        return this;
    }

    public PizzaBuilder comMassaTradicional() {
        this.tipoMassa = TipoMassaEnum.Tradicional;
        return this;
    }

    public PizzaBuilder comAzeitora() {
        this.ingredientes.add(IngrendienteEnum.Azeitona);
        return this;
    }

    public PizzaBuilder comBacon() {
        this.ingredientes.add(IngrendienteEnum.Bacon);
        return this;
    }

    public PizzaBuilder comMussarela() {
        this.ingredientes.add(IngrendienteEnum.Mussarela);
        return this;
    }

    public PizzaBuilder comTomate() {
        this.ingredientes.add(IngrendienteEnum.Tomate);
        return this;
    }

    public PizzaBuilder comManjericão() {
        this.ingredientes.add(IngrendienteEnum.Manjericão);
        return this;
    }

    public PizzaBuilder comCalabresa() {
        this.ingredientes.add(IngrendienteEnum.Calabresa);
        return this;
    }

    public Pizza build() {
        return new Pizza(this.tipoMassa, this.ingredientes);
    }
}
