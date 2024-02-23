//reverse a number
class Reverse {
    public static void main(String[] args) {
int number;
int reverse = 0;
System.out.println("Enter the number : ");
number = new java.util.Scanner(System.in).nextInt();
        
while(number != 0){
int reminder = number%10;
reverse = reverse*10 + reminder;
number = number / 10;
}
System.out.println("Reverse is : "+ reverse);
    }
    
}
