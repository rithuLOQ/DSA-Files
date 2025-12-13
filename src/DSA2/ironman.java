package DSA2;
import DSA.human;
class captain_america extends human{
   void print(){
       System.out.println(super.c);
   }
}
class sam_captain extends captain_america{
    void print(){
        System.out.println(super.c);
    }
}
class objectCreation{
    public int hashCode(){
        return super.hashCode();
    }
}
public class ironman {
    public static void main(String[] args) {
        human hu=new human();
        captain_america am=new captain_america();
        sam_captain sam=new sam_captain();
        am.print();
        sam.print();

    }
}
