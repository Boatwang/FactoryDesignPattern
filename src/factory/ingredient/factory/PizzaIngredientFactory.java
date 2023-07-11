package factory.ingredient.factory;

import factory.ingredient.*;

/**
 * @ClassName PizzaIngredientFactory
 * @Description
 * @Author 王春然
 * @Date 2023/7/10 15:08
 **/
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();


}
