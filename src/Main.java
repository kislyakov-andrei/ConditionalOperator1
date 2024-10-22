public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int age1 = 21; // variant 1
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ",то он совершеннолетний.");
        }
        if (age1<18) {
            System.out.println("Если возраст человека равен " + age1+ ",то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int age2 = 15; // variant 2
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ",то он совершеннолетний.");
        }
        if (age2<18) {
            System.out.println("Если возраст человека равен "+age2+",то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Task 2
        System.out.println("Task 2");
        int temperature1=2; // variant 1
        int temperature2=10; // variant 2
        if (temperature1<5) {
            System.out.println("На улице "+temperature1+" градусов, нужно надеть шапку.");
        }
        if (temperature1>=5) {
            System.out.println("На улице "+temperature1+" градусов, можно идти без шапки.");
        }
        if (temperature2<5) {
            System.out.println("На улице "+temperature2+" градусов, нужно надеть шапку.");
        }
        if (temperature2>=5) {
            System.out.println("На улице "+temperature2+" градусов, можно идти без шапки.");
        }
        // Task 3
        System.out.println("Task 3");
        int speed1=61; // variant 1
        int speed2=50; // variant 2
        if (speed1>=60) {
            System.out.println("Если скорость "+speed1+", то придется заплатить штраф.");
        }
        if (speed1<60) {
            System.out.println("Если скорость "+speed1+", то можно ездить спокойно.");
        }
        if (speed2>=60) {
            System.out.println("Если скорость "+speed2+", то придется заплатить штраф.");
        }
        if (speed2<60) {
            System.out.println("Если скорость "+speed2+", то можно ездить спокойно.");}
        // Task 4
        System.out.println("Task 4");
        int age3=3; // variant for first age
        int age4=12; //variant for second age
        int age5=20; // variant for third age
        int age6=25; // variant for fourth age
        if (age3>2 && age3<=6)
        {
            System.out.println("Если возраст человека равен "+age3+", то ему нужно ходить в детский сад.");}
        if (age4>6 && age4<=17)
        { System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в школу.");}
        if (age5>17 && age5<=24) {
            System.out.println("Если возраст человека равен "+age5+", то ему нужно ходить в университет.");}
        if (age6>24)        {
            System.out.println("Если возраст человека равен "+age6+", то ему пора ходить на работу.");}


    }
}