public class Main {
    public static void main(String[] args) {
       int age = 22;
       if (age >= 18) {
           System.out.println("Поздравляем, что ты уже совершеннолетний!!!");
       }
       else {
           System.out.println("Возраст совершеннолетия еще не наступил, побудь в сторонке");
       }
       if (age < 7) {
           System.out.println("Ты еще маленький, отдыхай дома");
       }
       if (age >= 7 && age< 18) {
           System.out.println("иди в школу");
       }
       if (age >=18 && age<24) {
           System.out.println("отправляйся в университет");
       }
       if (age>=24) {
           System.out.println("найди работу");
       }
       int capacity = 105;
       int sitPlace = 60;
       int standingRoom = 42;
       if (capacity >102) {
           System.out.println("Мест нет");
       }
       if (capacity <=60) {
           System.out.println("Можете занять сидячие места");
       }
       if (capacity >60 && capacity <=102) {
           System.out.println("Можете занять стоячие места");
       }
       int age1 = 21;
       if (age1 <=2 && age1 >=6) {
           System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
       }
       if (age1 >= 7 && age1<18) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
       if (age1 >= 18 && age1 <24) {
           System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
       }
       if (age1 >=24) {
           System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
       }

       int age2 = 30;
       if (age2 <=5) {
           System.out.println("Ребенок не может кататься на аттракционе");
       }
       else if (age2 >=5 && age2<14) {
               System.out.println("Кататься можно только в присутствии взрослого, либо иди гуляй");
           }
       else {
               System.out.println("Можно кататься без ограничений");
               }
        int one = 74;
        int two = 45;
        int free = -6;
        if (one > two) {
            System.out.println("Максимальное число " + one);
        } else if (two > one) {
            System.out.println("Максимальное число " + two);
        } else if (free > one) {
            System.out.println("Максимальное число " + free);
        } else if (free > two) {
            System.out.println("Максимальное число " + free);
        } else if (two > free) {
            System.out.println("Максимальное число " + two);
        } else if (one > free) {
            System.out.println("Максимальное число " + one);
        }
    }
       }



