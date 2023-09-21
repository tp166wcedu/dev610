package ch9.ex5_6_7_8;

public class Main {
    public static void main(String[] args) {
        Ticket walkup = new WalkupTicket(17);
        Ticket advance = new AdvanceTicket(18, 11);
        Ticket studentAdvance = new StudentAdvanceTicket(19, 9);
        System.out.println(walkup);
        System.out.println(advance);
        System.out.println(studentAdvance);

        Ticket walkup2 = new WalkupTicket(20);
        Ticket advance2 = new AdvanceTicket(21, 9);
        Ticket studentAdvance2 = new StudentAdvanceTicket(22, 11);
        System.out.println(walkup2);
        System.out.println(advance2);
        System.out.println(studentAdvance2);
    }
}
