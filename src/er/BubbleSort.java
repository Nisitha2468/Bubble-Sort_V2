package er;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[4];
		
		array[0] = 89;
		array[1] = 23;
		array[2] = 14;
		array[3] = 45;
		
		for(int i=1; i<(array.length); i++) {
			
			boolean swapped = false;
			
			for(int j = 1; j<=(array.length - i); j++) {
				if(array[j-1]> array[j]) {
					int x = array[j];
					array[j] = array[j-1];
					array[j-1] = x;
					
					swapped = true;
				}
			}
		}
		
		for(int n = 0; n<4; n++) {
			System.out.println(array[n]);
			
		}

	}

}
