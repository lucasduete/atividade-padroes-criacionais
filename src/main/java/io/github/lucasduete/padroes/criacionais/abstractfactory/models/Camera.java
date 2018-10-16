package io.github.lucasduete.padroes.criacionais.abstractfactory.models;

public class Camera {

    public Boolean temFlash;
    public Double aberturaLente;
    public Integer quantidadePixeis;

    public Camera() {

    }

    public Camera(Boolean temFlash, Double aberturaLente, Integer quantidadePixeis) {
        this.temFlash = temFlash;
        this.aberturaLente = aberturaLente;
        this.quantidadePixeis = quantidadePixeis;
    }

    public Boolean getTemFlash() {
        return temFlash;
    }

    public void setTemFlash(Boolean temFlash) {
        this.temFlash = temFlash;
    }

    public Double getAberturaLente() {
        return aberturaLente;
    }

    public void setAberturaLente(Double aberturaLente) {
        this.aberturaLente = aberturaLente;
    }

    public Integer getQuantidadePixeis() {
        return quantidadePixeis;
    }

    public void setQuantidadePixeis(Integer quantidadePixeis) {
        this.quantidadePixeis = quantidadePixeis;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera camera = (Camera) o;

        if (!temFlash.equals(camera.temFlash)) return false;
        if (!aberturaLente.equals(camera.aberturaLente)) return false;
        return quantidadePixeis.equals(camera.quantidadePixeis);
    }

    @Override
    public int hashCode() {

        int result = temFlash.hashCode();
        result = 31 * result + aberturaLente.hashCode();
        result = 31 * result + quantidadePixeis.hashCode();
        return result;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("temFlash=").append(temFlash);
        sb.append(", aberturaLente=").append(aberturaLente);
        sb.append(", quantidadePixeis=").append(quantidadePixeis);
        sb.append('}');
        return sb.toString();
    }
}
