public class Return {    

         static void show(char ch){
         System.out.println("No return type ");
        }
        static void show(int x){
           return;
        }
    
        public static void main(String[] args) {
           show(10);
          // show(200);
            //  int x = show(10);
         System.out.println("return type is " + x);
        }
    }
    
