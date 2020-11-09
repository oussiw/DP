package Factory;

import Entity.*;

public class FactoryElectrique extends AbstractFactory{
    @Override
    public VoitureElectrique creerVoiture() {

        return new VoitureElectrique(1);
    }

    @Override
    public CamionElectrique creerCamion() {

        return new CamionElectrique(3);
    }

    @Override
    public AutocarElectrique creerAutocar() {

        return new AutocarElectrique(5);
    }
}
