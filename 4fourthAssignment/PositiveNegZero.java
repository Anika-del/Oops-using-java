//WAP to take input from user and print and at the end it should displayed the count of displayed positive nrgative and zero
class PositiveNegZero {

    public static void main(String[] args) {
        
        System.out.println("Enter the numbers : ");
        int no = new java.util.Scanner(System.in).nextInt();
        
        for(int i=0; i<=no; i++){
            System.out.print(" "+i);
        }
            if(no>0){
                System.out.println(no +" positive");
            }
            else if(no<0){
                System.out.println(no +" negative");
            }
            else{
                System.out.println(no +" zero");
            
           
        }
    }
    
}
