public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //creating the employee constructor

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public Employee(int bseSalary){
        this(baseSalary, 0);
    }



    public int calculateWage(int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0){
            throw new IllegalArgumentException("Base salary can not be 0 or less");
        }
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <=0){
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}

//Main function codes
//var employee = new Employee();
//        employee.setBaseSalary(2);
//        employee.setHourlyRate(20);
//int wage = employee.calculateWage(10);
//        System.out.println(wage);
