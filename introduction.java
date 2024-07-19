class Example{
    public static void main(String[] args){
        System.out.println("java drives the website");
    }
}
class Krishna {
    public static void main(String[] args) {
        System.out.println("My name is krishna bhardwaj");
        System.out.print("hello guys");
    }
}
class Example2{
    public static void main(String[] args){
        int var1;
        int var2;
        var1=1024;
        System.out.println("var1 contains "+var1);
        var2=var1/2;
        System.out.print("var2 contains var1/2:");
        System.out.println(var2);
    }
}
class Example3{
    public static void main(String[] args){
        int v;
        double x;
        v=10;
        x=10.0;
        System.out.println("Original Value of v: "+ v);
        System.out.println("Original Value of x: "+ x);
        System.out.println();
        v=v/4;
        x=x/4;
        System.out.println("v after division: "+v);
        System.out.print("x after division: "+x);
    }
}
class GalToLit{
    public static void main(String[] args){
        double gallons,liters;
        gallons=10;
        liters=gallons*3.7854;
        System.out.println(gallons+" Gallons is "+liters+"Liters.");
    }
}
class IFDemo{
    public static void main(String[] args){
        int a,b,c;
        a=2;
        b=3;
        if(a<b) System.out.println("a is less than b");
        if(a==b) System.out.println("You wan see this.");// bcz condition is false
        System.out.println();
        c=a-b;
        System.out.println("c contains "+c);
        System.out.println("c is negative");
        c=b-a;
        System.out.println("c contains "+c);
        if(c>=0) System.out.println("c is a non negative ");
        if(c<0) System.out.println("c is negative");
    }
}
class ForDemo{
    public static void main(String[] args){
        int c;
        for(c=0;c<=5;c++)
            System.out.println("count is: "+c);
        System.out.println("Done!");
    }
}
class BlockDemo{
    public static void main(String[] args){
        double i=5,j=10,d;
        if(i!=0) {
            System.out.println("i does not equal to zero.");
            d = j / i;
            System.out.println("j/i is " + d);
        }
    }
}