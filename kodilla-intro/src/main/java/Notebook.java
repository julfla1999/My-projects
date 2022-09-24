public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600 ) {
            System.out.println("This notebook very is cheap.");
        } else if (600 <= this.price && this.price <= 1000 ){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000 ) {
            System.out.println("This notebook is light.");
        } else if (1000 <= this.weight && this.weight <= 1500) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year > 2019 && this.price > 1600) {
            System.out.println("This notebook is a new model so the price is higher.");
        } else if (this.year > 2019 && this.price < 1600) {
            System.out.println("This notebook is a new model but the price is low so it's a very good offer.");
        } else if (this.year < 2019 && this.price < 1000) {
            System.out.println("This notebook is an old model so the price is low.");
        } else {
            System.out.println("This notebook is an old model but the price is still high.");
        }

    }
}
