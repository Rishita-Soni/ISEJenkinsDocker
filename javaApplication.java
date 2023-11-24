public class javaApplication {
    public static void main(String[] args) {

        int[] numbers = { 5, 10, 3, 8, 15, 7 };
        int max = findMaxElement(numbers);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMaxElement(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
