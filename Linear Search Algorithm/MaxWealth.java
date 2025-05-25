public class MaxWealth {
    public static void main(String[] args) {
        // Richest Customer Wealth
        /*
         You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

         A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
         */
        
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };

        System.out.println("Max wealth => " + maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts) {
        int wealth = 0;

        for (int[] customer : accounts) {

            int money = 0;

            for (int bank : customer) {
                money += bank;
            }

            if (money > wealth) {
                wealth = money;
            }
        }

        return wealth;
    }
}
