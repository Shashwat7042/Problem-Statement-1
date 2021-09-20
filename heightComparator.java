package sortobjects;
import java.util.Comparator;
public class heightComparator implements Comparator<Student>{
    
    public int compare(Student obj1, Student obj2) {
         return ((Double)obj1.getheight()).compareTo((Double)obj2.getheight());
    }
 
}
