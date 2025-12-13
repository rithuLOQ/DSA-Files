package exceptionHandling;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        main main=new main();
        int a= 5;
        int b=0;
        try {
            //System.out.println(divide(a,b));
            throw new myException();

        }catch (myException e){
            System.out.println("Hello all "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static int divide(int a,int b) throws ArithmeticException{
//        if (b==0){
//            throw new ArithmeticException("Please don't assign 0");
//        }
        return a/b;
    }

}
