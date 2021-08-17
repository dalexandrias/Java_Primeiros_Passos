package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        Date y1 = sdf1.parse("12/06/2020");
        Date y2 = sdf2.parse("12/06/2020 15:42:07");

        System.out.println(sdf1.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x2));

    }
}
