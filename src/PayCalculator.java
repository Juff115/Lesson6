import hsa.*;
public class PayCalculator {

   
    public static void main(String[] args) {
        Console c=new Console();
        Employee e=new Employee();
        int type;
        double rate, hours;
        String name;
        c.println("Enter the employee's name");
        while (true){
            c.print(e.getNameRules()+": ");
            name=c.readString();
            if (e.setName(name)) break;
            else c.println("Error try again");
        }
        c.println("Enter the employee's type");
        while (true){
            c.print(e.getTypeRules()+": ");
            type=c.readInt();
            if (e.setType(type)) break;
            else c.println("Error try again");
        }
        c.println("Enter the employee's rate");
        while (true){
            c.print(e.getRateRules()+": ");
            rate=c.readDouble();
            if (e.setRate(rate)) break;
            else c.println("Error try again");
        }
        c.println("Enter the employee's hours worked");
        while (true){
            c.print(e.getHourRules()+": ");
            hours=c.readDouble();
            if (e.setHours(hours)) break;
            else c.println("Error try again");
        }
        c.print("The weekly pay for "+e.getName()+" is: $"+e.getPay() );
            
    }
    
}
