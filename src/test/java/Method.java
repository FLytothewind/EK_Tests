public class Method {
    public static  void main (String [] args) {

        char[] helloLetters = {'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloLetters);
        System.out.println((helloString));

        int len = helloString.length();
        System.out.println("Word have: " + len + " symbols.");

        int a=2, b=3, c=4;
        double a1=1.5, b1=2.5, c1=3.5;
        int sum=sum (a, b, c);
        double sum2=sum (a1, b1, c1);
        System.out.println ("First result: "+sum);
        System.out.println ("Second result: "+sum2);

        String boolStr = sum2();
        System.out.println(boolStr);


    }

    private static String sum2(){
        String boolstr = "9";
        boolean b = true;

        return boolstr + " is " + b;
    }

    private static int sum(int a, int b, int c) {
        return a+b+c;

    }

    private  static double sum (double a, double b, double c){
        return a+b+c;


    }


}
