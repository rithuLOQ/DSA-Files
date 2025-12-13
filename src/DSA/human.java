package DSA;
public class human {
    public static int a;
    static int b;
    protected int c=9;
    private int d=10;
    public int e=19;
    int f=0;
    human(int a, int b){
        this.a=a;
        this.b=b;
    }
    static void area(){
        System.out.println("human");
    }


    public human() {
    }
    protected human(human old){
        this.a=old.a;
        this.b=old.b;
    }
    void printing(){
        System.out.println(a+" "+b);
    }
    void rocky(){
        System.out.println("Hell");
    }
    //initializing only one object of human class. Here 'instance is a variable name'
    static human instance;
    public static human getInstance(int a, int b){
        if(instance == null){
            instance=new human(a,b);
        }
        return instance;
    }
    static class alien{
        static int ali=0;
        static void changeAli(int c){
            alien.ali=c;
        }
        static void printAli(){
            System.out.println(alien.ali);
        }
    }
    
}
class laptop{
    int a=0;
    static public laptop instance;
    public static laptop getInstance(){
        if(instance==null){
            instance=new laptop();
        }
        return instance;
    }
}
class dog extends human {
    static int a1;
    int b1;
    dog(int a,int b){
        this.a1=a;
        super.b=b;
    }
    //    void area(){
//        System.out.println("Its a dog");
//    }
    dog(dog other){
        super();

    }
    dog(){}

}
class cat extends dog{
    int legs;
    int nose;
    int skin;
     void rocky(){
        System.out.println("Hello boss");
    }
    cat(int a,int b2){
        super.a=a;
        b=b2;
    }
    //@Override
    static void area(){
        System.out.println("Meow cat");
    }
    cat(){}
}
class donkey{
    void area(){
        System.out.println("I am a donkey");
    }
}
class camel extends donkey{
    void area(){
        System.out.println("I am a camel");
    }
}
