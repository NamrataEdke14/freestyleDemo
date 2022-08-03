import java.text.*;
import java.util.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class freestyleDemo {
    public static void main(String args[]) throws ParseException
    {
        SimpleDateFormat formatDate = new SimpleDateFormat(
            "dd/MM/yyyy  HH:mm:ss");
 
        Date date = new Date();
	
	SimpleDateFormat formatDate1 = new SimpleDateFormat("dd MMMM yyyy");
	String date_str = formatDate1.format(date);
	System.out.println(date_str);
	System.out.println(formatDate.format(date));
	String sDate1="29/07/2022";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
    }
}
