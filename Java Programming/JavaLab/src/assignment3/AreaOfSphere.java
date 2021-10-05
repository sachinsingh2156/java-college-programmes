package assignment3;

abstract class shape{
	String shapename="sphere";
	abstract double area();
	abstract String string1(); 
}
	class sphere extends shape{
	    double radius= 4;
	    static double pi=3.14;
	    
	    String string1(){
	        return (shapename);
	    }
	    double area(){
	        return 4*pi*radius*radius;
	    }
	}
public class AreaOfSphere {
	 public static void main(String args[]){
		 sphere s= new sphere();
	     String s2 =s.string1();
	     System.out.println(s2);
	     double s1= s.area();
	     System.out.println("Area of "+s2+" = "+s1);
	        
	 }
}

