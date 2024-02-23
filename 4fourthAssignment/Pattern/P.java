/*
54321
65432
76543
87654
98765
 */
public class P {
    public static void main(String[] args) {
        
          int no=5;
        for(int i=1; i<=5; i++){
            for(int j=no; j>=i; j--){   
              
                System.out.print(j+" ");
            }
            System.out.println();
             no++;
        }
        
    }
}
