public class Truck extends Car{
  private double load;
  private double distance;

  Truck(){

  }

    public Truck(String name, double volume, double avgMileage, boolean airConditioning, double load) {
        super(name, volume, avgMileage, airConditioning);
        this.load = load;


    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }


//    void carRange() {
//        if (super.isAirConditioning()) {
//            double distance = (getVolume() * 100) / (getAvgMileage() + 1.6);
//            distance = distance-((load*0.5)/100);
//            System.out.println("Zasięg ciężarówki  o ładowności "+ load +" kg z włączoną klimatyzacją wynosi  " + distance);
//
//        } else if (!super.isAirConditioning()) {
//            double distance = (getVolume() * 100) / getAvgMileage();
//            distance = distance-((load*0.5)/100);
//            System.out.println("Zasięg ciężarówki o ładowności " + load + "kg  z wyłączoną klimatyzacją wynosi  "+ distance);
//
//        }
    //}
    @Override
    String carRange1(){
        if(super.isAirConditioning()){
            double distance = (getVolume() * 100) / (getAvgMileage() + 1.6);
            distance = distance-((load*0.5)/100);
            return "Zasięg ciężarówki  o ładowności "+ load +" kg z włączoną klimatyzacją wynosi  " + distance ;
        } else {
            double distance = (getVolume() * 100) / getAvgMileage();
            distance = distance-((load*0.5)/100);
            return "Zasięg ciężarówki o ładowności " + load + "kg  z wyłączoną klimatyzacją wynosi  "+ distance;
        }

    }






}
