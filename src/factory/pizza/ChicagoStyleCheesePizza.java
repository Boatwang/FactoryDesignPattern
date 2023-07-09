package factory.pizza;

/**
 * @ClassName ChicagoStyleCheesePizza
 * @Description
 * @Author 王春然
 * @Date 2023/7/7 15:38
 **/
public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
