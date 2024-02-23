interface DisplayInterface {
    void show();
}
class Child implements DisplayInterface{
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    } //we only create display function ,we not create interface, but when child class display call give error ,
    // child class first priority search parent class if display need then print otherwise give error
    public static void main(String[] args) {
        DisplayInterface d = new Child();
       // d.display(); //error
    }
}
