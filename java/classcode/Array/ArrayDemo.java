class Demo{
	public static void main(String[] args){
		// Three ways to define array
		int arr[] = new int[4];
		   arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
		System.out.println(arr[0]);

		int arr1[] = {10,20,30,40};
		System.out.println(arr1[3]);


		int arr2[] = new int[]{10,20,30,40};
		System.out.println(arr2[2]);
	}
}

