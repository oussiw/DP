package service;

import metier.Pizza;
import metier.PizzaFactory;

public class Pizzeria {

    private PizzaFactory myFactory;

    public Pizzeria(PizzaFactory factory){
        myFactory = factory;
    }

    public Pizza commander(){
        return myFactory.donnerpizza();
    }

    public void setMyFactory(PizzaFactory myFactory) {
        this.myFactory = myFactory;
    }
}
