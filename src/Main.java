public class Main {
    public static void filterEvenIndexOddValue (int [] arr) {
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
        int [] array = {1,2,3,3,4};
        int dominantCount = 0;
        int dominantValue = 0;
        int currentCounter = 0;
        int currentValue = 0;
        for (int i = 0; i < array.length -1 ; i++) {
            if (array[i] != array[i+1]) {
                if (currentCounter > dominantCount) {
                    dominantValue = array[i];
                    dominantCount = currentCounter;

                }


            }
            else{
                currentCounter++;
            }
        }
        return dominantValue;
    }
    public static void main(String[] args) {
        System.out.println("task 1");
        filterEvenIndexOddValue (new int [] {1, 2, 3, 4, 5, 6});
        System.out.println("");
        System.out.println("task 2");
        findDominant();
    }
}