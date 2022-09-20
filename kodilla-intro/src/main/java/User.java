public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String theName() {
        return this.name;
    }

    public int theAge() {
       return this.age;
    }

    public static void main(String[] args) {

        User rue = new User("Rue", 18);
        User jules = new User("Jules", 20);
        User nate = new User("Nate", 25);
        User maddy = new User("Maddy", 30);
        User cassie = new User("Cassie", 35);
        User kat = new User("Kat", 40);

        User[] users = {rue,jules,nate, maddy,cassie, kat};

        int sumOfAge = 0;
        for(int i = 0; i < users.length; i++) {
            sumOfAge = sumOfAge + users[i].theAge();
        }

        double averageAge = sumOfAge / users.length;
        System.out.println(averageAge);

        for(int i = 0; i <users.length; i++) {
            if(users[i].theAge() < averageAge) {
                System.out.println(users[i].theName());
            }
        }



    }
}
