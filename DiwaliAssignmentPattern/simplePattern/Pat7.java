// 5 
// 4 3
// 2 1 0
// -1 -2 -3 -4
// -5 -6 -7 -8 -9
class Pat7 {
    
  
    public static void main(String[] args) {
        int count = 5;
        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=i; j++){
              
                System.out.print(count+ " ");
                 count--;
            }
            System.out.println();
        }
    }
}
