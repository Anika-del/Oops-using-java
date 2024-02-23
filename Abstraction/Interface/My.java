// Show
// Show
// Display
//child class can implement more then one interface simuntenesly

interface My {
    void show();
    }
interface My1 extends My{
    void display();
}
interface My2 extends My, My1{
    void xyz();
}    
class Child implements My, My1{
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        My m = new Child();
        m.show();
        My1 m1 = new Child();
        m1.show();
        m1.display();
    }
}
