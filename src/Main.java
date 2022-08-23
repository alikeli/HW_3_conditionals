public class Main {
    public static void main(String[] args) {

        //Task 1

      int clientOS = 0; // 0 — iOS, 1 — Android.
      if (clientOS == 0) {
          System.out.println("Установите версию приложения для iOS по ссылке");
      } else if (clientOS == 1) {
          System.out.println("Установите версию приложения для Android по ссылке");
      }

        //Task 2

        int clientOS1 = 0; // 0 — iOS, 1 — Android.
        int clientDeviceYear = 2017;

        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
                    }
        else if (clientOS1 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 3
        //высокосный делится на 4 без остатка, на 400 без остатка
        // на 100 не высокосный, кроме 400 800 и тд

         double year = 1203;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println( (int) year + " год является високосным");
            } else {
            System.out.println((int) year + " год не является високосным");
        }

        //Task 4

        int deliveryDistance = 100;

        if (deliveryDistance <= 20){ //диапазон доставки
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){  //диапазон доставки
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {  //диапазон доставки
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        //Task 5
        int monthNumber = 13;  //Номер месяца в году

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не существует ");
                break;
        }


        //Task 6
        int age = 24;
        int salary = 90000;

        if (age < 23  && salary <= 50000 ) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary*2) + " рублей");
        } else if (age < 23  && salary >= 50000 && salary < 80000 ) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей");
        } else if (age < 23  && salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей");
        } else if (age >= 23  && salary <= 50000 ) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        } else if (age >= 23  && salary >= 50000 && salary < 80000 ) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей");
        } else if (age >= 23 && salary >= 80000 ) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей");
        }




  }
  }


