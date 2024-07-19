package chapter1programs;

public class inch_to_meter {
    public static void main(String[] args) {
        int inch, c = 0;
        int d=2;
        double meter;
        System.out.println("In 1 feet ");
        for (inch = 1; inch <= 144; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " inches have " + meter + " meters.");
            c++;
            if (c == 12) {
                if(d==13) break;
                System.out.println();
                System.out.println("In "+d+" feet ");
                System.out.println();
                c = 0;
                d++;
            }
        }
    }
}
