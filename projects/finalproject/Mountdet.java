public class Mountdet {
    
    private String name;              // mountain name  
    private String country;           // country that mountain resides in      
    private double elevation;         // the elevation of the mountain

    public Mountdet() {               
        this.name = "dog";          
        this.country = "cat";         //default name and values
        this.elevation = 0;
    }
   
    public Mountdet(String name, String country, double elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }
    
    public void setName() {
        this.name = name;
    }
    public void setCountry() {                
        this.country = country;             //setters
    }
    public void setElevation() {
        this.elevation = elevation;
    }


    public String getName () {
        return name;
    }
    public String getCountry() {            //getters
        return country;
    }
    public double getElevation() {
        return elevation;
    }



    public double toMeters() {
        double convert;
        convert = 3.2808;                     //converts feet into meters
        return this.elevation / convert;
    }


}
