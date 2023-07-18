public class Main {
    public static void main(String[] args) {
    int apple = 1893475;
        System.out.println("Значение переменной apple с типом int равно " + apple);
    byte mango = 121;
        System.out.println("Значение переменной mango с типом byte равно " + mango);
    short lemon = 30000;
        System.out.println("Значение переменной lemon с типом short равно " + lemon);
    long orange = 71746368;
        System.out.println("Значение переменной orange с типом long равно " + orange);
    float kiwi = 10.5F;
        System.out.println("Значение переменной kiwi с типом float равно " + kiwi);
    double lime = 300.5D;
        System.out.println("Значение переменной lime с типом double равно " + lime);


        double a = 27.12d;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte s = 67;


        byte lp = 23;
        System.out.println(lp);
        byte as = 27;
        System.out.println(as);
        byte ea = 30;
        System.out.println(ea);
        short paper = 480;
        System.out.println(paper);
        int total= lp+as+ea;
        System.out.println(total);
        int howMany = paper / total;
        System.out.println("На каждого ученика расчитано " + howMany + " листов бумаги");


        byte bottle = 16;
        System.out.println(bottle);
        byte minutes = 2;
        System.out.println(minutes);
        int bt = bottle / minutes;
        System.out.println(bt);
        byte m = 20;
        System.out.println(m);
        short day = 1440;
        System.out.println(day);
        short threeDay = (short) (day * 3);
        System.out.println(threeDay);
        int month = day * 30;
        System.out.println(month);
        int performanceOne = m * bt;
        System.out.println("За 20 минут машина произвела " + performanceOne + " штук бутылок");
        int performanceTwo = day * bt;
        System.out.println("За сутки машина произвела " + performanceTwo + " штук бутылок");
        int performanceThree = threeDay * bt;
        System.out.println("За 3 дня машина произвела " + performanceThree + " штук бутылок");
        int performanceFour = month * bt;
        System.out.println("За 3 дня машина произвела " + performanceFour + " штук бутылок");

        byte banks = 120;
        System.out.println(banks);
        byte white = 2;
        System.out.println(white);
        byte brown = 4;
        System.out.println(brown);
        int dye = white + brown;
        System.out.println(dye);
        byte classes = (byte) (banks / dye);
        System.out.println(classes);
        byte buyB = (byte) (brown * classes);
        System.out.println(buyB);
        byte buyW = (byte) (white * classes);
        System.out.println(buyW);
        System.out.println("В школе где "+ classes + " классов, нужно " + buyW + " банок белой краски и " + buyB + " банок коричневой краски" );


        byte bananas = 80;
        byte milk = 105;
        byte ice = 100;
        byte eggs = 70;
        int bananasR = bananas * 2;
        System.out.println(bananasR);
        int milkR = milk * 2;
        System.out.println(milkR);
        int iceR = ice * 2;
        System.out.println(iceR);
        int eggsR = eggs * 4;
        System.out.println(eggsR);
        int breakfast = bananasR + milkR + iceR + eggsR;
        System.out.println(breakfast + " грамм завтрак");
        float kg = (float) breakfast / 1000;
        System.out.println(kg + " киллограмм завтрак");


        short needLost = 7000;
        short inDay = 250;
        short inDay2 = 500;
        int result = needLost/inDay;
        int result2 = needLost/inDay2;
        System.out.println(result + " дней,если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(result2 + " дней,если спортсмен будет терять каждый день по 500 грамм");
        byte day1 = 14;
        byte day2 = 28;
        int totalDay = day1 + day2;
        int average = totalDay/2;
        System.out.println(average + " день может потребоваться в среднем, чтобы добиться результата похудения");



        int mashaSalary = 67760;
        int percentM = 6776;
        int increasedM = mashaSalary + percentM;
        System.out.println(mashaSalary + " годовой доход Маши");
        int inYearM = increasedM * 12;
        System.out.println(inYearM + " годовой доход Маши после повышения");
        int difference = increasedM - mashaSalary;
        System.out.println("Годовой доход Маши вырос на " + difference + " рублей" );

        int denisSalary =  83690;
        int percentD = 8369;
        int increasedD = denisSalary + percentD;
        System.out.println(denisSalary + " годовой доход Дениса");
        int inYearD = increasedD * 12;
        System.out.println(inYearD + " годовой доход Дениса после повышения");
        int difference2 = increasedD - denisSalary;
        System.out.println("Годовой доход Дениса вырос на " + difference2 + " рублей" );


        int kristinaSalary =  76230;
        int percentK = 7623;
        int increasedK = kristinaSalary + percentK;
        System.out.println(kristinaSalary + " годовой доход Кристины");
        int inYearK = increasedK * 12;
        System.out.println(inYearK + " годовой доход Кристины после повышения");
        int difference3 = increasedK - kristinaSalary;
        System.out.println("Годовой доход Кристины вырос на " +  difference3 + " рублей" );








    }
}