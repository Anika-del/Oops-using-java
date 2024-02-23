class Emp1 {
     String Ename;
	  int Salary;
	  //without static keyword
	  String Cname;
    // when we not give static
     //then by default each data type take instant value which is we not need to define.
     void get(String s1, int s2, String s3){
        Ename = s1;
		  Salary = s2;
		  Cname = s3;
        
       
   }
     void show(){
        System.out.println(Ename);
		  System.out.println(Salary);
		  System.out.println(Cname);
       
       
     }
     
     public static void main(String[] args) {
        Emp1 e1 = new Emp1();
        e1.get("Lalu", 300, "Wipro");
        e1.show();
       
       
     }

}
