package Generics;

import java.util.Arrays;

public class marks {
    private int rollno;
    public int mark;
    void displaying(int a){
        System.out.println(a);
    }

//    @Override
//    public int compareTo(marks o) {
//        int diff=(int)(this.marks-o.marks);
//        return diff;
//    }
    @Override
    public String toString(){
        return mark+" "+rollno;
    }
    marks(int rollno, int mark){
        this.rollno=rollno;
        this.mark=(int)mark;
    }
}
