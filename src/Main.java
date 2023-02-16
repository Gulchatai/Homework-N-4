public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int ageFather = 35;
        int ageSоn = 15;
        if (ageFather >= 18)
            System.out.println("Если возраст человека равен " + ageFather + ", то он совершеннолетний");
        if (ageSоn < 18)
            System.out.println("Если возраст человека равен " + ageSоn +
                    ", то не достиг совершеннолетия, нужно немного подождать.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature1 = 10;
        int temperature2 = -3;
        if (temperature1 > 5) {
            System.out.println("На улице " + temperature1 + " можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature1 + " нужно надеть шапку");
        }
        if (temperature2 < 5) {
            System.out.println("На улице " + temperature2 + " нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature2 + " можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed1 = 30;
        int speed2 = 90;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно");
        }
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("На улице " + speed2 + " можно идти без шапки");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 30;
       if (age >= 2 && age <= 6) {
           System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
       }  else if (age >= 7 && age <= 18) {
          System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 19 && age <= 24) {
          System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 25) {
          System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
       }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageBaby = 15;
         if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на аттракционе");
        } else if (ageBaby >= 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то он может кататься на аттракционе в сопровождении");
        } else if (ageBaby >= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то он может кататься на аттракционе без сопровождения");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberOfSeats = 102;
        int seatsWithChairs = 60;
        int seatsWithOutChairs = numberOfSeats - seatsWithChairs;
        int numberSeats = 40;
        int numberWithOutSeats = 25;
        if (numberSeats + numberWithOutSeats > numberOfSeats) {
            System.out.println("Вагон полностью забит");
        }
        if (numberSeats > seatsWithChairs) {
            System.out.println("В вагоне не осталось сидячих мест");
        } else if (seatsWithChairs - numberSeats > 0) {
        System.out.println("В вагоне осталось " + (seatsWithChairs - numberSeats) + " сидячих мест");
        }
        if (numberWithOutSeats > seatsWithOutChairs) {
            System.out.println("В вагоне не осталось  стоячих мест");
        } else if (seatsWithOutChairs - numberWithOutSeats > 0) {
            System.out.println("В вагоне осталось " + (seatsWithOutChairs - numberWithOutSeats) + " стоячих мест");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 2000;
        int two = 100;
        int three = 1000;
        if (one > two) {
            if (one > three) {
                System.out.println(one + " - максимальное число");
            } else {
                System.out.println(three + " - максимальное число");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println(two + " - максимальное число");
            } else {
                System.out.println(three + " - максимальное число");
                   }
            } else
                if (one > three) {
                    System.out.println(one + " - максимальное число");
            } else {
                    System.out.println(three + " - максимальное число");
        }
    }
}
