class InitBlock{
    int x;
    {
        this.x=10;
        System.out.println("Init_Block");
    }
    InitBlock(){
        System.out.println("Default");
        System.out.println(x);
    }
    InitBlock(int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        new InitBlock();
        new InitBlock(10);
    }
}