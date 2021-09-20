package sortobjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 

public class Sort {
 
     public static void main(String[] args){
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("Enter the Number of Students");
    	 int N = s.nextInt();
    	 if(N <= 50)
    	 {
    		 System.out.println("Enter the Name of the class");
    	 }
    	 else
    	 {
    		 System.out.println("Enter the correct number");
    	 }
    	 
    	 String st = s.next();
    	 if(st.equals("A") || st.equals("D") || st.equals("E"))
    	 {
    		 System.out.println("Enter the data of boys and girls ");
    	 }
    	 else if(st.equals("B"))
    	 {
    		 System.out.println("Enter the data of the girls only");
    	 }
    	 else if(st.equals("C"))
    	 {
    		 System.out.println("Enter the data of the boys only");
    	 }
    	 else
    	 {
    		 System.out.println("Enter the correct class name ");
    	 }
    	 
    	 
    	 List<Student> studentlist= new ArrayList<Student>();
    	 for(int i=0;i<=N;i++) 
    	{
    		String name = s.next();
       	    int age = s.nextInt();
       	    double height = s.nextDouble();
       	    double per = s.nextDouble();
       	    
       	    studentlist.add(new Student(name,age,height,per));
    	}
    	System.out.println("-------------------------------------------------------------------");
   
         for (Student student : studentlist) {
            System.out.println(student);
        }
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter the attribute on which you want to sort");
		String str = s.next();
		
		if(str.equals("Name"))
		{
			Collections.sort(studentlist,new NameComparator());
		}
		else if(str.equals("age"))
		{
			Collections.sort(studentlist,new ageComparator());
		}
		else if(str.equals("height"))
		{
			Collections.sort(studentlist,new heightComparator());
		}
		else if(str.equals("percent"))
		{
			Collections.sort(studentlist,new percentComparator());
		}
		else
		{
			System.out.println("Enter the correct attribute");
		}
        
        
         for (Student student : studentlist) {
            System.out.println(student);
        }
    }
 
}
