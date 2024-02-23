//Sir ka Emp program which in 2class in a program and sum function
class Emp3 {

        String name;
        int salary;
		static String cname = "TCS"; 
       
        void get(String s1, int s2){
           name = s1;
           salary = s2;
        }
		
           void show(){
           System.out.println(name);
           System.out.println(salary);
		   System.out.println(cname); 
        }
		
		static int add(int a, int b){
			return a+b;
		}
        
        public static void main(String args[]){
           Emp3 e1 = new Emp3();
          
		   e1.get("Lalu", 101);
         e1.show();
		   
           System.out.println(cname);
           System.out.println(Emp3.cname);

           int z = Emp3.add(10,20);
           System.out.println(z);
           
           z = add(20, 200);
           System.out.println(z);
          
        }  		
}

//Second class which is access first class variables and show method
class Demo{
	public static void main(String args[]){
		Emp3 e2 = new Emp3();
		
		e2.get("Bhalu", 101);
      e2.show();
	
	 int z = Emp3.add(10,300);
	 System.out.println(z);
	 System.out.println(Emp3.cname);
	
     }
  }