class This{

    void m(){
        System.out.println("hello m");
    }  
    void n(){  
    System.out.println("hello n");  //1
    //m();//same as this.m()  //2
    this.m();  
    }  
     
    public static void main(String args[]){  
    This a=new This();  
    a.n();  //first main function start
    }
}  