// use do while loop and take to no fgrom user . the number should be added and display sum.
// loop asked user whenever his wishes to perform loop again and if so the loop should
//  repeated otherwise terminated
class F_DoWhile {

    public static void main(String[] args) {
        
         int sum = 0;

         do{
        System.out.println("Enter first number : ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter first number : ");
        int b = new java.util.Scanner(System.in).nextInt();
        
            sum = a+b;
            System.out.println("Displayed sum = "+sum);
            sum = sum+1;
        }
        while(sum == 0.0);
        System.out.println("Sum " +sum);
        
    }
    
}
