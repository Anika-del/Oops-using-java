class Emp2 {
     String Ename;
     int Salary;
    
     void get(String s1, int s2){//String s3
        Ename = s1;
        Salary = s2;
       
     }
     //whiout using show function

     
   //      void show(){
   //      System.out.println(Ename);
   //      System.out.println(Salary);
       
   //   }
     
     public static void main(String[] args) {
        Emp2 e1 = new Emp2();
        Emp2 e2 = new Emp2();
       
        e1.get("Lalu", 201);
        e2.get("kalu", 101);
        System.out.println(e1.Ename);
        System.out.println(e1.Salary);
        System.out.println(e2.Ename);
        System.out.println(e2.Salary);
		
		System.out.println(e1);
        System.out.println(e2);
       
     }

}

