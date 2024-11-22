public class employee {

    String name;
    String last_name;
    double monthly_salary;

    employee(String name, String last_name, double month_salary){
        this.name = name;
        this.last_name = last_name;
        this.monthly_salary = month_salary;
    }

    //setters
    void setName(String nam){
        name = nam;
    }
    
    void setLast_Name(String last_nam){
        last_name = last_nam;
    }
    void setName(double mth_salary){
        monthly_salary = mth_salary;
    }  
      
}
