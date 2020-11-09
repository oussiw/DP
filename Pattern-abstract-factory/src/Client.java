import Factory.AbstractFactory;
import Factory.FactoryElectrique;
import Factory.FactoryHybride;

public class Client {
    public static void main(String[] args) {

        AbstractFactory factory = new FactoryElectrique();
        System.out.println(factory.creerVoiture().getInfo());
        System.out.println(factory.creerCamion().getInfo());
        System.out.println(factory.creerAutocar().getInfo());
        factory = new FactoryHybride();

        System.out.println(factory.creerVoiture().getInfo());
        System.out.println(factory.creerCamion().getInfo());
        System.out.println(factory.creerAutocar().getInfo());

    }
}
