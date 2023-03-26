package JavaInterviewPrograms;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {

		int arr[] = {5,8,2,7,9};
		
		int max=arr[0];
		int min =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			for(int j=1;j<arr.length;j++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			
		}
		System.out.println("Max number in array :"+max);		
		System.out.println("Min number in array :"+min);

	}

}
