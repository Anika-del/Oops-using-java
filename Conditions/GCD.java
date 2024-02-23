public class GCD {
    
//GCD Greatest commpon divisor
//50 60-- 1,2,5,10


    public static void main(String[] args) {
        
    
    int num1, num2;
    System.out.println("Enter first number");
    num1 = new java.util.Scanner(System.in).nextInt();
    System.out.println("Enter first number");
    num2 = new java.util.Scanner(System.in).nextInt();

    for(int i=1; i<=num1; i++){
        if(num1%i==0 && num2%i==0){
           System.out.println(i);
        }
    }

    }
}

