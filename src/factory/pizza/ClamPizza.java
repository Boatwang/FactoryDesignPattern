package factory.pizza;

import factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @ClassName ClamPizza
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:25
 **/
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
