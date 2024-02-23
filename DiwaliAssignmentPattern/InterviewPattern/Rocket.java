class Rocket{
    public static void main(String[] args) {
        
        int i, j, n, sp;
        int x=1;

        System.out.println("Enter the size ");
    n=new java.util.Scanner(System.in).nextInt();

    if(n>1 && n%2!=0){
        //System.out.println(n/2+1);
        for(i=0; i<n/2+1; i++){
            sp = n+n/2-i;

            for(j=0;j<sp; j++){
                System.out.print(" ");
            }
            for(j=0; j<x; j++){
                System.out.print("*");
            }
            x+=2;
            System.out.println(" ");
        }
        for(i=0; i<n-2; i++){
            
        }
    }




    }
}