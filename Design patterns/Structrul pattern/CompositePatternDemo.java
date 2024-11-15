/*
Composite pattern is used where we need to treat a gromp of objects in similar way as a single object Composite pattern composes objects in term of a trer 
structure to represent part as well as whole hierarchy This type of design pattern comes under structural pattern as this pattern creates a tree structure 
of group of objects.
This pattern creates a class contains group of its own objects. This class provides ways to modify its group of same objects. We are demonstrating use of 
Composite pattern via following example in which show employees hierarchy of 3
an organization.
Implementation
We've a class Employee which acts as composite pattern actor class. Composite PatternDemo, our demo class will use Employee class to add department 
level hierarchy and print all employees.*/


import java.util.ArrayList;
import java.util.List;

class Employee
 {
private String name;
private String dept;
private int salary;
private List<Employee> subordinates;

// constructor
public Employee(String name, String dept, int sal) {
this.name = name;
this.dept = dept;
this.salary = sal;
subordinates = new ArrayList<Employee>(); 
}

public void add(Employee e){
	subordinates.add(e); 
}

public void remove(Employee e) {
subordinates.remove(e);
}


public List<Employee> getSubordinates(){
return subordinates;
}

public String toString(){ 
  return ("Employee :[Name "+ name 
  +", dept:"+ dept+", salary:"
  + salary+" ]");
}
 }



class CompositePatternDemo
 {
public static void main(String[] args) 
{
Employee CEO = new Employee("Modi ji", "CEO", 30000);

Employee headSales = new Employee("amitshah","Head Sales", 20000);

Employee headMarketing = new Employee("nirmla","Head Marketing", 20000);

Employee clerk1 = new Employee("sonia", "Marketing", 10000);
Employee clerk2 = new Employee("papuu","Marketing", 10000);

Employee salesExecutive1 = new Employee("manoj", "Sales", 10000); 
Employee salesExecutive2 = new Employee("rajnath", "Sales", 10000);

CEO.add(headSales); 
CEO.add(headMarketing);

headSales.add(salesExecutive1); 
headSales.add(salesExecutive2);


headMarketing.add(clerk1); 
headMarketing.add(clerk2);

//print all employees of the organization

System.out.println(CEO);
for (Employee headEmployee: CEO.getSubordinates())
{
System.out.println(headEmployee);
for(Employee employee: headEmployee.getSubordinates())
{
System.out.println(employee);

}
}
}
}
/*
D:\Design patterns\Structrul pattern>java CompositePatternDemo
Employee :[Name Modi ji, dept:CEO, salary:30000 ]
Employee :[Name amitshah, dept:Head Sales, salary:20000 ]
Employee :[Name manoj, dept:Sales, salary:10000 ]
Employee :[Name rajnath, dept:Sales, salary:10000 ]
Employee :[Name nirmla, dept:Head Marketing, salary:20000 ]
Employee :[Name sonia, dept:Marketing, salary:10000 ]
Employee :[Name papuu, dept:Marketing, salary:10000 ]
*/