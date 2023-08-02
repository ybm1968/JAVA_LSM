import java.util.Scanner;

public class note {

		    public static void main(String[] args) {

		        int arr[] = new int[6];
		        Scanner sc = new Scanner(System.in);

		        for (int i = 0; i < arr.length; i++) {
		                arr[i] = sc.nextInt();
		        }



		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr.length -1; j++) {

		                if(arr[j] > arr[j+1])  {
		                    // 두 요소를 교환
		                   int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;

		                }
		                }
		            System.out.print(i + "회차 : ");
					for (int k : arr) {
						System.out.print(k + " ");
					}
					System.out.println();
		                }
		                for (int i = 0; i < arr.length; i++) {
		                    System.out.print(arr[i] + " ");

		                }
		                System.out.println();

		                sc.close();
		            }
	}

