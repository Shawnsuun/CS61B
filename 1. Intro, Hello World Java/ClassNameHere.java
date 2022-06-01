public class ClassNameHere {
	public static void main(String[] args) {
		
		//Basic Conditionals
		int x = 5;

		if (x < 10)
			x = x + 10;
		
		if (x < 10)
			x = x + 10;
		
		System.out.println(x);

		//else code 1
		x = 9;
		if (x - 3 > 8) {
		    System.out.println("x - 3 is greater than 8");
		} else {
   			 System.out.println("x - 3 is not greater than 8");
   		}
		
		//else code 2
		int dogSize = 20;
		if (dogSize >= 50) {
		    System.out.println("woof!");
		} else if (dogSize >= 10) {
   			 System.out.println("bark!");
		} else {
    		System.out.println("yip!");
		}

		//while loop
		int bottles = 99;
		while (bottles > 0) {
    		System.out.println(bottles + " bottles of beer on the wall.");
    		bottles = bottles - 1;
		}

		//Doubles and Strings
		String a = "Achilles";
		String t = "Tortoise";
		double aPos = 0;
		double tPos = 100;
		double aSpeed = 20;
		double tSpeed = 10;
		double totalTime = 0;
		while (aPos < tPos) { 
		    System.out.println("At time: " + totalTime);
		    System.out.println("    " + a + " is at position " + aPos);
		    System.out.println("    " + t + " is at position " + tPos);

		    double timeToReach = (tPos - aPos) / aSpeed;
		    totalTime = totalTime + timeToReach;
		    aPos = aPos + timeToReach * aSpeed;
		    tPos = tPos + timeToReach * tSpeed;
		}

		//arrays general way in java
		int[] numbers = new int[3];
		numbers[0] = 4;
		numbers[1] = 7;
		numbers[2] = 10;
		System.out.println(numbers[1]);	

		//arrays alternative in java
		int[] numbers_1 = new int[]{4, 7, 10};
		System.out.println(numbers_1[1]);
		System.out.println(numbers_1.length);
	}

	/** Uses a while loop to sum a. */
	public static int whileSum(int[] a) {
	    int i = 0; //initialization
	    int sum = 0;
		while (i < a.length) { //termination
	        sum = sum + a[i];
	        i = i + 1; //increment
	    }
	    return sum;
	}

    /** Uses a basic for loop to sum a. */
    public static int sum(int[] a) {
	    int sum = 0;
	    for (int i = 0; i < a.length; i = i + 1) {
    		sum = sum + a[i];
    	}
    	return sum;
    }
}