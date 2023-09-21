package ch9.ex3;


public class Main {

    public static void main(String[] args) {
        HarvardLawyer harvardLawyer = new HarvardLawyer();
        System.out.printf("Salary: $%,.2f\n", harvardLawyer.getSalary());
        System.out.println("Vacation Days: " + harvardLawyer.getVacationDays() + " days");
        System.out.println("Vacation Form: " + harvardLawyer.getVacationForm());
    }

}
