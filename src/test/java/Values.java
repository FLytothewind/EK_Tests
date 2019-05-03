public class Values {

    public static void main(String[] args){
        printValues("One word");
        System.out.println(printValues("Word ", 777));
        System.out.println(printValues(true, 999, "What?"));
    }

    public static void printValues( String str) {
        System.out.println(str);
    }

    public static String printValues(String str, int num){
        return (str + num);

    }
    public static String printValues(boolean buls, int num, String str){
        if(buls) {
            return str;
        }
        else {
            return String.valueOf(num);
        }
    }


}
