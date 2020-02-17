package tEST.one.multipleinheritanc;

public class Demo {
	
	public static String increment(String number) {
	    char[] cars = number.toUpperCase().toCharArray();
	    String result="";
	    for (int i = cars.length - 1; i >= 0; i--) {
	    	if(i==0) {
	    		if(cars[0] == '9') {
	    			cars[0]='0';
	    			return result=1+String.valueOf(cars);
	    		}
	    	}
	        if (cars[i] == 'Z') {
	            cars[i] = 'A';
	            result=String.valueOf(cars);
	        } else if (cars[i] == '9') {
	            cars[i] = '0';
	            result=String.valueOf(cars);
	        } else {
	            cars[i]++;
	            result=String.valueOf(cars);
	            break;
	        }
	    }
	    return result;
	}
public static void main(String[] args) {
//	Parent1 child = new Child_InnerClass();
//	child.message1();
//	
//	Child_InnerClass.Innerchild innerChild = new Child_InnerClass().new Innerchild();
//	innerChild.message2();
	
	String str = increment("Z99A");
	System.out.println(str);
	char[] ch = "hello".toCharArray();

	
}

}
