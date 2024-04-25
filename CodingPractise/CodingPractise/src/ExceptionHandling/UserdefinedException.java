package ExceptionHandling;

public class UserdefinedException extends Exception{
    public UserdefinedException(String str)
    {
        super(str);
    }

    public static void main(String[] args) {
        try{
            throw new UserdefinedException("this is the user-defined exception");
        }catch(UserdefinedException ude)
        {
            System.out.println("Message == "+ude.getMessage());
        }
    }
}
