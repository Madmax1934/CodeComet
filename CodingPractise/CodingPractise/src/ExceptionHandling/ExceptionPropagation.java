package ExceptionHandling;

import java.io.IOException;

public class ExceptionPropagation {
    public void def() throws IOException {
        System.out.println("In def");
        pqr();
    }

    private void pqr() throws IOException {
        System.out.println("In pqr");
        throw new IOException("device error");
    }

    public void abc(){
        try{
            System.out.println("In abc");
            def();
        }catch(Exception e)
        {
            System.out.println("message = "+e.getMessage());
        }
    }

    public static void main(String[] args) {

        ExceptionPropagation obj = new ExceptionPropagation();
        obj.abc();
    }
}

