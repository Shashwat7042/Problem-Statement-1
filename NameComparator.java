 package sortobjects;
import java.util.Comparator;
 public class NameComparator implements Comparator<Student>{
   
    public int compare(Student obj1, Student obj2) {
     
         return obj1.getName().compareTo(obj2.getName());
    }
}
