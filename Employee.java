class Employee 
{ 
 int sal; 
 void getSalary() 
 { 
  sal=50000; 
 } 
} 
class Manager extends Employee 
{ 
 int ta,hra,totalsal; 
 void getSalary() 
 { 
  super.getSalary(); 
  ta=10000; 
  hra=1500; 
  totalsal=sal+ta+hra; 
 } 
 void display() 
 { 
  System.out.println("Employee salary : "+sal); 
  System.out.println("Manager salary: "+totalsal); 
 } 
 public static void main(String a[]) 
 { 
  manager m=new manager(); 
  m.getSalary(); 
  m.display(); 
 } 
} 
