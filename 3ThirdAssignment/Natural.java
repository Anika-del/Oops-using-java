//sum of first 10 natural no.
//Sum of n natural numbers=n*(n+1)/2
class Natural {

    public static void main(String[] args) {
    
        System.out.println("Enter no. ");
        int n = new java.util.Scanner(System.in).nextInt();
       int sum = 0;
       
        for(int i=1; i<=n; i++){
            sum = sum+i;     
    }
    System.out.println("Sum of first natural number = "+ sum);

    }
    
}
