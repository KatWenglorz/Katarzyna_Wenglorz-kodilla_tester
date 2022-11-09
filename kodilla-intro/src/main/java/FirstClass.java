public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 3000, 2022);
        System.out.println("notebook.weight: " + notebook.weight + ", notebook.price: " + notebook.price + ", notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 900, 2021);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + ", heavyNotebook.price: " + heavyNotebook.price + ", heavyNotebook.year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + ", oldNotebook.price: " + oldNotebook.price + ", oldNotebook.year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook lightNotebook = new Notebook(550, 2000, 2016);
        System.out.println("lighNotebook.weight: " + lightNotebook.weight + ", lightNotebook.price: " + lightNotebook.price + ", lightNotebook.year: " + lightNotebook.year);
        lightNotebook.checkPrice();
        lightNotebook.checkWeight();
        lightNotebook.checkYearAndPrice();
    }
    }