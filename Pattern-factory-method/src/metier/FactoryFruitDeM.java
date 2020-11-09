package metier;

public class FactoryFruitDeM extends PizzaFactory{
    @Override
    public Pizza creerPizza() {
        return new FruitdeM();
    }
}
