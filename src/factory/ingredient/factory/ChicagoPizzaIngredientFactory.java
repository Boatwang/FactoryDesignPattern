package factory.ingredient.factory;

import factory.ingredient.*;

/**
 * @ClassName ChicagoPizzaIngredientFactory
 * @Description
 * @Author 王春然
 * @Date 2023/7/11 9:13
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoStyle();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoStyleCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoStylePepperoni();
    }

    @Override
    public Clams createClams() {
        return new ChicagoStyleClams();
    }
}
