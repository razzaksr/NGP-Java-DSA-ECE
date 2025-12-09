package oop;

public class ExecuteOverride {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        double received = monitor1.findMax();
        System.out.println(received);
    }
}

class Monitor extends Warehouse{
    public double findMax(){
        double fMax = Double.MIN_VALUE; double sMax = Double.MIN_VALUE;
        double tMax = Double.MIN_VALUE;
        for(double each:salaries){
            if(fMax<each){
                tMax = sMax; sMax = fMax; fMax = each;
            }else if(sMax<each&&each!=fMax){
                tMax = sMax; sMax = each;
            }else if(tMax<each&&each!=fMax&&each!=sMax){
                tMax = each;
            }
        }
        return tMax;
    }
}