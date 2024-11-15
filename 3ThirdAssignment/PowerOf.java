//take 2 number WAP to find the power of anither
class PowerOf {

    
    public static void main(String[] args) {

    System.out.println("Enter no. ");
    int exponent = new java.util.Scanner(System.in).nextInt();

    int base=0, power = 1;
    for(int i=1; i<=exponent; i++){
        power = power*base;
        
    }
    System.out.println(power);
   
        
    }
}
