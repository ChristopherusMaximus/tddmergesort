package de.kohnlehome;

public class ParallelSortThreshold implements ISortAlgorithm {
    private IMerger merger;

    public ParallelSortThreshold(IMerger merger) {
        this.merger = merger;
    }

    @Override
    public int[] sort(int[] unsortedArray) {
        int threshold = 3;
        SortierenTaskThreshold sortierenTaskThreshold = new SortierenTaskThreshold(unsortedArray, merger, threshold);
        sortierenTaskThreshold.invoke();
        return sortierenTaskThreshold.join();
    }
}

