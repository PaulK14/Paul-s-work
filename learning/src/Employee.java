public class Employee {
        public int id;
        public String firstname;
        private String lastname;
        private int salary;
        private String name;
        private double annualsalary;
        private double workhours;

    public Employee(int id, String firstname, String lastname, int salary, String name, double annualsalary, double workhours) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.name = name;
        this.annualsalary = annualsalary;
        this.workhours = workhours;
    }

    public Employee(int id, String firstname) {

        this.id = id;
        this.firstname = firstname;
    }

    //        Employee(int id, String firstname, String lastname, int salary) {
//        }
}
