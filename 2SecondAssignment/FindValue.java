class FindValue{

    public static void main(String[] args) {
        
    int x=2, y=5, z=0;
//a.
System.out.println("Find first expression :");
    if(x==2){
       System.out.println("Yes");
         }
    else{
       System.out.println("No");
         }
        
//b.
System.out.println("Find second expression :");
    if(x != 5){
       System.out.println("Yes");
         }
    else{
       System.out.println("No");
         }

//c.
System.out.println("Find third expression :");
    if(x!=5 && y>=5){
       System.out.println("Yes");
         }
    else{
       System.out.println("No");
         }

//d.
System.out.println("Find fourth expression :");
    if(z!=0 || x==2){
       System.out.println("Yes");
         }
    else{
       System.out.println("No");
         }

//e.
System.out.println("Find fifth expression :");
    if(!(y<10)){
       System.out.println("Yes");
         }
    else{
       System.out.println("No");
         }

}
}