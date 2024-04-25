package DateTime;

import org.w3c.dom.ls.LSOutput;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Simpledatformatexample {
    public static void main(String[] args) {
        Date date = new Date();
        //SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date));
    }


}
