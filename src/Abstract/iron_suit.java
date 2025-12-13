package Abstract;

public interface iron_suit{
    void mark42();
    void mark2();
    default void mark85(){
        System.out.println("I am from interface");
    }
}
