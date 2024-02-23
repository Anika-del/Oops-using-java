class LeapYear {
        public static void main(String[] args) {
      
          // year to be checked
          int year;
          boolean leap = false;

          System.out.println("Enter Year : ");
          year = new java.util.Scanner(System.in).nextInt();
      
           if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) 
            System.out.println(year + " is a leap year.");
          else
            System.out.println(year + " is not a leap year.");
        
      }
}
