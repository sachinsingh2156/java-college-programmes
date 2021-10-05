package assignment3;

abstract class shapes{
   String shapename="Rectangle";
   abstract double area();
   abstract String string1();
}
class rectangle extends shapes{
    double length= 8;
    double width=4;
    
    String string1(){
        return (shapename);
    }
    double area(){
        return length*width;
    }
}
public class AreaOfRectangle{
    public static void main(String args[]){
        rectangle s= new rectangle();
        String s2 =s.string1();
        System.out.println(s2);
        double s1= s.area();
        System.out.println("Area of "+s2+"= "+s1); 
    }
}

