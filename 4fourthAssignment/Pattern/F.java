package Pattern;

/*
10101
10101
10101
10101
10101
*/
public class F {

    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                
               // if((i+j)%2==0){
             if(j==1 || j==3 || j==5){
                System.out.print(1);
             }else{
                System.out.print(0);
             }
            }
                 System.out.println();
        }
      
    }
    }
