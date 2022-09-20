public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println("notebook weight: " + notebook.weight + " notebook price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println("heavyNotebook weight: " + heavyNotebook.weight + " heavyNotebook price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2012);
        System.out.println("oldNotebook weight: " + oldNotebook.weight + " oldNotebook price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook miniNotebook = new Notebook(400, 1800, 2022);
        System.out.println("miniNotebook weight: " + miniNotebook.weight + " miniNotebook price: " + miniNotebook.price);
        miniNotebook.checkPrice();
        miniNotebook.checkWeight();
        miniNotebook.checkYearAndPrice();
    }
}
