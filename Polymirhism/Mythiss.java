class Mythiss {

    int x = 100;
    void get(Mythiss this, int x){
        System.out.println(this + "getjajajajaj");//2
        System.out.println(this.x);//3
        System.out.println(x);//4
    }
    public static void main(String[] args) {
        Mythiss mt = new Mythiss();
        System.out.println(mt+ "main");//1
        mt.get(300);
    
}
}