package sortobjects;
import java.util.Comparator;
public class ageComparator implements Comparator<Student>{
    
    public int compare(Student obj1, Student obj2) {
     
         return ((Integer)obj1.getage()).compareTo((Integer)obj2.getage());
    }
   
 
}
