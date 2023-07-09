package factory.store;

import factory.PizzaStore;
import factory.pizza.*;

/**
 * @ClassName NYStylePizzaStore
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 15:10
 **/
public class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore() {

    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
