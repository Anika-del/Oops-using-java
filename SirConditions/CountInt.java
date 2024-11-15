//count number of digits of an integer
class CountInt {

    public static void main(String[] args) {
        int num;
        int count=0;
    System.out.println("Enter the numbers : ");
    num = new java.util.Scanner(System.in).nextInt();
    
      while(num!=0){
        num /= 10;
        ++count;
      }
      System.out.println("Number is integer : "+ count);
    }
    
}
