package chapter5programs;

public class Type_inference {
    public static void main(String[] args) {
        //var cannot be used to declare a variable only without initialization
        // var a; // this is wrong
        var a=10.087;
        int var = 10;
        System.out.println(a);
        System.out.println(var);
        //it cannot be used as the name of the class
        //it is also used for declare an array
    }
}
class VarDemo{
    public static void main(String[] args) {
        var avg=10.0;
        System.out.println("Value of avg: "+avg);
        int var =1;
        System.out.println("Value of var: "+var);
        var k = -var;
        System.out.println("Value of k: "+k);
        var array=new int[10];//cannot use square brackets
        //var is used only for declare an array but not initialization
        //var Myarray={1,2,3}// this is wrong

    }
}
