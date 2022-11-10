public class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

        User ryszard = new User(65, "Ryszard");
        User barbara = new User(65, "Barbara");
        User anna = new User(38, "Anna");
        User kasia = new User(33, "Kasia");
        User marcin = new User(30, "Marcin");
        User adam = new User(10, "Adam");
        User marek = new User(8, "Marek");
        User[] users = new User[]{ryszard, barbara, anna, kasia, marcin, adam, marek};
        int numberOfUsers = users.length;

        int result = 0;
        for (int i = 0; i < numberOfUsers; i++) {
            result = result + users[i].age;
        }
        int avarageAge = result / numberOfUsers;

        for (int i = 0; i < numberOfUsers; i++) {
            if (users[i].age < avarageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}
