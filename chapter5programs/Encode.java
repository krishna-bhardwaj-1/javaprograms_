package chapter5programs;

public class Encode {
    public static void main(String[] args) {
        String msg="This is a test";
        String enmsg="";
        String decmsg="";
        int key=88;
        System.out.print("Original message: ");
        System.out.println(msg);
        //encode a msg
        for(int i=0;i<msg.length();i++)
            enmsg=enmsg+(char)(msg.charAt(i)^key);
        System.out.print("Encoded message: ");
        System.out.println(enmsg);
        //decode a msg
        for(int i=0;i<msg.length();i++)
            decmsg=decmsg+(char)(enmsg.charAt(i)^key);
        System.out.print("Decoded msg: ");
        System.out.println(decmsg);
    }
}
