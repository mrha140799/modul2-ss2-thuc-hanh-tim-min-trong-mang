package SS2TH5;

public class FindValueMin {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Min = " + findValueMin(array));
    }
    private static int findValueMin(int array[]) {
        int min = array[0];
        for (int i = 1 ; i < array.length ; i++ ) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return  min;

    }
}
