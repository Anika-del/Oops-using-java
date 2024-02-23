class Default {
    
    int x , y;
    Default(){
        x=10;
        y=20;
    }
    void show(){
       System.out.println(x);
       System.out.println(y);
    }
    public static void main(String[] args) {
        Default d1 = new Default();
        d1.show();
        Default d2 = new Default();
        d2.show();
    }
}
