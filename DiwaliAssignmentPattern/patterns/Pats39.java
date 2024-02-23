class Pats39 {

    /*

 *****
   *****
    *****
     *****
      *****

 */

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=4; k++){
                if(i==1 || k==1 || i==5 || k==4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    


    
}
