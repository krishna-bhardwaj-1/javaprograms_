package chapter4proograms;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
class Vehicledemo{
    public static void main(String[] args){
        Vehicle minivan = new Vehicle();
        int a;
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;
        a= minivan.fuelcap* minivan.mpg;
        System.out.println("Minivan can carry "+minivan.passengers+" with a range of "+a);
    }
}
