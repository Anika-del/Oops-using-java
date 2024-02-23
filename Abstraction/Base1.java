abstract class Base1 {

    int x;
    int y;
    void show(){
    System.out.println(x);
    System.out.println(y);
    }
    //  abstract void display(){
    // System.out.println("Display");
    //  }  
}
class Child extends Base1{
    void get(int x, int y){
        this.x = x; 
        this.y = y;
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.get(10,20);
    }
} 

