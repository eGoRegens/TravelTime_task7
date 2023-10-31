public class DistanceToWork {
    public static void main(String[] args) {
        final int DISTANCE_FROM_HOME_TO_OFFICE = 15; //расстояние от дома до офиса
        final double AVERAGE_SPEED_TAXI = 60.0;
        final double EVENING_SPEED_REDUCTION = 1.5; // коэффицент снижения скорости транспорта вечером
        final double TESTER_TRAVEL_TIME_TO_OFFICE = DISTANCE_FROM_HOME_TO_OFFICE / AVERAGE_SPEED_TAXI;  //время в пути тестировщика в офис из дома
        final double TESTER_TRAVEL_TIME_TO_HOME = TESTER_TRAVEL_TIME_TO_OFFICE * EVENING_SPEED_REDUCTION;
        final float TESTER_TRAVEL_TIME_TO_OFFICE_FLOAT = (float) TESTER_TRAVEL_TIME_TO_OFFICE; //приведение данных к типу float
        final float TESTER_TRAVEL_TIME_TO_HOME_FLOAT = (float) TESTER_TRAVEL_TIME_TO_HOME;

        System.out.println("Расстояние от дома до работы - " + DISTANCE_FROM_HOME_TO_OFFICE + " км.");
        System.out.println("Средняя скорость такси - " + AVERAGE_SPEED_TAXI + " км/ч.");
        System.out.println("Коэффицент снижения скорости транспорта в вечернее время на - " + EVENING_SPEED_REDUCTION);
        System.out.println("Время в дороге от дома к офису - " + TESTER_TRAVEL_TIME_TO_OFFICE_FLOAT + " часа.");
        System.out.println("Время пути тестировщика с работы до дома - " + TESTER_TRAVEL_TIME_TO_HOME_FLOAT + " часа.");
    }
}