class Base {

    abstract void doTask(){
        
    }
    class Child extend Base {
        public static void main(String[] args) {
            Base.b=new Base();
            b.doTask(); 
        }
    }
    
}
