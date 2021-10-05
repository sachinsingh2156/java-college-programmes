package classes;

class Demo{
    int  value1;
    int  value2;
    Demo(){
     value1 = 0;
     value2 = 0;
     System.out.println("Inside 1st Constructor");
    }
    Demo(int a){
    value1 = a;
    System.out.println("Inside 2nd Constructor");
    }
    Demo(int a,int b){
    value1 = a;
    value2 = b;
    System.out.println("Inside 3rd Constructor");
    }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.display();
	    Demo d2 = new Demo(30);
	    d2.display();
	    Demo d3 = new Demo(30,40);
	    d3.display();

	}
}
