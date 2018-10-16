package io.github.lucasduete.padroes.criacionais.abstractfactory;

import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Bateria;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Camera;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Display;

public class FactoryApple implements AbstractFactory {

    @Override
    public Camera generateCamera() {
        return new Camera(true, 2.2, 1700);
    }

    @Override
    public Display generateDisplay() {
        return new Display(127, "1240x720", 5);
    }

    @Override
    public Bateria generateBateria() {
        return new Bateria("Apple", 3400);
    }
    
}
