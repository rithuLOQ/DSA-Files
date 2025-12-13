package Generics;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        marks sanjana=new marks(559,95);
        marks sahaana= new marks(558,91);
        marks rithul= new marks(447,92);
        marks jaga= new marks(014,93);
        marks sundharesh= new marks(023,91);
        marks kaviya= new marks(001,95);
        marks[] students={sahaana,sanjana,rithul,kaviya,jaga,sundharesh};
//        Arrays.sort(students, new Comparator<marks>() {
//            @Override
//            public int compare(marks o1, marks o2) {
//                return o1.mark-o2.mark;
//            }
//        });
        Arrays.sort(students, (o1, o2) -> o1.mark-o2.mark);
        System.out.println(Arrays.toString(students));
//        if (sanjana.compareTo(sahaana)<0){
//            System.out.println("Sahaana scored more!!");
//        }
//        else {
//            System.out.println("Sanjana scored more!!");
//        }
    }
}
