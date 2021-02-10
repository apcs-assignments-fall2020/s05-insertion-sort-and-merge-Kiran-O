import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int k = 1; k < list.size(); k++){
            int ynk = list.get(k);
            int m = k - 1;
            while ((m > - 1) && (list.get(m) > ynk)){
                list.set(m + 1, list.get(m));
                m--;


            }
            list.set(m + 1, ynk);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int [] jkl = new int[arr1.length + arr2.length];
        int k = 0;
        int m = 0;
        int i = 0;

        while (k < arr1.length && m < arr2.length){
            if (arr1[k] < arr2[m]){
                jkl[i] = arr1[k];
                k++;
            }
            else {
                jkl[i] = arr2[m];
                m++;
            }
            i++;
        }
        while (k < arr1.length){
            jkl[i] = arr1[k];
            k++;
            i++;
        }
        while (m < arr2.length){
            jkl[i] = arr2[m];
            m++;
            i++;
        }
        return jkl;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
