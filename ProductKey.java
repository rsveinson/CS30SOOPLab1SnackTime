/********************************************************************
 * Programmer:      your name here
 * Class:           CS30S
 *
 * Assignment:      OOP Lab 2 Developing the Snack Time App
 *
 * Description:     add you code as directed by the comments and the 
 *                  instructions
 ***********************************************************************/
public class ProductKey{
    // fields
    private String name;
    private double price;

    // add your code here
    public ProductKey(){
     name = "Unknown";
     price = 0.0;
    }
    
    public ProductKey(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    // getters
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    // setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    // other methods
    public String toString(){
        return name + " $" + price;
    }
}
