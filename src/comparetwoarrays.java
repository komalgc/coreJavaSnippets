import java.util.ArrayList;

public class comparetwoarrays {

    // Compare two arrays and store that in sep array

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,6,3,7,5};

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i=0; i<a.length; i++){

            if (a[i] == b[i]){

                al.add(a[i]);
            }
        }

        Object[] c = al.toArray();

        for(Object obj : c){

            System.out.println(obj);
        }

    }
}
