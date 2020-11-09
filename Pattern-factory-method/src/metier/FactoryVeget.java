package metier;

public class FactoryVeget extends PizzaFactory{
    @Override
    public Pizza creerPizza() {
        return new Veget();
    }
}
