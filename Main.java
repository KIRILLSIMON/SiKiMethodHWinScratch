import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("MethodLesson- ask to Task1/R-e Z1 of MethodLes by SiKir");
        int year = 2022;
        System.out.println("MethodLesson- ask to Task1/R-e Z1 of MethodLes by SiKir");
        boolean leapYear = isleapyear(year);
        printYearInfo(year, leapYear);

        int clientOS = 0;
        int productionYear = 2012;
        printInfoAboutDevice(clientOS, productionYear);


        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("надо дней " + deliveryDays);
    }



    private static int calculateDeliveryDays(int deliveryDistance) {
        System.out.println("Import code from z4 UO p.2");
        int deliveryDays = 1;
        int startInterval = 20;
        int interval = 40;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }


    private static String getOsByType(int type) {
        if (type == 1) {
            return "Android";
        } else if (type==0){
            return "iOS";
        }else {
            return "unknown";
        }
    }
    private static String getTypeOsVersion(int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear == currentYear) {
            return "обычную";
        }else{
            return "lite";
        }
    }
    private static void printInfoAboutDevice(int type,int productionYear) {
        String os=getOsByType(type);
        String typeOfVersion=getTypeOsVersion(productionYear);
        System.out.println("установи "+typeOfVersion+" версию приложения для "+os);
    }

    private static boolean isleapyear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printYearInfo(int year, boolean leapYear){
        if (leapYear){
            System.out.println("Год "+year+ " -високосный");
        }else {
            System.out.println("Год "+year+ " -НЕвисокосный");
        }

    }
}
