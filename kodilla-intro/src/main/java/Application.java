public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
    }
    public void checkApplication() {
        if(name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160.");
            } else {
                System.out.println("User is 30 (or younger) or 160 (or shorter).");
            }
        }
    }
}
