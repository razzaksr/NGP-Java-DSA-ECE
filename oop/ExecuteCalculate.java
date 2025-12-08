package oop;

import java.util.Scanner;

public class ExecuteCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //     System.out.println("enter principle, duration and roi ");
    //     Finanace fin1 = new Finanace(scan.nextInt(),scan.nextInt(),
    // scan.nextDouble());
    //     fin1.fdCaculator();
        Finanace fin2 = new Finanace();// default
        fin2.setPrincipleAmount(250000);
        fin2.setDuration(8);
        fin2.setRoi(7);
        fin2.fdCaculator();
        System.out.println(fin2);
        scan.close();
    }
}
class Finanace{
    // data members
    private int principleAmount, duration;
    private double matirutyAmount, roi;
    
    @Override
    public String toString() {
        return "Finanace [principleAmount=" + principleAmount + ", duration=" + duration + ", matirutyAmount="
                + matirutyAmount + ", roi=" + roi + "]";
    }

    public Finanace(int principleAmount, int duration, double roi) {
        this.principleAmount = principleAmount;
        this.duration = duration;
        this.roi = roi;
    }

    public Finanace() {
    }

    // member method
    public void fdCaculator(){
        double oneYear = principleAmount*roi/100;
        double total = oneYear*duration;
        matirutyAmount = principleAmount + total;
        System.out.println("Outcome of your deposit is "+matirutyAmount);
    }

    public int getPrincipleAmount() {
        return principleAmount;
    }

    public void setPrincipleAmount(int principleAmount) {
        this.principleAmount = principleAmount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMatirutyAmount() {
        return matirutyAmount;
    }

    public void setMatirutyAmount(double matirutyAmount) {
        this.matirutyAmount = matirutyAmount;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }
}
