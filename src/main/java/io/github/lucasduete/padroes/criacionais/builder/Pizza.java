package io.github.lucasduete.padroes.criacionais.builder;

import io.github.lucasduete.padroes.criacionais.builder.enums.IngrendienteEnum;
import io.github.lucasduete.padroes.criacionais.builder.enums.TipoMassaEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {

    private TipoMassaEnum tipoMassa;
    private List<IngrendienteEnum> ingredientes;

    public Pizza(TipoMassaEnum tipoMassa) {
        this.tipoMassa = tipoMassa;
        this.ingredientes = new ArrayList<>();
    }

    public Pizza(TipoMassaEnum tipoMassa, List<IngrendienteEnum> ingredientes) {
        this.tipoMassa = tipoMassa;
        this.ingredientes = ingredientes;
    }

    public void adicionarIngrediente(IngrendienteEnum ingrendiente) {
        this.ingredientes.add(ingrendiente);
    }

    public List<IngrendienteEnum> recuperarIngredientes() {
        return Collections.unmodifiableList(ingredientes);
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("tipoMassa=").append(tipoMassa);
        sb.append(", ingredientes=").append(ingredientes);
        sb.append('}');
        return sb.toString();
    }
}
