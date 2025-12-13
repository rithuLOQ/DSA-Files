package objectClone;

public class Human implements Cloneable{
    int age;
    int[] arr;
    String name;
    public Human(int age, String name){
        this.age=age;
        this.name=name;
        this.arr= new int[]{3, 4, 5, 6};
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
