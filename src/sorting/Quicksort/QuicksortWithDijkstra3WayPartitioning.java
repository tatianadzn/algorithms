package sorting.Quicksort;

public class QuicksortWithDijkstra3WayPartitioning {
    public static void sort(Comparable[] a){
        // Std.Random.Shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int beg, int end){
        if (end <= beg) return;
        Comparable v = a[beg];
        int i = beg;
        int lt = beg;
        int gt = end;
        while(i <= gt){
            int cmp = a[i].compareTo(v);
            if(cmp < 0)         exch(a, i++, lt++);
            else if(cmp > 0)    exch(a, i, gt--);
            else                i++;
        }

        sort(a, beg, lt - 1);
        sort(a, gt + 1, end);
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
