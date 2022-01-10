package Assignments;

import java.time.LocalDate;


public class Assignment7 {
    public static void main(String[] args)
    {
        dateDemo();
    }
 public  static void dateDemo()
    {
        String day;
        String month;
        String year;
        System.out.println("enter the day:");
        day=System.console().readLine();
        System.out.println("enter the month:");
        month=System.console().readLine();
        System.out.println("enter the year:");
        year=System.console().readLine();
        
        LocalDate today=LocalDate.of(Integer.parseInt(day),Integer.parseInt(month),Integer.parseInt(year));
        System.out.println(today);
        for(int i=1;i<=Integer.parseInt(day);i++)
    
        {
            LocalDate dateFrom=LocalDate.of(Integer.parseInt(month),Integer.parseInt(year),i);
            System.out.println(dateFrom+" is "+dateFrom.getDayOfWeek());
        }
    }
}

  