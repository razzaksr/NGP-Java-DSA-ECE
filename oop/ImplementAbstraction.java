package oop;

import java.util.Arrays;

public class ImplementAbstraction extends Garage{
    @Override
    public void update(int pos, double newValue) {
        if(pos>=0&&pos<getMyOwn().length){
            getMyOwn()[pos] = newValue;
            System.out.println(newValue+" updated @ "+pos);
        }else
            System.out.println("Invalid position");
    }
    public static void main(String[] args) {
        Garage garage = new ImplementAbstraction();
        garage.viewMyOwn();
        garage.update(1, 1.1);
        garage.viewMyOwn();
    }
}
abstract class Garage{
    // data member
    private double[] myOwn = {9.2,5.6,8.1,3.2,7.5,2.6,4.1};
    // member method>> non abstract
    public double[] getMyOwn(){return myOwn;}
    public void viewMyOwn(){
        System.out.println(Arrays.toString(myOwn));
    }
    public abstract void update(int pos, double newValue);
}
