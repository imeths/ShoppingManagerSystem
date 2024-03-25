public class Electronics extends Product {                             // declaring instance variables of Electronics class

    private String brand;
    private int warrantyPeriod;                        //warranty period is considered in months
    // setting the default constructor
    public Electronics() {}
    //setting the overloaded constructor
    public Electronics(String productId,String productName,int availableItems,double productPrice,
                       String brand, int warrantyPeriod) {
        super(productId,productName,availableItems,productPrice);            //inherit the instance variables from the parent product class
        this.brand = brand;
        this.warrantyPeriod=warrantyPeriod;}
    //getters and setters for the class instances
    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getProductTypeInput() {
        return "Electronics";
    }
}
