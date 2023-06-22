package OOPS;

public class SXChen implements Sapxep{
    @Override
    public void sxTang(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sxGiam(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
}
