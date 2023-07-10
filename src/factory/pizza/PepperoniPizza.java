package factory.pizza;

import factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @ClassName PepperoniPizza
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:25
 **/
public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

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
