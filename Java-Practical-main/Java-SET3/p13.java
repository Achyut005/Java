public class p13 {

    public static class employee{
        String fn,ln;
        double salary;
        employee(String fn,String ln,double salary)
        {
            this.fn = fn;
            this.ln = ln;
            this.salary = salary;
        }
        void put()
        {
            System.out.println("employee name : " + fn + " " + ln);
            System.out.println("employee salary : " + salary*12);
            System.out.println();
        }
        void put10()
        {
            salary += salary*10;
            System.out.println();
            System.out.println("after give each employee 10% raise :");
            System.out.println("employee name : " + fn + " " + ln);
            System.out.println("employee salary : " + (salary*12));
        }
    }
    public static void main(String[] args) {
        employee ob1 = new employee("Kunj", "Meghpara",1000);
        ob1.put();
        ob1.put10();
        employee ob2 = new employee("Kunj", "Meghpara",10000);
        ob2.put();
        ob2.put10();
    }
}