class A2 {
    {
        System.out.println("Init block of class A2");
    }
    A2(){
       //super()
       //init block code will be pasted here after compilation.
       System.out.println("A2");
    }
}
class B2 extends A2{
    {
        System.out.println("Init block of class B2");
    }
    B2(int x){
        //super();
        //init block code will be pasted here after compilation
        System.out.println(x);
    }
    B2(){
        //super();
        //init block code will be pasted here after compilation
        System.out.println("B2");
    }
}
class C2 extends B2{
    {
        System.out.println("Init block of class A2");
    }
    C2(){
        //super();
        //init block code will be pasted here after compilation
       System.out.println("C2");
    }
    C2(int x){
        //super();
        //init block code will be pasted here after compilation
        System.out.println(x);
    }
    public static void main(String[] args) {
        //new C2();
        // Init block of class A2          //A2
       //Init block of class B2           //B2
      //Init block of class A2           //C2
      new C2(12);
   /*    Init block of class A2
A2
Init block of class B2
B2
Init block of class A2
12                                  //parmiter conscructor of C2
*/
    }
}
