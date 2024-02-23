class Copy {

    int x;
    int y;
    Copy(int x, int y){
        this.x=x;
        this.y=y;
    }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    Copy(Copy z){
        this.x=z.x;
        this.y=z.y;
    }
    public static void main(String[] args) {
        Copy c1 = new Copy(10,20);
        c1.show();
        Copy c2 = new Copy(c1);
        c1.show();
    }
}
