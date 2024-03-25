// interface to declare abstract methods
public interface ShoppingManager {
    public abstract void addProduct(Product product);       //abstract addProduct method
    public abstract void deleteProduct(String removeId);     //abstract deleteProduct method

    public abstract void print();                            //abstract printProduct method

    public abstract void save();                             //abstract saveProduct method
    public abstract void load();                            ////abstract load the saved products method
}
