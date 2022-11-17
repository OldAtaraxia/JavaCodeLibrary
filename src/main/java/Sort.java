public class Sort {

    public int a = 1, b = 2;

    public void sort(String[] x) {
        sort(x, 0);
    }

    private void sort(String[] x, int start) {
        if (start == x.length) return;
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    public int findSmallest(String[] x, int start) {
        if (x.length == start) return -1;

        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            if (x[i].compareTo(x[smallestIndex]) < 0) { // x[i] < smallest
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }



    public void superPowerSort() {
        throw new UnsupportedOperationException();
    }
}
