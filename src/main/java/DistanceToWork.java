public class DistanceToWork {
    public static void main(String[] args) {
        final int Distance_From_Home_To_Office = 15; //расстояние от дома до офиса
        double averageSpeedTaxi = 60.0;
        final double Evening_Speed_Reduction = 1.5; // коэффицент снижения скорости транспорта вечером
        double testerTravelTimeToOffice = Distance_From_Home_To_Office / averageSpeedTaxi;  //время в пути тестировщика в офис из дома
        double testerTravelTimeToHome = testerTravelTimeToOffice * Evening_Speed_Reduction;
        float testerTravelTimeToOfficeFloat = (float) testerTravelTimeToOffice; //приведение данных к типу float
        float testerTravelTimeToHomeFloat = (float) testerTravelTimeToHome;

        System.out.println("Расстояние от дома до работы - " + Distance_From_Home_To_Office + " км.");
        System.out.println("Средняя скорость такси - " + averageSpeedTaxi + " км/ч.");
        System.out.println("Коэффицент снижения скорости транспорта в вечернее время на - " + Evening_Speed_Reduction);
        System.out.println("Время в дороге от дома к офису - " + testerTravelTimeToOfficeFloat + " часа.");
        System.out.println("Время пути тестировщика с работы до дома - " + testerTravelTimeToHomeFloat + " часа.");
    }
}