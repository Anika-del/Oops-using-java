// Show
// Show
// Display


interface Myy {
    void show();
    }
interface Myy1 extends Myy{
    void display();
}
interface Myy2 extends Myy, Myy1{
    void xyz();
}    
class Child implements Myy, Myy1, Myyy2{
    public void show(){
        System.out.println("Child");
    }
    public void display(){
        System.out.println("Display");
    }
    public void xyz(){
        System.out.println("xyz");
    }

    public static void main(String[] args) {
        Myy m = new Child();
        m.show();
        Myy1 m1 = new Child();
        m1.show();
        //m1.display();
    }
}
