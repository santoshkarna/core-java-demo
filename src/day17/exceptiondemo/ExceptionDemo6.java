package day17.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo6 {

    public static void main(String[] args) {
//        formatDate(new Date());
        try {
            parseDate("2001-01-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseDate(String date) throws ParseException {
        System.out.println("Entered date: " + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(date);
        System.out.println("Parsed date: " + d);
    }

    public static void formatDate(Date date) {
        System.out.println("Current Date: " + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        String formattedDate = sdf.format(date);
        System.out.println("Formatted Current Date: " + formattedDate);
    }
}
