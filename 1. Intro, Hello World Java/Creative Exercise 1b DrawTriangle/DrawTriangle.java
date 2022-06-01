public class DrawTriangle {
	public static void drawTriangle(int n) {
		int i=1;
		int j=1;
		//limit row number into n
		while (i<=n) {
			//draw i-1 "*" in each row
			while (j <= i) {
				if (j < i) {
					System.out.print("*");
				//statment for i=j condition
				} else {
					System.out.println("*");					
				}
				j++;
			}						
			i++;
			j = 1;				 
		}		
	}
	
	public static void main(String[] args) {
    	drawTriangle(10);
	}
}