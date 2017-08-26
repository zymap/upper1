import sun.plugin2.applet.context.InitialJNLPExecutionContext;

/**
 * Created by zy on 17-8-25.
 */
public class Test {
    public static void main(String[] args) {
       String a = "377";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
       String b = "" + a.charAt(a.length()-2)+a.charAt(a.length()-1);
        System.out.println(b);
    }
}
