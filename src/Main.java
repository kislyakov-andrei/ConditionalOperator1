public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int age1 = 21; // variant 1
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ",то он совершеннолетний");
        }
        if (age1<18) {
            System.out.println("Если возраст человека равен " + age1+ ",то он не достиг совершеннолетия, нужно немного подождать");
        }
        int age2 = 15; // variant 2
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ",то он совершеннолетний");
        }
        if (age2<18) {
            System.out.println("Если возраст человека равен "+age2+",то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Task 2
        System.out.println("Task 2");
        int temperature1=2; // variant 1
        int temperature2=10; // variant 2
        if (temperature1<5) {
            System.out.println("На улице "+temperature1+" градусов, нужно надеть шапку");
        }
        if (temperature1>=5) {
            System.out.println("На улице "+temperature1+" градусов, можно идти без шапки");
        }
        if (temperature2<5) {
            System.out.println("На улице "+temperature2+" градусов, нужно надеть шапку");
        }
        if (temperature2>=5) {
            System.out.println("На улице "+temperature2+" градусов, можно идти без шапки");
        }
        // Task 3
    }
}