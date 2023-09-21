package ch9.ex9;

// public class MinMaxAccount extends BankAccount {
//     private int minBalance;
//     private int maxBalance;
//
//     public MinMaxAccount(Startup s) {
//         super(s);
//         minBalance = super.getBalance();
//         maxBalance = super.getBalance();
//     }
//
//     @Override
//     public void debit(Debit d) {
//         super.debit(d);
//         updateMinMaxBalance();
//     }
//
//     @Override
//     public void credit(Credit c) {
//         super.credit(c);
//         updateMinMaxBalance();
//     }
//
//     private void updateMinMaxBalance() {
//         int currentBalance = super.getBalance();
//         if (currentBalance < minBalance) {
//             minBalance = currentBalance;
//         }
//         if (currentBalance > maxBalance) {
//             maxBalance = currentBalance;
//         }
//     }
//
//     public int getMin() {
//         return minBalance;
//     }
//
//     public int getMax() {
//         return maxBalance;
//     }
// }
//
