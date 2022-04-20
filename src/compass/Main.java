package compass;

public class Main {
    public static void goda(int year) {
        //заданиие 1
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("god " + year + " visikosn");
        } else {
            System.out.println("god " + year + " nevisikosn");
        }
    }
    public static void main(String[] args) {
        goda(2027);
        versiya(0  ,1);
        delivery(80,1);

    }
    public static void versiya(int ios  ,int android) {
        if ( android == 1 &&  android < 2022) {
        }
        System.out.println("ustanovite oblegchenversiy prilozhenia dly android po ssulke");
        if ( android == 1 &&  android == 2022) {
        }
        System.out.println("ustanovite  prilozhenia dly android po ssulke");
        if (ios == 1 && ios < 2022) {
        }
        System.out.println("ustanovite oblegchenversiy prilozhenia dly ios po ssulke");
        if (ios == 1 && ios == 2022) {
        }
        System.out.println("ustanovite  prilozhenia dly ios po ssulke");
    }
    public static void delivery(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <=20) {
            System.out.println(" dostavka zaimet dnei " + deliveryDays);
        } else if (deliveryDistance >20 && deliveryDistance <=60) {
            System.out.println(" dostavka zaimet dnei " + (deliveryDays + 1));
        } else if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println(" dostavka zaimet dnei " + (deliveryDays + 2));
        } else {
            System.out.println(" daleko ");
        }
    }
    }





