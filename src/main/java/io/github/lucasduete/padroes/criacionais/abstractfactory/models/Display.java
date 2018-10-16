package io.github.lucasduete.padroes.criacionais.abstractfactory.models;

public class Display {

    public Integer dpi;
    public String resolucao;
    public Integer polegadas;

    public Display() {

    }

    public Display(Integer dpi, String resolucao, Integer polegadas) {
        this.dpi = dpi;
        this.resolucao = resolucao;
        this.polegadas = polegadas;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Integer getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(Integer polegadas) {
        this.polegadas = polegadas;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Display display = (Display) o;

        if (!dpi.equals(display.dpi)) return false;
        if (!resolucao.equals(display.resolucao)) return false;
        return polegadas.equals(display.polegadas);
    }

    @Override
    public int hashCode() {

        int result = dpi.hashCode();
        result = 31 * result + resolucao.hashCode();
        result = 31 * result + polegadas.hashCode();
        return result;
    }

    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Display{");
        sb.append("dpi=").append(dpi);
        sb.append(", resolucao='").append(resolucao).append('\'');
        sb.append(", polegadas=").append(polegadas);
        sb.append('}');
        return sb.toString();
    }
}
