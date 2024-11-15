class Default {
    
    int x ; String s;
   /* Default(){
        x=10;
        s="suu";
    }*/
    void show(){
       System.out.println(x);
       System.out.println(s);
    }
    public static void main(String[] args) {
        Default d1 = new Default();
        d1.show();
        Default d2 = new Default();
        d2.show();
    }
}
