package factory.pizza;

import factory.ingredient.Cheese;
import factory.ingredient.Clams;
import factory.ingredient.Dough;
import factory.ingredient.factory.ChicagoPizzaIngredientFactory;

/**
 * @ClassName ChicagoStyleCheesePizza
 * @Description
 * @Author 王春然
 * @Date 2023/7/7 15:38
 **/
public class ChicagoStyleCheesePizza extends Pizza{

    private Cheese cheese;
    private Dough dough;
    private Clams clams;

    public ChicagoStyleCheesePizza(){


    }

    @Override
    public void prepare() {
        ChicagoPizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.clams = ingredientFactory.createClams();

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
