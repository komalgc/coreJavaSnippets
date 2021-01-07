public class passarrayandsum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = sumarray(arr);
        System.out.println("The sum of array is " + sum);

    }

    public static int sumarray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }
        return sum;
    }

}
