/**
 * @author Robert Sedgewick+ an+

 */
/**
 * @author Robert Sedgewick and Kevin Wayne
 * Codigo extraidp de http://algs4.cs.princeton.edu/14analysis/Mergesort.java.html
 */


/**
 * @author Pablo Sao
 * @author Andrea Elias
 */

public class MergeSort implements Comparable<DatosNumericos>{
	
    private static int[] merge(int[] a, int[] b) {
   
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                   c[k] = b[j++];
        }
        return c;
    }
 	
    public static int[] mergesort(int[] input) {
        int N = input.length;
        if (N <= 1) return input;
        int[] a = new int[N/2];
        int[] b = new int[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = input[i];
        for (int i = 0; i < b.length; i++)
            b[i] = input[i + N/2];
        return merge(mergesort(a), mergesort(b));
    }
    
    //Check if array is sorted
    private static boolean isSorted(double[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }
    
     @Override
    public int compareTo(DatosNumericos o) {
        return o.dato2 > o.dato1? 1:0;
    }
}