public class Product {
    private int id;
    private String name;
    private int UPC;
    private String manufacturer;
    private int price;
    private int storageLife;
    private int number;


    public Product(int id, String name, int UPC, String manufacturer, int price, int storageLife, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storageLife = storageLife;
        this.number = number;
    }

    public Product(int id, String name, int UPC, int price, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.price = price;
        this.number = number;
    }

    public Product() {
        this.id = 0;
        this.name = "";
        this.UPC = 0;
        this.manufacturer = "";
        this.price = 0;
        this.storageLife = 0;
        this.number = 0;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode(){
        return id + name.length() + UPC + manufacturer.length() + price + storageLife + number;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product product = (Product) obj;
            return  id == product.id &&
                    name.equals(product.name) &&
                    UPC == product.UPC &&
                    manufacturer.equals(product.manufacturer) &&
                    price == product.price &&
                    storageLife == product.storageLife &&
                    number == product.number;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product name: " + name + ", UPC: " + UPC + ", manufacturer " + manufacturer +
                ", price " + price + ", storage life  " + storageLife + ", number " + number;
    }
}