package chapter5programs;

public class substring {
    public static void main(String[] args) {
        String orgstr = "Java makes the web move.";
        String substr = orgstr.substring(5,18);
        System.out.println("orgstr: "+orgstr);
        System.out.println("substr: "+substr);
        String str = """
               sxnx    krishna's mac"book air""";
        System.out.println(str);
        //System.out.println("the    m"ac");
    }
}
