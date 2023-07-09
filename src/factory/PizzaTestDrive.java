package factory;

import factory.pizza.Pizza;
import factory.store.ChicagoStylePizzaStore;
import factory.store.NYStylePizzaStore;

/**
 * @ClassName PizzaTestDrive
 * @Description
 * @Author 王春然
 * @Date 2023/7/7 16:38
 **/
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
