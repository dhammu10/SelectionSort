import java.util.Scanner;

public class Main {
    public static void SelectionSort(int arr[], int n){
        int min, temp;
        for (int i=0; i<n-1; i++){
            min=i;
            for (int j=i+1; j<n; j++){
                if (arr[j]>arr[min]){
                    min =j;
                }
            }
            temp = arr[min];
            arr[min]= arr[i];
            arr[i] = temp;
        }

        for (int k=n-1; k>=0; k--){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr,n);

    }
}
