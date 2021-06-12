package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiicontrolflow;

public class Exercitiu6 {

    public static void main(String[] args) {
        int dayOfTheWeek = 6;
        boolean holiday = true;
        if (dayOfTheWeek>1&&dayOfTheWeek<=5||!holiday){
            System.out.println("Wake up at 7:00");
        }else if (dayOfTheWeek==6 || dayOfTheWeek==7 ||holiday){
            System.out.println("Sleep in!");
        }
        System.out.println("--------------");

    int week=11;
    String schedule;
        switch (week){
        case 1: schedule="Monday: Gym in the morning.";
            break;
        case 2: schedule="Tuesday: Class after work.";
            break;
        case 3: schedule="Wednesday: Meetings all day.";
            break;
        case 4: schedule="Thursday: Work from home.";
            break;
        case 5: schedule="Friday: Game night after work.";
            break;
        case 6: schedule="Saturday: Free!";
            break;
        case 7: schedule="Sunday: Free!";
            break;
        default: schedule="Such week day doesn't exist!";
            break;
    }
        System.out.println(schedule);
}

}