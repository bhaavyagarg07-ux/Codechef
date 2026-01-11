/*Take Discount or Not

There are N items in a shop. The price of the i-th item is Aᵢ. Chef wants to buy all N items.

The shop also offers a discount coupon that costs X rupees. If Chef buys this coupon, the price of each item is reduced by Y rupees. If an item’s original price is less than or equal to Y, its discounted price becomes 0.

Chef must decide whether to buy the discount coupon or not. He will buy the coupon if and only if the total amount he pays after buying the coupon is strictly less than the total amount he would pay without the coupon.

Determine whether Chef should buy the discount coupon*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] ar = new int[x];

        int n = sc.nextInt();
        int y = sc.nextInt();

        int sum1 = 0;
        for (int i = 0; i < x; i++) {
            ar[i] = sc.nextInt();
            sum1 += ar[i];
        }

        int sum2 = 0;
        for (int i = 0; i < x; i++) {
            sum2 += Math.max(0, ar[i] - y);
        }

        if (sum2 + n < sum1)
            System.out.println("discount taken");
        else
            System.out.println("discount not taken");

        sc.close();
    }
}
