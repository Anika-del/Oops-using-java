//interface always by Default Final and Static
/*
interface My1 {

    int x = 20;    
}
class Child implements My1{
    public static void main(String[] args) {
        System.out.println(My1.x);
        My1 = My1.x + 20;
    }
}
*/

//or

interface My1{
    int x = 20;
    }
 class Child implements My1{

    public static void main(String[] args) {
        System.out.println(x);
       // x = x+20;
    }
}