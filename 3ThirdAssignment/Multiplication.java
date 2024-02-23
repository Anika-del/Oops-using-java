//WAP to take user prsitive integer it should print the multiplication table of that number 
class Multiplication {

    public static void main(String[] args) {
        
        System.out.println("Enter no. ");
        int num = new java.util.Scanner(System.in).nextInt();

        for(int i=0; i<10; i++){
         
            System.out.println(num+"*"+(i+1)+" = "+num*(i+1) );

          
        }

    }
    
}
