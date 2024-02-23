/*

*
--
***
----
*****
----
***
--
*

*/ 
class Pat13{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(i==2 || i==4)
                System.out.print("-");
                else
                System.out.print("*");
            }
            System.out.println();
        }
         for(int k=1; k<=4; k++){
            for(int l=4; l>=k; l--){
                if(k==1 || k==3)
                System.out.print("-");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}