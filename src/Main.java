public class Main {
    public static void main(String[] args) {
        int a = 40000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 22;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 10000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1000000000L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.75f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 3.756893D;
        System.out.println("Значение переменной f с типом double равно " + f);

        float aa = 27.12f;
        long ba = 987678965549L;
        float ca = 2.786f;
        short da = 569;
        short ea = -159;
        short fa = 27897;
        byte ga = 67;

        byte firstClss = 23;
        byte secondClass = 27;
        byte thirdClsss = 30;
        int allStudents = firstClss + secondClass + thirdClsss;
        int allPaper = 480;
        int paperForOneStudent = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");

        byte machineProductivityInTwoMinutes = 16;
        int machineProductivityInOneMinute = machineProductivityInTwoMinutes / 2;
        int machineProductivity_20 = machineProductivityInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + machineProductivity_20 + " штук бутылок");
        int machineProductivityInOneDay = machineProductivityInOneMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + machineProductivityInOneDay + " штук бутылок");
        int machineProductivityInThreeDays = machineProductivityInOneDay * 3;
        System.out.println("За три дня машина произвела " + machineProductivityInThreeDays + " штук бутылок");
        int machineProductivityInOneMonth = machineProductivityInOneDay * 30;
        System.out.println("За месяц машина произвела " + machineProductivityInOneMonth + " штук бутылок");

        byte allColor = 120;
        byte whiteColorOneClass = 2;
        byte brownColorOneClass = 4;
        int oneClass = whiteColorOneClass + brownColorOneClass;
        int quantityClasses = allColor / oneClass;
        int allWhiteColor = whiteColorOneClass * quantityClasses;
        int allBrownColor = brownColorOneClass * quantityClasses;
        System.out.println("В школе, где " + quantityClasses + " классов, нужно " + allWhiteColor + " банок белой краски и " + allBrownColor + " банок коричневой краски");

        byte bananasWheightGr = 80;
        int brBananasWheightGr = bananasWheightGr * 5;
        byte milkWeightGr = 105;
        int brMilkWeightGr = milkWeightGr * 2;
        int brIcecreamWheightGr = 100 * 2;
        byte eggsWheightGr = 70;
        int brEggsWheightGr = eggsWheightGr * 4;
        float breakfastWheightGr = brBananasWheightGr + brMilkWeightGr + brIcecreamWheightGr + brEggsWheightGr;
        System.out.println("Вес такого спортзавтрака составляет " + breakfastWheightGr + " грамм");
        float breakfastWheightKg = breakfastWheightGr / 1000;
        System.out.println("Вес такого спортзавтрака составляет " + breakfastWheightKg + " килограмм");

        byte loseWheightKg = 7;
        int loseWheightGr = loseWheightKg * 1000;
        int numberOfDaysMin = loseWheightGr / 250;
        int numberOfDaysMax = loseWheightGr / 500;
        System.out.println("Всего спортсмену потребуется от " + numberOfDaysMin + " до " + numberOfDaysMax + " дней, чтобы сбросить вес");
    }
}