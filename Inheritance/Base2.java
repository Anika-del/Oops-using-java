class Base2 {

    A show(){
        System.out.println("Base");
        return new A();
    } 
}
class Child extends Base2{
    B show(){
       System.out.println("Child");
        return new B();
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.show();
    }
}

class A{

}
class B extends A{

}
