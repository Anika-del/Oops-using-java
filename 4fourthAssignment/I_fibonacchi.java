//0 1 1 2 3 5 8 13 21 ......
class I_fibonacchi {

    public static void main(String[] args) {

        System.out.println("Enter the number = ");
        int no = new java.util.Scanner(System.in).nextInt();

        int a=0, b=1, c;
        System.out.print(a +" "+ b);
      

        for(int i=0; i<=no; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
      

    }
    
}
