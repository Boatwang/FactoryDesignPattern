package factory;

import factory.pizza.*;

/**
 * @ClassName SimplePizzaFactory
 * @Description
 * @Author 王春然
 * @Date 2023/6/29 14:20
 **/
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

//        switch (type) {
//            case "cheese":
//                pizza = new CheesePizza();
//                break;
//            case "pepperoni":
//                pizza = new PepperoniPizza();
//                break;
//            case "clam":
//                pizza = new ClamPizza();
//                break;
//            case "veggie":
//                pizza = new VeggiePizza();
//                break;
//        }
        return pizza;
    }
}