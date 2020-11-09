package Factory;

import Entity.*;

import java.util.List;

public abstract class AbstractFactory {

    public abstract Voiture creerVoiture();
    public abstract Camion creerCamion();
    public abstract Autocar creerAutocar();
}
