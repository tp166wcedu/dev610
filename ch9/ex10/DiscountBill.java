package ch9.ex10;

// public class DiscountBill extends GroceryBill {
//     private boolean preferred;
//     private int discountItemCount;
//     private double discountAmount;
//
//     public DiscountBill(Employee clerk, boolean preferred) {
//         super(clerk);
//         this.preferred = preferred;
//     }
//
//     @Override
//     public void add(Item i) {
//         super.add(i);
//         if (preferred && i.getDiscount() > 0.0) {
//             discountItemCount++;
//             discountAmount += i.getDiscount();
//         }
//     }
//
//     @Override
//     public double getTotal() {
//         if (preferred) {
//             return super.getTotal() - discountAmount;
//         } else {
//             return super.getTotal();
//         }
//     }
//
//     public int getDiscountCount() {
//         return preferred ? discountItemCount : 0;
//     }
//
//     public double getDiscountAmount() {
//         return preferred ? discountAmount : 0.0;
//     }
//
//     public double getDiscountPercent() {
//         if (preferred && super.getTotal() > 0) {
//             return (discountAmount / super.getTotal()) * 100;
//         } else {
//             return 0.0;
//         }
//     }
// }
//
