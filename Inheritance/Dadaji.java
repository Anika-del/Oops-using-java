//class Multiple {

    class Dadaji {

    int x=20;
    
    void show(){
        System.out.println(x);
    }
}

   class Base extends Dadaji {
    int x=80;
    int y=50;
    void show(){
        System.out.println(x);
    }
    void display(){
        System.out.println(y);
    }
}


class Child extends Base{
    void get(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.get(10,20); //  10 20
       // c1.show();  //80
      // c1.display();  //50

        //System.out.println(((Dadaji)this).x);
        //System.out.println(((Dadaji)super).x);
      // System.out.println(((Dadaji)c1).x);    //20
      // System.out.println(((Base)c1).x);   //80
       // System.out.println(((Base)c1).y);  //50

    }
}
