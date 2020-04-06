

public class Property{
    
    
    private String propertyType;
    private String location;
    
    
    public Property(String type, String location){        
        this.propertyType = type;
        this.location = location;        
    }
    
    
    public void setType(String type){
        this.propertyType = type;
    }
    
    
    public void setLocation(String location){
        this.location = location;
    }
    
    
    public String getPropertyType(){
        return this.propertyType;
    }
    
    
    public String getLocation(){
        return this.location;
    }
    
}