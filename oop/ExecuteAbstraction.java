package oop;

import java.util.Arrays;

public class ExecuteAbstraction {
    public static void main(String[] args) {
        // IIT iit = new IIT();iit.read(3);
        // NGPIT ngpit = new NGPIT();ngpit.read(3);
        Analyse analyse = new IIT();
        analyse.read(1);
        analyse = new NGPIT();
        analyse.read(0);
    }
}

interface Analyse{
    String[] lineUp = {"CTS","ZOHO","Hexaware","LTIMindtree","Wipro"};
    public void read(int day);
}
class IIT implements Analyse{
    @Override
    public void read(int day) {
        if(day>=0&&day<lineUp.length){
            String[] newArray = Arrays.
            copyOfRange(lineUp, day, lineUp.length);
            System.out.println(Arrays.toString(newArray));
        }
        else System.out.println("Invalid day");
    }
}

class NGPIT implements Analyse{
    @Override
    public void read(int day) {
        if(day>=0&&day<lineUp.length)
            System.out.println(lineUp[day]);
        else System.out.println("Invalid day");
    }
}