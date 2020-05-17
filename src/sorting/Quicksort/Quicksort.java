package sorting.Quicksort;

public class Quicksort {
    private static int partition(Comparable[] a, int beg, int end){
        int i = beg;
        int j = end + 1;
        while(true){
            while(less(a[++i], a[beg])){
                if(i == end) break;
            }
            while(less(a[beg], a[--j])){
                if(j == beg) break;
            }
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, beg, j);
        return j;
    }

    public static void sort(Comparable[] a){
//        Std.Random.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int beg, int end){
        if (beg >= end) return;
        int j = partition(a, beg, end);
        sort(a, beg, j - 1);
        sort(a, j + 1, end);
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
    }
}
