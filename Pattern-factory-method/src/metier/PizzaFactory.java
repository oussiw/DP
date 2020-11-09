package metier;

public abstract class  PizzaFactory {

    public Pizza donnerpizza(){
        return this.creerPizza();
    }
    protected abstract Pizza creerPizza();
}
