package oop;

public class Bike {
    private String model;
    private int engineCC;
    private double cost;
    public int getEngineCC() {
        return engineCC;
    }
    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public Bike(String model, int engineCC, double cost) {
        this.model = model;
        this.engineCC = engineCC;
        this.cost = cost;
    }
    public Bike() {
    }
    //setter
    public void setModel(String model){
        this.model = model;
    }
    //getter
    public String getModel(){
        return this.model;
    }
}
class Execute{
    public static void main(String[] args) {
        Bike bike = new Bike();
        // bike.model = "Avenger220";
        bike.setModel("Avenger220");
        System.out.println(bike.getModel());
    }
}

