package Lambda;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)-> System.out.println((item*2)));
        Operation sum=(a, b) -> a+b;
        Operation pro=((a, b) -> a*b);
        main main=new main();

        System.out.println(main.operate(2,3,sum));
        lambda_func rithul=new lambda_func(18,65);
        lambda_func twin=(lambda_func) rithul.clone();
        System.out.println(twin.age);
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}