//HCF Higest common factor
//50 60
class HCF {

    public static void main(String[] args) {
        
    
    int num1, num2;
    System.out.println("Enter first number");
    num1 = new java.util.Scanner(System.in).nextInt();
    num2 = new java.util.Scanner(System.in).nextInt();


    int hcf=0;
    for(int i=1; i<=num1; i++){
        if(num1%i==0 && num2%i==0){
            hcf = i;
          //System.out.println(i);
        }
    System.out.println("HCF "+ hcf);
    
    }

    }
}
