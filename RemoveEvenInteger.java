public class RemoveEvenInteger {
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int[] removeEven(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount]; //creating result array of odd count
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[index] = array[i];
                index++;


            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
    }
}
