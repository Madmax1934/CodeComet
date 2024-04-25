package ExceptionHandling;

import java.io.*;

public class ThrowUncheckedexp {
    public static void method() throws IOException {
        FileReader fr=new FileReader("C:\\wsapps\\popdb\\configuration\\xyz.txt");
        BufferedReader fileInput = new BufferedReader(fr);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch(Exception e){
            System.out.println("Exception message: "+e.getMessage());
        }
        System.out.println("rest of the code..");
    }
}
