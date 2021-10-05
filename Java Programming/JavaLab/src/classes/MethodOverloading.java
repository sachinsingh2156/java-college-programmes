package classes;

class Addition {
    public void add(int a, int b) {
         System.out.println("Sum = "+ (a+b)+" (First method)");
    }
    public void add(float a, float b) {
         System.out.println("Sum = "+ (a+b)+" (Second method)");
    }
    public void add(int a, float b) {
        System.out.println("Sum = "+ (a+b)+" (Third method)");
    }
    public void add(int a, int b, int c) {
        System.out.println("Sum = "+ (a+b+c)+" (Fourth method)");
    }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Addition obj = new Addition();
	       obj.add(20, 40);
	       obj.add(2.55f, 7.65f);
	       obj.add(20, 14.14f);
	       obj.add(10,20,30);
	}
}
