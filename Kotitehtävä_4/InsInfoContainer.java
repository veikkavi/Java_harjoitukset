

import java.util.ArrayList;


public class InsInfoContainer{
    
    
    private ArrayList<InsuranceInfo> container;
    
    
    public InsInfoContainer(){        
        this.container = new ArrayList<InsuranceInfo>();        
    }
    
    
    public void setContainer(ArrayList<InsuranceInfo> list){
        this.container = list;
    }
    
    
    public ArrayList<InsuranceInfo> getContainer(){
        return this.container;
    }
    
    
    public void addInsurance(InsuranceInfo ins){
        container.add(ins);
    }
    
    
    public void printAll(){
        System.out.println("");
        for (InsuranceInfo ins : container){
            Property prop = ins.getProperty();
            String location = prop.getLocation();
            String type = prop.getPropertyType();
            double value = ins.getInsuredValue();
            
            System.out.println(location + " " + type + " " + value);
        }
    }
    
    
    public void printHigherValues(double limit){
        System.out.println("");
        for (InsuranceInfo ins : container){
            Property prop = ins.getProperty();
            String location = prop.getLocation();
            String type = prop.getPropertyType();
            double value = ins.getInsuredValue();
            
            if(value >= limit){
                System.out.println(location + " " + type + " " + value);
            }
            
        }
    }
    
    
    public void printLowerValues(double limit){
        System.out.println("");
        for (InsuranceInfo ins : container){
            Property prop = ins.getProperty();
            String location = prop.getLocation();
            String type = prop.getPropertyType();
            double value = ins.getInsuredValue();
            
            if(value < limit){
                System.out.println(type + " " + location + " " + value);
            }            
        }
    }
    
}