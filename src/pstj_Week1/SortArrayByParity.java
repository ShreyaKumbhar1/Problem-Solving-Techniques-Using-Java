package pstj_Week1;

import java.util.Scanner;

public class SortArrayByParity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] result = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        System.out.println("Array after sorting by parity:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}