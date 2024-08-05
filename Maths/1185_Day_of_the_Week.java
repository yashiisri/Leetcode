class Solution {
    private int JAN_FIRST = 1, MAX_FEB = 28, LEAP_FEB = 29;
    private int MAX_DAYS_MONTHS1 = 31, MIN_DAYS_MONTHS = 1, MAX_DAYS_MONTHS2 = 30;
    private int MAX_MONTH = 12, MIN_MONTH = 1;
    private int MAX_YEAR = 9999, MIN_YEAR = 1000, MID_YEAR = 2000;
    private int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
            
    public String dayOfTheWeek(int day, int month, int year) 
    {
        int dayD = dayInWeek(day, month,  year);
               
        if(dayD == 1)
        {
            return "Sunday";
        }
        if(dayD == 2)
        {
            return "Monday";
        }
        if(dayD == 3)
        {
            return "Tuesday";
        }
        if(dayD == 4)
        {
            return "Wednesday";
        }
        if(dayD == 5)
        {
            return "Thursday";
        }
        if(dayD == 6) 
        {
            return "Friday";
        }
         return "Saturday";
    }
	
    private int dayInWeek(int day, int month, int year) 
    {
        int D = day;
        int M;
        year = year;
      
       if(month < MAR)
       {
          year--;        
          M = month + DEC; 
       }
       else
       {
           M = month;
       }
     
        int Y = year % 100;
        int C = year / 100;        
        int Day = ((D + ((26*(M + 1)) / 10) + Y + (Y / 4) + (C / 4) - 2 * C) % 7);
        Day = Math.floorMod(Day, 7);
        
     return Day;
   
  }
}