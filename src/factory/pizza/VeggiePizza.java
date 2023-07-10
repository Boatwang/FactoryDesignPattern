package factory.pizza;

import factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @ClassName VeggiePizza
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:26
 **/
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
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
