package HW3;

import HW.Costumer;
import HW.Gender;
import HW3.Exeption.AmountException;
import HW3.Exeption.CustomerException;
import HW3.Exeption.ProductException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Timur Lii", 27, "894635257490", Gender.MALE );
        Costumer costumer2 = new Costumer("Jon Wik", 22, "894656757490",Gender.FEMALE);
        Costumer costumer3 = new Costumer("Elena Vorobey", 42, "894656123490",Gender.FEMALE);

        Costumer[] costumersList = {costumer1, costumer2, costumer3};

        Goods goods1 = new Goods("Ball", 130);
        Goods goods2 = new Goods("Сheese", 230);
        Goods goods3 = new Goods("Apple", 90);
        Goods goods4 = new Goods("Banana", 160);
        Goods goods5 = new Goods("Tomato", 223);

        Goods[] goodsList = {goods1, goods2, goods3, goods4, goods5};

        List<Order> orderList = new ArrayList<>(5);


        System.out.println(buy(costumersList[1],goodsList[1],12,costumersList,goodsList));
        System.out.println(buy(costumersList[0],goodsList[2],1,costumersList,goodsList));
//        System.out.println(buy(new Costumer("asdasd",12,"12312313"),goodsList[1],12,costumersList,goodsList));
        System.out.println(buy(costumersList[1],goodsList[4],120,costumersList,goodsList));
        System.out.println(buy(costumersList[1],goodsList[3],-1,costumersList,goodsList));


    }

    public static boolean isInArr(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    public static Order buy(Costumer costumer, Goods goods, int count, Costumer[] costumerList, Goods[] goodsList) {
        if (!isInArr(costumerList, costumer)) {
            throw new CustomerException("Invalid costumer " + costumer);
        }
        if (!isInArr(goodsList, goods)) {
            throw new ProductException("Invalid goods" + goods);
        }
        if (count < 0 || count > 100) {
            throw new AmountException("Invalid count " + count);
        }
        return new Order(costumer, goods, count);
    }

}
