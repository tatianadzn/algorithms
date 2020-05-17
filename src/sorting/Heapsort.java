package sorting;

public class Heapsort{

    public Heapsort(){}

    public static void sort(Comparable[] pq){
        int N = pq.length;
        for(int k = N / 2; k >= 1; k--){
            sink(pq, k, N);
        }

        while(N > 0){
            exch(pq, 1, N--);
            sink(pq, 1, N);
        }
    }


    private static void sink(Comparable[] pq, int k, int N){
        while(k * 2 <= N){
            int j = k * 2; //k's first child
            if(j < N && less(pq, j, j + 1)) j++;
            if(!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] pq, int i, int j){
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    private static void exch(Comparable[] pq, int i, int j){
        Comparable key = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = key;
    }

    public static void show(Comparable[] pq){
        for (int i = 0; i < pq.length; i++){
            System.out.println(pq[i]);
        }
    }
}
