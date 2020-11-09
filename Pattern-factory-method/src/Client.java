import metier.FactoryFromm;
import metier.FactoryFruitDeM;
import metier.FactoryVeget;
import metier.Pizza;
import service.Pizzeria;

public class Client {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria(new FactoryFromm());
        Pizza p = pizzeria.commander();
        System.out.println(p.toString());
        pizzeria.setMyFactory(new FactoryFruitDeM());
        p = pizzeria.commander();
        System.out.println(p.toString());
        pizzeria.setMyFactory(new FactoryVeget());
        p = pizzeria.commander();
        System.out.println(p.toString());

    }
}
