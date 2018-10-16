package io.github.lucasduete.padroes.criacionais.abstractfactory.models;

public class Bateria {

    public String marca;
    public Integer miliamperes;

    public Bateria() {

    }

    public Bateria(String marca, Integer miliamperes) {
        this.marca = marca;
        this.miliamperes = miliamperes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMiliamperes() {
        return miliamperes;
    }

    public void setMiliamperes(Integer miliamperes) {
        this.miliamperes = miliamperes;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bateria bateria = (Bateria) o;

        if (!marca.equals(bateria.marca)) return false;
        return miliamperes.equals(bateria.miliamperes);
    }

    @Override
    public int hashCode() {

        int result = marca.hashCode();
        result = 31 * result + miliamperes.hashCode();
        return result;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Bateria{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", miliamperes=").append(miliamperes);
        sb.append('}');
        return sb.toString();
    }
}
