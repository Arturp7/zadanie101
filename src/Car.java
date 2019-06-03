public class Car extends Vehicle {

    private boolean airConditioning;

    Car() {

    }

    public Car(String name, double volume, double avgMileage, boolean airConditioning) {
        super(name, volume, avgMileage);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }


//    void carRange() {
//        if (airConditioning ) {
//            double distance = (getVolume() * 100) / (getAvgMileage() + 0.8);
//            System.out.println(("Zasięg pojazdu z włączoną klimatyzacją wynosi  " + distance));
//        } else if (!airConditioning) {
//            System.out.println("Zasięg pojazdu z wyłączoną klimatyzacją wynosi  " + super.range());
//        }
//
//    }

    String carRange1(){
        if(airConditioning){
            double distance = (getVolume() * 100) / (getAvgMileage() + 0.8);
            return "Zasięg pojazdu z włączoną klimatyzacją wynosi  " + distance ;
        } else
          return "Zasięg pojazdu z wyłączoną klimatyzacją wynosi  " + super.range();

    }


}
