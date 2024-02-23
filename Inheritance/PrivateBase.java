  class PrivateBase {

        private int x = 10;
        void show(){
            System.out.println(x);
        
        }
  }
    class Child extends PrivateBase {
        public static void main(String[] args) {
            Child c1 = new Child();
            c1.show();    //10
    
        }
    }

