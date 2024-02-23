class FMage {

    public static void main(String[] args) {
        
        int age;
        char sec;
        char merride;
        
        System.out.println("Enter Age : ");
        age = new java.util.Scanner(System.in).nextInt();

         System.out.println("Enter Section M/F : ");
         sec = new java.util.Scanner(System.in).next().charAt(0);

        System.out.println("Enter Merried Y/N : ");
        merride = new java.util.Scanner(System.in).next().charAt(0);

        if(sec == 'F'){
            System.out.println(" Women Works only in urban area");
        }

        if(sec == 'M'){
            if((age>=20) && (age<=40)){
                 System.out.println("Male work any where");
            }
            else if((age>=40) && (age<=60)){
                 System.out.println("Male works only urban area");
            }
           else{
             System.out.println("ERROR!");
           }
          
        }

    }   
}
