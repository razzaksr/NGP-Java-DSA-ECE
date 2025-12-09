package oop;

public class CastDemo {
    public static void main(String[] args) {
        // upcasting possible only if inheritance happended
        Warehouse access = new Associate();
        // derived properties cannot be accessed via upcasting
        // access.filter(7.5);
        double received = access.findMax();
        System.out.println(received);
        // downcasting
        Associate helper = (Associate) access;
        helper.filter(7.5);
        System.out.println(helper.findMax()+" is max value");
    }
}

class Associate extends Warehouse{
    public void filter(double criteria){
        System.out.println("Salaries matched "+criteria);
        for(double each:salaries)
            if(each<=criteria)
                System.out.println(each);
    }
}

class Warehouse{
    double[] salaries = {5.9,9.2,1.5,8.9,4.5,7.2,1.8};
    public double findMax(){
        // linear 
        double maximum = Double.MIN_VALUE;
        for(double each:salaries){
            maximum = Math.max(maximum, each);
        }
        return maximum;
    }
}