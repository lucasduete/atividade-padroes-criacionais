package io.github.lucasduete.padroes.criacionais.abstractfactory;

import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Bateria;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Camera;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Display;

public class FactorySamsung implements AbstractFactory {

    @Override
    public Camera generateCamera() {
        return new Camera(true, 1.7, 2000);
    }

    @Override
    public Display generateDisplay() {
        return new Display(220, "2050x1080", 6);
    }

    @Override
    public Bateria generateBateria() {
        return new Bateria("Apple", 4200);
    }
}
