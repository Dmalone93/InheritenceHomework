package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;


    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public double raiseSalary(double percent){
        double total = getSalary() * percent;
        if(total < 0){
            return 0;
        }else{
            return total;
        }
    }

    public int payBonus(){
        int bonus = getSalary() / 100;
        return getSalary() + bonus;

    }
}
