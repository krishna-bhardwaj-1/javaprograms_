package chapter1programs;

public class GalToLitTable {
    public static void main(String[] args){
        double gal;
        int c=0;
        for (gal=1;gal<=100;gal++){
            System.out.println(gal+" gallons is "+gal*3.7854+" liters.");
            c++;
            if(c==10){
                System.out.println();c=0;
            }
        }
    }
}
