//class UpDownCasting {

class UpDownBase{

        int x=20;
        void show(){
            System.out.println("Base");
        }
    }
    class Child extends UpDownBase{

        int x=30;
        void show(){
            System.out.println("Child");
        }
        void display(){
            System.out.println("Display");
        }
        public static void main(String[] args) {
            UpDownBase b = new Child(); //UpCasting
            b.show();                  //Child
            Child c1 = new Child();  //DownCasting
            c1.display();             //Display
            System.out.println(b.x);  //20
            System.out.println(c1.x); //30
        }
    }
    

