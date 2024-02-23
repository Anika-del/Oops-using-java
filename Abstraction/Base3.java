abstract class Base3 {

    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}
class Myregister{
    void register(Base3){
        b.display();
    }  
}
class Child extends Base3{
    void get(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        Myregister my = new Myregister();
        Myregister(c1);
    }
}
