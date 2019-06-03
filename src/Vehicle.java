public class Vehicle {
    private String name;
    private double volume;
    private double avgMileage;

    Vehicle(){

    }

    public Vehicle(String name, double volume, double avgMileage) {
        this.name = name;
        this.volume = volume;
        this.avgMileage = avgMileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAvgMileage() {
        return avgMileage;
    }

    public void setAvgMileage(double avgMileage) {
        this.avgMileage = avgMileage;
    }

    double range(){
        double range = (volume*100)/avgMileage;
        return range;
    }

}
