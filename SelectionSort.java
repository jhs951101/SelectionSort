package pkg;

public class SelectionSort {
	
    public void main() {
	int arr[] = {4, 3, 1, 5, 2};
        // arr: 정렬할 값들이 들어있는 배열

        for(int x=0; x<arr.length-1; x++){
            for(int y=x+1; y<arr.length; y++){
                // 오름차순 정렬이므로 왼쪽 값이 더 크면 서로 맞바꿈
                if(arr[x] > arr[y]){
                    int swap = arr[x];
                    arr[x] = arr[y];
                    arr[y] = swap;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
    	SelectionSort main = new SelectionSort();
    	main.main();
    }
}
