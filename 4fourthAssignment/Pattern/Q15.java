/*
 ABCDE
 BCDEF
 CDEFG
 DEFGH
 EFGHI
 */
public class Q15 {
    public static void main(String[] args) {
        
        int no=5;
        char ch = 'A';
      for(int i=1; i<=5; i++){
          for(int j=no; j>=i; j--){   
          
              System.out.print(ch+" ");
              ch++;
          }
          System.out.println();
           no++;
      }
      
  
}
}
