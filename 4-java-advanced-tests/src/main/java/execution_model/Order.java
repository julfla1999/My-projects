package execution_model;

public class Order {

    private double price;
    private int date;
    private String userLogin;

    public Order(double price, int date, String userLogin) {
        this.price = price;
        this.date = date;
        this.userLogin = userLogin;
    }

    public double getPrice() {
        return price;
    }

    public int getDate() {
        return date;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }
}
