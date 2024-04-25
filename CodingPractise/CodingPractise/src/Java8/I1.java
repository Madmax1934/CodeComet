package Java8;

public interface I1 {

    default void show()
    {
        System.out.println("Default show method");

    }

    void test();
    static void staticmethod()
    {
        System.out.println("Static method");
    }
}
