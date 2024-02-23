class Temp {

    int x = 10;
    void show(Temp z, int x){
        System.out.println(x);
        System.out.println(z.x);
    }
    public static void main(String[] args) {
        Temp t1 = new Temp();
        System.out.println(t1.x);
        t1.show(t1,20);
       
    }
    
}
