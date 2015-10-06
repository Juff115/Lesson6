import hsa.*;
public class PayCalculator {

   
    public static void main(String[] args) {
        Console c=new Console();
        Employee e=new Employee();
        int type;
        while (true){
            c.print(e.getTypeRules()+": ");
            type=c.readInt();
            if (e.setType(type)) break;
            else c.println("Error try again");
        }
        c.println("more to come later");
    }
    
}
