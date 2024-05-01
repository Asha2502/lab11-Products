package Products;

public class Butter extends Product implements DairyProducts {

        private double fatContent;
        private Product pr;

        public Butter(int id, String name, String upc, String manufacturer, double price, int shelfLife, int quantity, double fatContent) {
            super(id, name, upc, manufacturer, price, shelfLife, quantity);
            this.fatContent = fatContent;
        }
    public Butter(Product pr, double fatContent){
        super(pr.getId(), pr.getName(), pr.getUpc(), pr.getManufacturer(), pr.getPrice(), pr.getShelfLife(), pr.getQuantity());
        this.fatContent = fatContent;
    }

        @Override
        public void fatContent() {
            if(fatContent == 82.5)
                System.out.println(fatContent + " - масло традиционное");
            else if(fatContent == 80){
                System.out.println(fatContent + " - масло любительское");
            }
            else if(fatContent == 72.5) {
                System.out.println(fatContent + " - масло крестьянское");
            }
            else if(fatContent == 61) {
                System.out.println(fatContent + " - масло бутербродное");
            }
            else if(fatContent == 50) {
                System.out.println(fatContent + " - масло чайное");
            }
            else System.out.println(fatContent + " - масло нестандартное");
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



