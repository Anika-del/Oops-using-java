class Temp2 {

    //int x=20;
    //int x; //20
    final int x=20; //if we make final then need to initilize a value of x
    public static void main(String[] args) {
        Temp2 t2 = new Temp2();
        // t2.x = t2.x+20; //after final can't add value because final can't be change or modify.
         System.out.println(t2.x); //40
    }
    
}
