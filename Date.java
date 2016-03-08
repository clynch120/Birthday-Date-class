
public class Date 
{
	
   private int day;
   private int month;
  
   public Date(int month, int day) 
   {       
	   this.month = month;
	   this.day = day;
   }
   
   public int getMonth()
   {
	   return month;
   }
   
   public int getDay()
   {
	   return day;
   }
   
   public void setDate(int month, int day)
   {
	   this.month = month;
	   this.day = day; 
   }
   
   public String toString()
   {
	   return this.month + " / " + this.day;
   }
   
   public boolean equals (Date d)
   {
	   if (this == d)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }	   

public int daysInMonth() 
   {
      int days;
      switch(this.month) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            days = 31;
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            days = 30;
            break;
         case 2:
            days = 28;
            break;
         default:
            days = 0;
      }
      return days;
   }
   
   public void nextDay() 
   {
      day++;
   }
}
