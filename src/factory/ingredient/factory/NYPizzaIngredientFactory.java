package factory.ingredient.factory;

import factory.ingredient.*;

/**
 * @ClassName NYPizzaIngredientFactory
 * @Description
 * @Author 王春然
 * @Date 2023/7/10 15:17
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new NYStyleDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYStyleCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYStylePepperoni();
    }

    @Override
    public Clams createClams() {
        return new NYStyleClams();
    }
}
