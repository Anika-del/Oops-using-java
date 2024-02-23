/*

*     *
**    **
***   ***
****  ****
***** *****
************
************
***** *****
****  ****
***   ***
**    **
*     *

*/ 
class Pat11{
    public static void main(String[] args) {
        
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=5; k>=i; k--){
                System.out.print(" ");
            }
           for(int a=1; a<=i; a++){
            System.out.print("*");
           }
            System.out.println();
        }

         for(int l=1; l<=6; l++){
            for(int m=6; m>=l; m--){
                System.out.print("*");
            }
            for(int n=1; n<l; n++){
                System.out.print(" ");
            }
            for(int b=6; b>=l; b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}