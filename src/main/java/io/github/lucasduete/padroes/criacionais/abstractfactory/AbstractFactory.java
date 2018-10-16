package io.github.lucasduete.padroes.criacionais.abstractfactory;

import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Bateria;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Camera;
import io.github.lucasduete.padroes.criacionais.abstractfactory.models.Display;

public interface AbstractFactory {

    public Camera generateCamera();
    public Display generateDisplay();
    public Bateria generateBateria();
}
