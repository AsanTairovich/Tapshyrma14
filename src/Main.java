public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Esen", "IT", "Peaksoft ");
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println(programmer.toString());
        System.out.println("________________________________________________________");

        Dancer dancer = new Dancer("Madina", "Dancer", "Dancer club");
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.println(dancer.toString());
        System.out.println("_________________________________________________________");

        Singer singer = new Singer("Murat" , "Singer" , "Guitar player");
        singer.playGitar();
        singer.singing();
        singer.learn();
        singer.eat();
        singer.walk();
        System.out.println(singer.toString());
        System.out.println("_________________________________________________________");

    }
}