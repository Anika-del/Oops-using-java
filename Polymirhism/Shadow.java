class Shadow {

    int x = 10;
    void show(int y){
     System.out.println(x);
     System.out.println(y);
    }
    public static void main(String[] args) {
        Shadow s1 = new Shadow();
        s1.show(20);
    }
    
}
