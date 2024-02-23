class MyThis {
    
       int x = 100;
       void get(MyThis this, int x){
        System.out.println(this +"getjajajajaja");       //second
        System.out.println(this.x);        //third
       }
       public static void main(String[] args) {
         MyThis mt = new MyThis();
         System.out.println(mt +"main");         //First 
         mt.get(300);
       }

    
}
