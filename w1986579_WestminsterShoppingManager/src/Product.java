public abstract class Product implements Comparable<Product> {

    private String productId;
    private String productName;
    private int availableItems;
    private double productPrice;
    //setting the default constructor
    public Product() {

    }
    //setting the overloaded constructor
    public  Product(String productId,String productName,int availableItems,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.availableItems=availableItems;
        this.productPrice=productPrice;}
    //getters and setters for the class instances
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getAvailableItems() {
        return availableItems;
    }

    public abstract String getProductTypeInput();

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setAvailableItems(int availableItems) {
        this.availableItems = availableItems;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    @Override
    public int compareTo(Product P) {
        return this.getProductId().compareTo(P.getProductId());
    }                                                               //overridden comarable method to compare the products in order to sort
}
