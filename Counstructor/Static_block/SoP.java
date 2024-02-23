//system.out.prinln (10) ==== SoP d show(10)

class SoP {
    static Demo d;
    static{
        d= new Demo();
    }
}
class Demo{
    void show(int x){
        System.out.println(x);
    }
}
class Sop1{
    public static void main(String[] args) {
        System.out.println("main from SoP1");
        SoP.d.show(10);
    }
}
