package factory.ingredient.factory;

import factory.ingredient.*;
import factory.pizza.*;

/**
 * @ClassName NYPizzaIngredientFactory
 * @Description
 * @Author 王春然
 * @Date 2023/7/10 15:17
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{



    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()}
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
