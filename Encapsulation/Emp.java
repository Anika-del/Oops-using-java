//Sir ka Emp program
class Emp {
     String Ename;
     int Salary;
	 //use static keyword
     static String Cname = "TCS"; //if it is static to take same value for each object. we asigned so we not need to print every time TCS.
    
	void get(String s1, int s2){
        Ename = s1;
        Salary = s2;
        
     }
     void show(){
        System.out.println(Ename);
        System.out.println(Salary);
        System.out.println(Cname);
     }
     
     public static void main(String[] args) {
        Emp e1 = new Emp();
		Emp e2 = new Emp();
		e1.get("Lalu", 101);
		e2.get("Kailash", 201);
		e1.show();
		e2.show();
     }

}
