class Naturaal {

    public static void main(String[] args) {
        
        System.out.println("Enter no. ");
        int n = new java.util.Scanner(System.in).nextInt();

        int i=1;
        int sum = 0;
        while(i<=n){
           
           sum = sum+i;
            i++;

        }
         System.out.print("natural no"+ sum);
    }
    
}
