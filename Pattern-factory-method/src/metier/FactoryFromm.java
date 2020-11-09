package metier;

public class FactoryFromm extends PizzaFactory{
    @Override
    public Pizza creerPizza() {
        return new Frommage();
    }
}
