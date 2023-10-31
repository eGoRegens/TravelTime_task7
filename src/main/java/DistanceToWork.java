public class DistanceToWork {
    public static void main(String[] args) {
        final int distanceFromHomeToOffice = 15; //расстояние от дома до офиса
        final double averageSpeedTaxi = 60.0;
        final double eveningSpeedReduction = 1.5; // коэффицент снижения скорости транспорта вечером
        final double testerTravelTimeToOffice = distanceFromHomeToOffice / averageSpeedTaxi;  //время в пути тестировщика в офис из дома
        final double testerTravelTimeToHome = testerTravelTimeToOffice * eveningSpeedReduction;
        final float testerTravelTimeToOfficeFloat = (float) testerTravelTimeToOffice; //приведение данных к типу float
        final float testerTravelTimeToHomeFloat = (float) testerTravelTimeToHome;

        System.out.println("Расстояние от дома до работы - " + distanceFromHomeToOffice + " км.");
        System.out.println("Средняя скорость такси - " + averageSpeedTaxi + " км/ч.");
        System.out.println("Коэффицент снижения скорости транспорта в вечернее время на - " + eveningSpeedReduction);
        System.out.println("Время в дороге от дома к офису - " + testerTravelTimeToOfficeFloat + " часа.");
        System.out.println("Время пути тестировщика с работы до дома - " + testerTravelTimeToHomeFloat + " часа.");
    }
}