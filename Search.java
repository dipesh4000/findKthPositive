import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        findKthPositive(arr,5);


    }

    public static int findKthPositive(int[] arr, int k) {
        int[] temp = new int[1];
        int j = 0;
        int p = 1;
        int i = 0;
        while(i < k){
            while(j < arr.length){
                if(arr[j] != p){
                    temp[0] = p;
                    i++;
                }else j++;
                if(i == k){
                    break;
                }
                p++;
            }
            temp[0] = p;
            p++;
            i++;
        }
        return temp[0];
    }
}






























