package Factory;

import Entity.*;

public class FactoryHybride extends AbstractFactory{
    @Override
    public Voiture creerVoiture() {
        return new VoitureHybride(2);
    }

    @Override
    public Camion creerCamion() {
        return new CamionHybride(4);
    }

    @Override
    public Autocar creerAutocar() {
        return new AutocarHybride(6);
    }
}
