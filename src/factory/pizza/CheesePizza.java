package factory.pizza;

import factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @ClassName CheesePizza
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:24
 **/
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
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
