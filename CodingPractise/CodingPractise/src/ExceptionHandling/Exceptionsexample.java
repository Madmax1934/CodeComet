package ExceptionHandling;

public class Exceptionsexample {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[0]=30/0;
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception occured!! "+e.getMessage());
        }catch (NullPointerException e) {
            System.out.println("null pointer exception is occured: "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("General Exception handled");
            System.out.println("showing exception message: "+e.getMessage());

        }

        System.out.println("try-catch example");
    }
}
