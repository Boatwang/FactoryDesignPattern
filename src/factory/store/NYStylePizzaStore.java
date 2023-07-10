package factory.store;

import factory.PizzaStore;
import factory.ingredient.factory.NYPizzaIngredientFactory;
import factory.ingredient.factory.PizzaIngredientFactory;
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

    public Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
        }
        return pizza;

    }


}
