package factory.store;

import factory.PizzaStore;
import factory.ingredient.factory.ChicagoPizzaIngredientFactory;
import factory.ingredient.factory.PizzaIngredientFactory;
import factory.pizza.*;

/**
  * @ClassName ChicagoStylePizzaStore
  * @Description
  * @Author 王春然
  * @Date 2023/7/7 15:34
**/
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
