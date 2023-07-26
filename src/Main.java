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
    }
}