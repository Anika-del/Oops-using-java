class B_evenodd {

    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        int no = new java.util.Scanner(System.in).nextInt();

        int sum = 0;
        for(int i=1; i<=no; i++){
              System.out.print(" "+ i);
              sum = sum+i; 
             
        }
        System.out.println();
        System.out.println("sum of = "+ sum);
        if(sum%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

        
    }
    
}
