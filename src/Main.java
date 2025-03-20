import java.util.HashMap;
public class Main {
    public static void filterEvenIndexOddValue () {
        int[] arr = {1,2,3,4,5,6};
        int counter = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i=i+2) {
            if (arr[i] % 2 != 0) {
                len +=1;
            }
        }
        int[] newarr = new int[len];
        for (int i = 0; i < arr.length; i = i + 2) {
            if (arr[i] % 2 != 0) {

                newarr[counter] = arr[i];
                System.out.print(arr[i] + " ");
                counter++;




            }

        }
        System.out.println();
        for (int i = 0; i < newarr.length; i++) {

            System.out.print(newarr[i] + ",");
        }
    }
    public static int findDominant() {
        int [] arr2 = {4,2,1,1,3};
        int n = arr2.length;
        if (n == 0) {
            System.out.println(-1);
            return -1;
        }
        else {
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int currentNumber : arr2) {
                freqMap.put(currentNumber, freqMap.getOrDefault(currentNumber, 0) + 1);
            }
            for (int num : freqMap.keySet()) {
                if (freqMap.get(num) > 1) {
                    System.out.println(num);
                    return num;
                }
            }
            System.out.println(-1);
            return -1;
        }


    }
    public static int [] rotateArray() {
        int [] arr3 = {1,2,3,4,5,6};
        int positions = 7;
        int [] newarr = new int[arr3.length];
        while (positions > arr3.length) {
            positions -= arr3.length;
        }
        int [] newPositions  = new int[arr3.length];
        int [] newSpot = new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            newSpot[i] = i - positions ;
            if (newSpot[i] < 0) {
                newSpot[i] = arr3.length - positions + i;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            newPositions[i] = arr3[newSpot[i]];
            System.out.print(newPositions[i] + ",");
        }
            return newarr;
    }
    public static void main(String[] args) {
        System.out.println("task 1");
        filterEvenIndexOddValue ();
        System.out.println("");
        System.out.println("task 2");
        findDominant();
        System.out.println("");
        System.out.println("task 3");
        rotateArray();

    }
}
