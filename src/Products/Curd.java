package Products;

public class Curd extends Product implements DairyProducts {

        private double fatContent;
        private Product pr;

        public Curd(int id, String name, String upc, String manufacturer, double price, int shelfLife, int quantity, double fatContent) {
            super(id, name, upc, manufacturer, price, shelfLife, quantity);
            this.fatContent = fatContent;
        }
    public Curd(Product pr, double fatContent){
        super(pr.getId(), pr.getName(), pr.getUpc(), pr.getManufacturer(), pr.getPrice(), pr.getShelfLife(), pr.getQuantity());
        this.fatContent = fatContent;
    }

        @Override
        public void fatContent() {
            if(fatContent >= 19 && fatContent <= 23)
                    System.out.println(fatContent + " - творог жирный");
            else if(fatContent >= 4 && fatContent <= 18){
                System.out.println(fatContent + " - творог классический");
            }
            else if(fatContent >= 1.8 && fatContent < 4) {
                System.out.println(fatContent + " - творог полужирный (нежирный)");
            }
            else System.out.println(fatContent + " - творог обезжиренный");
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


