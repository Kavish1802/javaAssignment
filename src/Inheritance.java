public class Inheritance {
    public static void main(String[] args) {
        Cars harrier=new Cars();
        harrier.setBase_price(1200000);
        harrier.setTop_model(500000);

        harrier.getBase_price();
        harrier.getTop_model();
    }
}

class Vehicles {
    private int base_price;

    public void getBase_price() {
        System.out.println("Base model price is Rs. " + this.base_price);
    }

    public void setBase_price(int base_price) {
        this.base_price = base_price;
    }
}

class Cars extends Vehicles {
    public int top_model;

    public void getTop_model() {
        System.out.println("Top model price is Rs. " + this.top_model);
    }

    public void setTop_model(int top_model) {
        this.top_model = top_model;
    }
}