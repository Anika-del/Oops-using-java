//sir ka Emp1 program
class Emp4{
	
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
	
	public static void main(String ards[]){
		Emp4 e1 = new Emp4();
		
		//System.out.println(e1);
		e1.name = "Lalu";
        System.out.println(e1);
		System.out.println(e1.name);
		Emp4 e2 = e1;
		
		System.out.println(e2);
		e2.name = "Bhalu";
		System.out.println(e2.name);
		
	}
}