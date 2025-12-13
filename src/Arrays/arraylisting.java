package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylisting {
    private int[] arr;
    private static int default_value=10 ;
    private int size=0;
    public arraylisting(){
        this.arr=new int[default_value];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        arr[size++]=num;
    }
    private boolean isFull(){
        return arr.length==size;
    }
    private void resize(){
        int[] temp=new int[default_value*2];
        for (int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public int remove(){
        int removed=arr[--size];
        return removed;
    }
    public void set(int size1,int num1){
        arr[size1]=num1;
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data="+ Arrays.toString(arr) +
                ", size=" +size+
                '}';
    }

    public static void main(String[] args) {
        arraylisting list=new arraylisting();
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        System.out.println(list);
        ArrayList arrayList=new ArrayList<>();

    }
}
