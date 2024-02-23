class Reversee {

    public static void main(String[] args) {
        
    int rev = 0;
    System.out.print("Enter numbers : ");
    int no = new java.util.Scanner(System.in).nextInt();

    while(no != 0){
        int reminder = no%10;
        rev = rev*10+reminder;
        no = no/10;
    }
    System.out.println(rev);
    
}
}