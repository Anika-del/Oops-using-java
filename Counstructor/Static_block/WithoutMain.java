class WithoutMain {

    static{
        System.out.println("static block");
       // System.exit(0);   //exit here and not print main block
    }
    public static void main(String[] args) {
        System.out.println("main");
    }
    
}
