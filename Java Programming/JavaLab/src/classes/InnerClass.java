package classes;

class outer {

	  int outdata = 10;

	  void display() {
	    inner inobj = new inner();
	    System.out.println("      Accessing from outer class");
	    System.out.println("**************************************");
	    System.out.println("The value of out-data = " + outdata);
	    System.out.println("The value of in-data = " + inobj.indata);
	  }

	  class inner {

	    int indata = 20;

	    void inmethod() {
	    	System.out.println();
	    	System.out.println("      Accessing from inner class");
	    	System.out.println("**************************************");
	    	System.out.println("The sum of in-data & out-data = " + (outdata + indata));
	    }
	  }
	}

public class InnerClass {

	public static void main(String[] args) {
		 	outer outobj = new outer();
		    outobj.display();
		    outer.inner inobj1 = outobj.new inner();
		    inobj1.inmethod();

	}

}


	