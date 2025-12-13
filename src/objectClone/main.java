package objectClone;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sanjana=new Human(21,"Sanjana");
        Human sahaana=(Human)sanjana.clone();
        //Shallow copying
        //Primitives will be copied but the object types will be referred to same object(int will be independent to each one but not the string and arr
        // )if we change the name in sahaana it affects and sanjana too
        System.out.println(sahaana.age+ " "+ sahaana.name+" "+ Arrays.toString(sahaana.arr));
    }

}
