interface Temp1 {

    // final static int x; cannot assign a value to final variable x it is compalsary to initilize the value.

final static int x=10;   //int x;  if we make final then we need to initilize the value
    public static void main(String[] args) {
        //x=x+20; //after initilize value we can't modify the value we cant't make a data member final without initilization.
        System.out.println(x);
    }
  
}
