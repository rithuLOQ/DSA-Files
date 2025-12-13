package Lambda;

public class lambda_func implements Cloneable {
    int age;
    int weight;
     lambda_func(int age,int weight){
        this.age=age;
        this.weight=weight;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
