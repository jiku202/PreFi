public abstract class Employee extends Person{
    private int months_worked;
    private double salary;

    public double thirteenthMonth(){
        return salary / (6 / months_worked);
    }
}
