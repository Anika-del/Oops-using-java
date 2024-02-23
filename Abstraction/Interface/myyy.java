//More then one Interface extends by Interface in inheritance
interface Myyy{
    default void show() {
       System.out.println("MYYY");
    }
}
interface Myyy1{
    default void show(){
        System.out.println("MYYY1");
    }
}
interface Myyy2 extends Myyy, Myyy1{
    default void show(){
        System.out.println("Child");
    }
}
class Child implements Myyy, Myyy1, Myyy2{
    public void show(){
        System.out.println("Childd");
    }
    public static void main(String[] args) {
        Myyy m = new Child();
        m.show();
        Myyy1 m1 = new Child();
        m1.show();
         Myyy2 m2 = new Child();
        m2.show();
        /* #Output  
        Childd   
        Childd   
        Childd 
       // because child print child class 
*/
/*
 Myyy m = new Myyy();
        m.show();

        //myyy.java:21: error: Myyy is abstract; cannot be instantiated
       // Myyy m = new Myyy();
 */
    }
}