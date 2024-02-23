//use to user a peimitive no. and positive integer it shoud output a messege indicating whatever the no. is prime
class D_prime {

    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        int no = new java.util.Scanner(System.in).nextInt();

        int count=0;
        for(int i=1; i<=no; i++){
            for(int j=2; j<=i-1; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }else{
                count = 0;
            }
        }
    }
    
}
