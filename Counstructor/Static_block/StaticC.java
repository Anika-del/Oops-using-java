//java 1.6 se phle static block support karta tha and execute krke onl error deta tha main not found
class StaticC {


    static int x;
    static{
        System.out.println("Static block");
        x = new java.util.Scanner(System.in).nextInt();
    }
}

class StaticTest1{
    public static void main(String[] args) {
        System.out.println("main from Static Test1");
        System.out.println(StaticC.x);

        System.out.println("after static block from StaticTest1");
    }     
    }

    class StaticTest2{

        public static void main(String[] args) {
            System.out.println("main fron StaticTest2");
            System.out.println(StaticC.x);
            System.out.println("after static block from StaticTest2");
        }
    }
    

