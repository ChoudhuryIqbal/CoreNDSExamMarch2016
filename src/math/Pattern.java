package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 * 
		 */
		String st="";
		int i=100;
		int cursor=1;
		int minusValue=1;
		while(i>0){

			for(int j=i;j>i-(10*cursor);j-=minusValue){
				System.out.print(j+" ");
			}
			i=i-(10*cursor);
			cursor++;
			minusValue++;
		}

		
		
		

	}
}
