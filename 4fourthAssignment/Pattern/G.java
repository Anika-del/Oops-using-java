/*
12345
23456
34567
45678
56789
*/
public class G {

    public static void main(String[] args) {
      int no = 4;
    for(int i=1; i<=5; i++){
       
        for(int j=i; j<=no+i; j++){    //j=no+i
            System.out.print(j+" ");
        }

        System.out.println();
         
    }
    
}
}