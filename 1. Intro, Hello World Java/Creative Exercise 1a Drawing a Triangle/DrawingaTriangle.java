//Creative Exercise 1a: Drawing a Triangle

public class DrawingaTriangle {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		//limit row number into 5
		while (i<=5) {
			//draw i-1 "*" in each row
			while (j <= i) {
				if (j < i) {
					System.out.print("*");
					j++;
				//statment for i=j condition
				} else {
					System.out.print("");	
					j++;
				}
			}					
			System.out.println("*");
			i++;
			j = 1;				
		}
	}		
}

