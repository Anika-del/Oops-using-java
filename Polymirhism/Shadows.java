class Shadows {
//Samaj nhi aaya
    int x = 10;
        void show(Shadows this, int y){
         System.out.println(this.x);//2
         System.out.println(y);//3
        }
        public static void main(String[] args) {
            Shadows s1 = new Shadows();
          // s1.show(20);
           System.out.println(s1.x);//1
            s1.show(20);
        }
        
    }
    
    

