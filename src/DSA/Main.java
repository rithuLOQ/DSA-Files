package DSA;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        rithul rith=new rithul("Rithul",'P',447);
        rithul sanjana=rith;
        rith.Name="Kanna";
        sanjana.Name="Sanjana";
        System.out.println(sanjana.Name);
        System.out.println(rith.Name);
        //initializing only one object of human class
        human Human = human.getInstance(5,6);
        System.out.println(Human.a+Human.b);
        dog dog =new dog(1,2);
        System.out.println(Human.a+" "+ Human.b);
        cat rithul=new cat(22,3);
        System.out.println(Human.a + " "+ Human.b);
        human hu=new cat(2 ,4);
        //static overridden function
        cat cat =new cat();
        cat.area();
        human sam=new cat();
        sam.area();
        //non-static overridden function
        donkey donkey=new camel();
        donkey.area();
        human hu1=new human(hu);
        hu1.printing();
        ArrayList<String> names=new ArrayList<>();
        names.add("rithul");
        System.out.println(names.getFirst());
        System.out.println(hu1.a);
        System.out.println("Hello World");
        human.alien sanju=new human.alien();
        human.alien.changeAli(4);
        if(hu1==hu){
            System.out.println("Equal");
        }
        else{
            System.out.println("False");
        }
        laptop lap=laptop.getInstance();
        laptop lap1=laptop.getInstance();
        if(lap==lap1){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
    static class rithul{
        int roll;
        char PA;
        String Name;
        void nameChange(String name){
            this.Name=name;
        }
        rithul(String name,char pa,int num){
            this.Name=name;
            this.PA=pa;
            this.roll=num;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Dead broo");
        }
    }
}