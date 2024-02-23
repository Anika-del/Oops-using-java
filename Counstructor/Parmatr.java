class Parmatr {

        int x , y;
        Parmatr(int x, int y){
            this.x=x;
            this.y=y;
        }
        void show(){
           System.out.println(x);
           System.out.println(y);
        }
        public static void main(String[] args) {
            Parmatr p1 = new Parmatr(10,20);
            p1.show();
            Parmatr p2 = new Parmatr(100,200);
            p2.show();
        }
    
    
    
}
