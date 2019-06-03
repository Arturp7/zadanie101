public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 50, 7, false);
        Car car2 = new Car("Audi", 60, 5, false);
        //car1.carRange();
        //car2.carRange();
        Truck truck1 = new Truck("Volvo", 100, 15, false, 100);
        Truck truck2 = new Truck("MAN", 150, 20, false, 200);
        // truck1.carRange();
        //truck1.setAirConditioning(false);
        //truck1.carRange();

        Car[] cars = new Car[4];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = truck1;
        cars[3] = truck2;

        for (Car tmp : cars) {
            System.out.print(tmp.getName() + " " + tmp.getVolume() + " " + tmp.getAvgMileage() + " "
                    + tmp.isAirConditioning() + " ");
            tmp.carRange();
        }
        System.out.println("Włączanie klimatyzacji w pojazdach");
        car1.setAirConditioning(true);
        car2.setAirConditioning(true);
        truck1.setAirConditioning(true);
        truck2.setAirConditioning(true);


        for (Car tmp : cars) {
            System.out.print(tmp.getName() + " " + tmp.getVolume() + " " + tmp.getAvgMileage() + " "
                    + tmp.isAirConditioning() + " ");
            tmp.carRange();
        }

    }
}
