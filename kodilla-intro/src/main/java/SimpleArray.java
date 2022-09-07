public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String[5];

        animals[0] = "lion";
        animals[1] = "horse";
        animals[2] = "tiger";
        animals[3] = "zebra";
        animals[4] = "monkey";

        String animal = animals[3];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");

    }
}
