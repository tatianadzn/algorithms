package sorts;

public class Merge {

    private Merge(){}

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux,0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int beg, int end){
        if (end <= beg) return;
        int mid = beg + (end - beg) / 2;
        sort(a, aux, beg, mid);
        sort(a, aux, mid + 1, end);
        merge(a, aux, beg, mid, end);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int beg, int mid, int end){
        //check if already sorted and does not need merging
        if (less(a[mid], a[mid + 1])) {
            return;
        }
        //copy a[] into aux[]
        for(int i = beg; i <= end; i++){
            aux[i] = a[i];
        }

        int i = beg;
        int j = mid + 1;
        for (int k = beg; k <= end; k++){
            if (i > mid) {
                a[k] = aux[j++];
            }
            else if(j > end) {
                a[k] = aux[i++];
            }
            else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
