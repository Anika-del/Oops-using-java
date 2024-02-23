class ReverseNum {

    public static void main(String[] args) {

        int number;
        int rev = 0;
        System.out.print("INPUT: ");
        number = new java.util.Scanner(System.in).nextInt();

        while(number != 0){
            int reminder = number%10;
            rev = rev*10+reminder;
            number /= 10;
        }
        System.out.print("OUTPUT: "+rev);
       


}
}