package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

//        /01/12/2021  21:13:44
//        SimpleDateFormat sdf =
//                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");

        Date date = new Date();

        System.out.println(sdf.format(date));

        String dateStr = "23/03/2003";
        Date parse = sdf.parse(dateStr);
        System.out.println(parse);
    }
}
