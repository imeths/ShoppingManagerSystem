public class Clothing extends Product{                    // declaring instance variables of Clothing class

    private String size;
    private String color;
    //setting the default constructor

    public Clothing() {}
    //setting the overloaded constructor
    public Clothing(String productId,String productName,int availableItems,
                    double productPrice,String size,String color){
        super(productId,productName,availableItems,productPrice);        //inherit the instance variables from the parent product class
        this.size=size;
        this.color=color;}
    //getters and setters for the class instances
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getProductTypeInput() {
        return "Clothing";
    }
}
