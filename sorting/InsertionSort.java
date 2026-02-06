package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        //System.out.println("Insertion Sort!!!");
        int n = input.length;
        int steps=0;
        for (int i = 1; i < n; i++) {
            steps++;
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && key < input[j]) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
        System.out.println("InsertionSort steps: " + steps);
    }
}
