package ch9.ex11;

// public class FilteredAccount extends Account {
//     private int totalTransactions;
//     private int filteredTransactions;
//
//     public FilteredAccount(Client c) {
//         super(c);
//     }
//
//     @Override
//     public boolean process(Transaction t) {
//         totalTransactions++;
//
//         if (t.value() == 0) {
//             filteredTransactions++;
//             return true;
//         }
//
//         return super.process(t);
//     }
//
//     public double percentFiltered() {
//         if (totalTransactions == 0) {
//             return 0.0;
//         }
//         return (filteredTransactions / (double) totalTransactions) * 100.0;
//     }
// }

