package api;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime 
{
    public static void main(String[] args) 
    {
        // date 
        LocalDate date=LocalDate.now();
        System.out.println(date);

        //date in better representation
        int Date=date.getDayOfMonth();     //date.get---> date is taken from ( LocalDate.now() __ refremnce )
        int Month=date.getMonthValue();
        int Year=date.getYear();

        System.out.println(Date + "/"  +Month + "/" + Year );

        
        // For Time
        LocalTime time=LocalTime.now();
        System.out.println(time);

        // time better Representation
        // time.getHour();  ---> here time is a refernce of LocalTime.now() method

        int Hour=time.getHour();
        int Minute=time.getMinute();
        int Second=time.getSecond();
        int Nano=time.getNano();

        System.out.println(Hour+"."+ Minute+"."+Second+"."+Nano+".");
    }
    
}
//OUTPUT

// 2025-03-26
// 26/3/2025
// 12:29:06.582702900
// 12.29.6.582702900.