package assignment;
class Student
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Student()
    {
        System.out.println("student default constructor ");
        
    }
    public Student(String n,int a,String e,String add)
    {
        this.name = n;
        this.age = a;
        this.email = e;
        this.address =add; 
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }
}
class Teacher
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Teacher()
{
    System.out.println("teacher default constructor");
}
public Teacher(String n,int a,String e,String add)
{
    this.name=n;
    this.age=a;
    this.email=e;
    this.address=add;
}
 public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }
}





public class Assignment3
{
	public static void main(String[] args) {
	    System.out.println("student details:");
	    Student s1 = new Student("Sunil",23,"suneel@gmail.com","Hyderabad");
            Student s2 = new Student();
	    System.out.println(s1.getName());
	    System.out.println(s1.getAge());
	    System.out.println(s1.getEmail());
	    System.out.println(s1.getAddress());
	    System.out.println("teacher details:");
	    Teacher t1 = new Teacher("gopal",40,"gopal@gmail.com","Hyderabad");
            Teacher t2 = new Teacher();
	    System.out.println(t1.getName());
	    System.out.println(t1.getAge());
	    System.out.println(t1.getEmail());
	    System.out.println(t1.getAddress());
	    batch b1=new batch();
	    
	}
}

class batch
{
    private String name;
    private int size;
    private Student[] student;
    private Teacher teacher;
    public batch()
    {
        System.out.println("batch default constructor");
    }
public batch(String name, int size)
{
    this.name=name;
    this.size=size;
    
}
 public String getName()
    {
        return name;
    }
    public int getSize()
    {
        return size;
    }
    
}