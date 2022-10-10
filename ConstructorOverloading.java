class Student{
    String name;
    int roll;
    char grade;
    double cgpa;
    
    public  Student(){
        name="None";
        roll=123;
        grade='n';
        cgpa=0.5;
        System.out.println("Constructor 1"); // Constructor 1
    }
    
    public Student(String s){
        name=s;
        System.out.println("Constructor 2"); // Constructor 2
    }
    public Student(int n,double f){
        roll = n;
        cgpa = f;
        System.out.println("Constructor 3"); // Constructor 3
    }
    public Student(char A){
        grade = A;
        System.out.println("Constructor 4"); // Constructor 4
    }
    public Student(String S,int A,char B,double N){
        name=S;
        roll=A;
        grade=B;
        cgpa=N;
        System.out.println("Constructor 5"); // Constructor 5
    }
    
    
    public void detail(){                  // method 
        System.out.println(name);
        System.out.println(roll);
        System.out.println(grade);
        System.out.println(cgpa);
    }   
    
    
    public void setName(String S){
        name=S;
    }
    public void  setRoll(int S){
        roll=S;
    }
    public void setGrade(char S){
        grade=S;
    }
    public void setCGPA(double S){
        cgpa=S;
    }
}


public class ConstructorOverloading
{
	public static void main(String[] args) {
    Student obj =  new Student();
    obj.setName("Hi");
    obj.detail();
    
	}
}