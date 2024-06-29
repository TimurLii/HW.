package HW;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main1 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Timur Lii", 27, "894635257490", Gender.MALE );
        Costumer costumer2 = new Costumer("Jon Wik", 22, "894656757490",Gender.MALE);
        Costumer costumer3 = new Costumer("Elena Vorobey", 42, "894656123490",Gender.FEMALE);

        Costumer[] costumersList = {costumer1, costumer2, costumer3};

        congratulation(costumersList);

    }
    public static void congratulation( Costumer[] costumerList){
        String todayDate = new SimpleDateFormat("dd.MM").format(Calendar.getInstance().getTime());
        for(Costumer costumer: costumerList){
            if(todayDate.equals(Holiday.NEWYEAR.getDate())){
                System.out.println("Happy New Year!! " + costumer.getFullName());
            }
            if((costumer.getGender() == Gender.FEMALE )&& (todayDate.equals(Holiday.WOMENS_DAY.getDate()))){
                System.out.println("Happy International Women's Day!! " + costumer.getFullName());
            }
            if(costumer.getGender() == Gender.MALE&& (todayDate.equals(Holiday.MENS_DAY.getDate()))){
                System.out.println("Happy Defender of the Fatherland Day!! " + costumer.getFullName());
            }

        }
    }
}