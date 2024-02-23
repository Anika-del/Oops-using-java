public class E_Primeno {
    
//use to user a prompt no. and positive integer it shoud output a messege1 no is prime or not prime


    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        int no = new java.util.Scanner(System.in).nextInt();

        int count=0;
        for(int i=1; i<=no; i++){
           
                if(no%i == 0){
                    count++;
                }
            }
            if(count == 2)
                System.out.println("No is prime ");
           
            else
            System.out.println("No is not prime ");
        }
    
}

