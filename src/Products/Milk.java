package Products;

public class Milk extends Product implements DairyProducts {
    private double fatContent;
    private Product pr;

    public Milk(int id, String name, String upc, String manufacturer, double price, int shelfLife, int quantity, double fatContent) {
        super(id, name, upc, manufacturer, price, shelfLife, quantity);
        this.fatContent = fatContent;
    }
    public Milk(Product pr, double fatContent){
        super(pr.getId(), pr.getName(), pr.getUpc(), pr.getManufacturer(), pr.getPrice(), pr.getShelfLife(), pr.getQuantity());
        this.fatContent = fatContent;
    }

    @Override
    public void fatContent() {
        if(fatContent >= 3.5)
            System.out.println(fatContent + " - высокий процент жирности молока");
        else if(fatContent >= 2.6 && fatContent < 3.5){
            System.out.println(fatContent + " - средний процент жирности молока");
        }
        else
            System.out.println(fatContent + " - низкий процент жирности молока");
    }

    @Override
    public double getFatContent() {
       return fatContent;
    }

    @Override
    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return "id= " + getId() +
                ". название='" + getName() + '\'' +
                ", UPC='" + getUpc() + '\'' +
                ", производитель='" + getManufacturer() + '\'' +
                ", цена=" +getPrice() +
                ", срок годности=" + getShelfLife() +
                ", количество=" + getQuantity() +
                ", жирность=" + fatContent;
    }
}
