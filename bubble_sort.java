package sort;
	public class bubble_sort {
		public static void main(String[] args) {
				
			int arr[] = new int[5];
				
			arr[0] = 20;
			arr[1] = 12;
			arr[2] = 45;
			arr[3] = 97;
			arr[4] = 85;
			
			for(int i = 1 ; i < (arr.length) ; i++) {
				for(int j = 0 ; j < (arr.length - 1) ; j++) {
					//swap values	
					if(arr[j] > arr[j+1]) {
						int a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
					}
				}
			}
		}
	}


