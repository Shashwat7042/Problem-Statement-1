package sortobjects;
import java.util.Comparator;
public class percentComparator implements Comparator<Student>{
    
    public int compare(Student obj1, Student obj2) {
         return ((Double)obj1.getpercent()).compareTo((Double)obj2.getpercent());
    }
 
}
