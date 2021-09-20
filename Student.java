package sortobjects;

public class Student {
    
    String name;
    int age;
    double height;
	double percent;
 
Student(String name, int age, double height, double percent){

        this.name=name;
        this.age=age;
        this.height=height;
		this.percent=percent;
		
}
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public double getheight() {
        return height;
    }
    public void setheight(double height) {
        this.height = height;
    }
	public double getpercent() {
        return percent;
    }
    public void setpercent(double percent) {
        this.percent = percent;
    }
    
    public String toString() {
        return ("Name:"+name+"\tage:"+age+"\tHeight"+height+"\tPercent"+percent);
    }
 
}

