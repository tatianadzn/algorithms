package sorting;

public class Insertion{
    public Insertion(){}

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if(a[j].compareTo(a[j - 1]) > 0) break;
                exch(a, j, j - 1);
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
