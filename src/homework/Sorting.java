package homework;

public class Sorting {

    int[] array = new int[10];
    String string = "String";


    public static int[] sort(int[] array) {

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i-1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        for (int i = 0; i < sorting.array.length; i++) {
            sorting.array[i] = (int) (100 * Math.random());
        }

        Sorting.sort(sorting.array);

        for (int i = 0; i < sorting.array.length; i++) {
            System.out.println(sorting.array[i]);
        }


    }
}
