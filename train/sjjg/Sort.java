package train.sjjg;

public class Sort {

    //插入排序
    public void insertion_sort(int[] arr,int first,int end){
        for(int i=first+1;i<end;i++){
            int j=i-1;
            int k=arr[i];
            while(j>=first&&arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
    }

}
