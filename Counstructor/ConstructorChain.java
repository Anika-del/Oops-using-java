class ConstructorChain {

    
    ConstructorChain(){
        this(10);
        System.out.println("Default");  //3
    }
    ConstructorChain(int x){
       this(10,20);
       System.out.println(x);     //2
    }
    ConstructorChain(int x, int y){
        System.out.println(x+y);     //1
    }
    public static void main(String[] args) {
        new ConstructorChain();
       // new ConstructorChain(10);
        new ConstructorChain(10,30); //40 at last
    }
    
}
