package io.github.lucasduete.padroes.criacionais.abstractfactory;

import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Bateria;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Camera;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Display;

public class FactoryMotorola implements AbstractFactory {

    @Override
    public Camera generateCamera() {
        return new Camera(false, 2.0, 1470);
    }

    @Override
    public Display generateDisplay() {
        return new Display(220, "1200x720", 4);
    }

    @Override
    public Bateria generateBateria() {
        return new Bateria("Motorola", 6500);
    }
}
