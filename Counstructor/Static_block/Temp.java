class Temp {

    static Demo d;
    static{
        System.out.println("static block from Temp");
        d = new Demo();
    }   
}
class Demo{
    void show(int x){
        System.out.println(x);
    }
}
class Temp1{
    public static void main(String[] args) {
        System.out.println("main fron Temp1");
        Temp.d.show(10);  // smiliar to System.out.println();
    }
}
