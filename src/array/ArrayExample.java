package array;

import java.util.Scanner;

public class ArrayExample {
    public static void initArray() {
        int size = 10;
        int arr[] = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void arrSort(int ary[]) {
        int i, j;
        for (i = 0; i < ary.length; i++)
            for (j = i + 1; j < ary.length; j++) {
                if (ary[i] < ary[j]) {
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
    }
    public static void main(String[] args) {
        int newArray[] = {1, 34, 4};
        arrSort(newArray);
        System.out.println(newArray);
    }
}
