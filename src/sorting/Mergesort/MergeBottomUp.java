package sorting.Mergesort;

public class MergeBottomUp {
    private static Comparable[] aux;

    private MergeBottomUp() {}

    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];

        for(int sz = 1; sz < N; sz = sz + sz){
            for(int beg = 0; beg < N - sz; beg += sz + sz){
                //middle in the (beg + sz - 1) because length of the merged array is 2 * sz
                //end either in (beg + 2 * sz - 1) or the last element of the whole array
                merge(a, beg, beg + sz - 1, Math.min(beg + sz + sz - 1, N - 1));
            }
        }

    }

    private static void merge(Comparable[] a, int beg, int mid, int end){
        //if it is already sorted
        if (less(a[mid], a[mid + 1])) return;

        for(int i = beg; i <= end; i++){
            aux[i] = a[i];
        }

        int i = beg;
        int j = mid + 1;
        for (int k = beg; k <= end; k++){
            if (i > mid)                        a[k] = aux[j++];
            else if (j > end)                   a[k] = aux[i++];
            else if (less(aux[i], aux[j]))      a[k] = aux[i++];
            else                                a[k] = aux[j++];
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
