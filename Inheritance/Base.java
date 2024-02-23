// output
// Base
// 10
// 20
class Base {

    int x;
    int y;
    void show(){
        System.out.println("Base");
        System.out.println(x);
        System.out.println(y);
    }
}
class Child extends Base{
    void get(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.get(10,20);
        c1.show();
       // c1.show();
    }
}
