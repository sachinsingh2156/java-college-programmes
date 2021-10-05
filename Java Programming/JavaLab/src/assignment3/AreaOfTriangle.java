package assignment3;


	class triangle extends shapes{
	    double base= 5;
	    double height=3;
	   
	    String string1(){
	        return (shapename);
	    }
	    double area(){
	        return ( (base*height)/2);
	    }
	}
public class AreaOfTriangle {
    public static void main(String args[])
    {
        triangle s= new triangle();
        String s2 =s.string1();
        System.out.println(s2);
        double s1= s.area();
        System.out.println("Area of "+s2+" = "+s1);
        
    }
}




