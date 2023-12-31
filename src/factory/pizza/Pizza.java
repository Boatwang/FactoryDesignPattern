package factory.pizza;

import factory.ingredient.*;

import java.util.ArrayList;

/**
 * @ClassName Pizza
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:21
 **/
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;



    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
