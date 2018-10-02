package io.github.lucasduete.padroes.criacionais.builder;

import io.github.lucasduete.padroes.criacionais.builder.enums.IngrendienteEnum;
import io.github.lucasduete.padroes.criacionais.builder.enums.TipoMassaEnum;
import io.github.lucasduete.padroes.criacionais.builder.exceptions.JaTemMassaException;
import io.github.lucasduete.padroes.criacionais.builder.exceptions.LimiteIngredientesAlcançadadoException;
import io.github.lucasduete.padroes.criacionais.builder.exceptions.MassaNãoDefinidaException;
import io.github.lucasduete.padroes.criacionais.builder.exceptions.NãoTemIngredientesException;

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
        if (tipoMassa != null) throw new JaTemMassaException(this.tipoMassa);

        this.tipoMassa = TipoMassaEnum.Pan;
        return this;
    }

    public PizzaBuilder comMassaTradicional() {
        if (tipoMassa != null) throw new JaTemMassaException(this.tipoMassa);

        this.tipoMassa = TipoMassaEnum.Tradicional;
        return this;
    }

    public PizzaBuilder comAzeitora() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Azeitona);
        return this;
    }

    public PizzaBuilder comBacon() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Bacon);
        return this;
    }

    public PizzaBuilder comMussarela() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Mussarela);
        return this;
    }

    public PizzaBuilder comTomate() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Tomate);
        return this;
    }

    public PizzaBuilder comManjericão() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Manjericão);
        return this;
    }

    public PizzaBuilder comCalabresa() {
        verificaListaIngredientes();

        this.ingredientes.add(IngrendienteEnum.Calabresa);
        return this;
    }

    public Pizza build() {
        if (this.tipoMassa == null) throw new MassaNãoDefinidaException();
        if (ingredientes.size() == 0) throw new NãoTemIngredientesException();

        return new Pizza(this.tipoMassa, this.ingredientes);
    }

    private void verificaListaIngredientes() {
        if (ingredientes.size() == 6)
            throw new LimiteIngredientesAlcançadadoException();
    }
}
