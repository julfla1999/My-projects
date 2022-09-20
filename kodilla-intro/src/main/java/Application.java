public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application man = new Application("Adam", 40.4, 1.78);
        man.describeMan();
    }

    public void describeMan() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 1.60) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}
