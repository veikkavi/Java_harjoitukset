

public class InsuranceInfo{
    
    
    private Property property;
    private double insuredValue;
    
    
    public InsuranceInfo(Property prop, double value){        
        this.property = prop;
        this.insuredValue = value;        
    }
    
    
    public void setProperty(Property prop){
        this.property = prop;
    }
    
    
    public void setInsuredValue(double value){
        this.insuredValue = value;
    }
    
    
    public Property getProperty(){
        return this.property;
    }
    
    
    public double getInsuredValue(){
        return this.insuredValue;
    }
    
}