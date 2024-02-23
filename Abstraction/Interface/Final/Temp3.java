//Blank_final 

class Temp3 {
    final int x; //if you make instant data member to blank_final then use constructorfor make
    Temp3(int x){ // parametrised constructor
       this.x = x;
    }

public static void main(String[] args) {
    Temp3 t1 = new Temp3(10);
    System.out.println(t1.x);
    //t1.x = t1.x+40; //not allowed
    Temp3 t2 = new Temp3(20);
    System.out.println(t2.x);
    //t2.x = t2.x+40;
}
    
}
