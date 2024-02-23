class Armstrong {

    public static void main(String[] args) {
        
        System.out.println("Enter the numbers : ");
        int num = new java.util.Scanner(System.in).nextInt();
        int arms =0, c;
    int rem=0;
        c = num;
        while(num>0){
            rem = num%10;
            arms = (rem*rem*rem)+arms;
            num=num/10;
        } 
        if(c==arms)
        System.out.println("It is prime number " + c);
        else
         System.out.println("It is not a prime number " + c);
    }
    
}
