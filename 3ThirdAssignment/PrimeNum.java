//Number is prime or not prime 1,2,3,5,7,11,13,17,19,,,,.
class PrimeNum {
    public static void main(String[] args) {
        
    int count = 0;
    System.out.println("Enter no : ");
    int no = new java.util.Scanner(System.in).nextInt();

    for(int i=1; i<=no; i++){
        if(no%i == 0){
           count++; 
    }
    }
    if(count == 2){
        System.out.println("prime");
    }else{
        System.out.println("not prime");
    }
}
}
