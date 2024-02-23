class A_riverse{

    public static void main(String[] args) {
        
        System.out.println("Enter no : ");
        int no = new java.util.Scanner(System.in).nextInt();

        int reverse = 0;
        for(int i=0; i<=no; i++){
         int reminder = no%10;
         reverse = reverse*10+reminder;
         no = no/10;
        }
         System.out.println(reverse);

        
    }
}