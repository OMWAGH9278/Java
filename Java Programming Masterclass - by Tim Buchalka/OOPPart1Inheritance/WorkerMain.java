public class WorkerMain {

    public static void main(String[] args) {

//        SalariedEmployee se = new SalariedEmployee();
//        se.getAge();
//        se.collectPay();
//        se.terminate("22/06/2023");
//        se.retire();

        Employee tim = new Employee("Tim", "11/11/1985",
                 "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $"+joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $"+joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970",
                "03/03/2015",15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $"+mary.collectPay());
        System.out.println("Mary's Holiday Pay = $"+mary.getDoublePay());
    }
}

//class Worker{
//
//    private String name;
//    private String birthDate;
//    private String endDate;
//
//    public int getAge(){
//        System.out.println("Inside getAge() method of Worker class");
//        return (0);
//    }
//    public double collectPay(){
//        System.out.println("Inside collectPay() method of Worker class");
//        return (0.0);
//    }
//    public void terminate(String endDate){
//        System.out.println("Inside terminate() method of Worker class");
//        System.out.println("You are terminated");
//    }
//}
//
//class Employee extends Worker{
//
//    private long employeeId;
//    private String hireDate;
//}
//
//class SalariedEmployee extends Employee{
//
//    private double annualSalary;
//    private boolean isRetired;
//
//    public void retire(){
//        System.out.println("Inside retire() method of SalariedEmployee class");
//        System.out.println("You are retired");
//    }
//}
//
//class HourlyEmployee extends Employee{
//
//    private double hourlyPayRate;
//
//    public void getDoublePay(){
//        System.out.println("Inside getDoublePay() method of HourlyEmployee class");
//        System.out.println("You are retired");
//    }
//}
