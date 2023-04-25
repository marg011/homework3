package ru.skyeng;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int bananas = 4;
        System.out.println("The value of variable bananas with type int is equal to " + bananas);
        byte apples = 127;
        System.out.println("The value of variable apples with type byte is equal to " + apples);
        short oranges = 100;
        System.out.println("The value of variable oranges with type short is equal to " + oranges);
        long kiwis = 23L;
        System.out.println("The value of variable kiwis with type long is equal to " + kiwis);
        double seedsWeight = 1.2;
        System.out.println("The value of variable seedsWeight with type double is equal to " + seedsWeight);
        float sugarWeight = 3;
        System.out.println("The value of variable sugarWeight with type float is equal to " + sugarWeight);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        short g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short paperNumber = 480;
        int allStudents = lpStudents + asStudents + eaStudents;
        double paperStudent = paperNumber / allStudents;
        System.out.println(paperStudent + " sheets of paper are allocated for each student");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte product2min = 16;
        int product1min = product2min  / 2;
        int product20min = product1min * 20;
        System.out.println("The machine produced " + product20min + " bottles for 20 minutes");
        int productDay = product1min * 1440;
        System.out.println("The machine produced " + productDay + " bottles for 1 day");
        int product3days = productDay * 3;
        System.out.println("The machine produced " + product3days + " bottles for 3 days");
        int productMonth = productDay * 30;
        System.out.println("The machine produced " + productMonth + " bottles for 1 month");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short allTins = 120;
        short whiteTins1room = 2;
        short brownTins1room = 4;
        int tins1room = whiteTins1room + brownTins1room;
        int rooms = allTins / tins1room;
        int whiteTins = rooms * whiteTins1room;
        int brownTins = rooms * brownTins1room;
        System.out.println("For school where " + rooms + " rooms, "  + whiteTins +
                " tins of white paint and " + brownTins + " tins of brown tins are needed.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        short bananaGrams = 80;
        byte milk = 2;
        short milkGrams = 105;
        byte iceCream = 2;
        short iceCreamGrams = 100;
        byte eggs = 4;
        short eggGrams = 70;
        int breakfastGrams = bananas * bananaGrams + milk * milkGrams + iceCream * iceCreamGrams +
                eggs * eggGrams;
        double breakfastKg = breakfastGrams / 1000;
        System.out.println("The breakfast weighs " + breakfastGrams+ " grams or " + breakfastKg+ " kg");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightLossWhole = 7;
        short weightLossDay250 = 250;
        short weightLossDay500 = 500;
        double days250 = (7 * 1000) / 250;
        double days500 = (7 * 1000)/ 500;
        System.out.println(days250 + " days are required to loose 7kg if sportsman will loose 250 grams per day and " + days500 + " days are required to loose 7kg if sportsman will loose 500 grams per day.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        double raise = 0.1;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaRaisedSal = mashaSalary + mashaSalary * raise;
        double mashaDiffIncome = (mashaRaisedSal - mashaSalary) * 12;
        System.out.println("Masha earns " + mashaRaisedSal + " rubles per month. Her annual income increased " + mashaDiffIncome + " rubles.");
        double denisRaisedSal = denisSalary + denisSalary * raise;
        double denisDiffIncome = (denisRaisedSal - denisSalary) * 12;
        System.out.println("Denis earns " + denisRaisedSal + " rubles per month. His annual income increased " + denisDiffIncome + " rubles.");
        double kristinaRaisedSal = kristinaSalary + kristinaSalary * raise;
        double kristinaDiffIncome = (kristinaRaisedSal - kristinaSalary) * 12;
        System.out.println("Kristina earns " + kristinaRaisedSal + " rubles per month. Her annual income increased " + kristinaDiffIncome + " rubles.");
    }
}