//GetX
class ViaMethod {

    int x = this.getX();
    int getX(){
    System.out.println(x);  //0
    return 10;
}
ViaMethod(){
    //x = 0;   //10
      x = this.getX();       //10   after compilation
    System.out.println(x);     //10
}
public static void main(String[] args) {
   new ViaMethod();
    
}
}