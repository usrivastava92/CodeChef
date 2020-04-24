package com.codechef.dsa.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleOf3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            List<Long> nums = new ArrayList<>();
            nums.add(a);
            nums.add(b);
            long sum = a + b;
            for (long i = 2; i < k; i++) {
                long c = sum % 10;
                sum += c;
                nums.add(c);
            }
            System.out.println(nums);
            if (sum % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
