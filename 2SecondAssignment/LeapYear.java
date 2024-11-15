class LeapYear {
        public static void main(String[] args) {
      
          // year to be checked
          // If the year is divisible by 4,
    //If the year is divisible by 100,
   // If the year is divisible by 400, 
   //the year is a leap year.

   // If the year is not divisible by 100 or is divisible by 400, the year is a leap year.
   // the year is not a leap year.
   
          int year;
          boolean leap = false;

          System.out.println("Enter Year : ");
          year = new java.util.Scanner(System.in).nextInt();
      
           if((year % 400 == 0) || (year % 4 == 0) && (year % 100 == 0)) 
            System.out.println(year + " is a leap year.");
          else
            System.out.println(year + " is not a leap year.");
        
      }
}
