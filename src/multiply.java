public class multiply {

    public static void main(String[] args) {

        int sum = multiply(5,10);

        System.out.println("The multily " + sum);

    }

    public static int multiply(int i, int j){
        int sum = 0;
        int k=1;

        while(k<=j){

            sum = sum + i;
            k++;
        }

        return  sum;


    }

}
