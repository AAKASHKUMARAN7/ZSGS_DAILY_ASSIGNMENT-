public class base {
    String name;
    int yearOfJoining;
    String address;

    base (String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public static void main(String[] args) {
        base e1 = new base("Robert", 1994, "64C- WallsStreat");
        base e2 = new base("Sam", 2000, "68D- WallsStreat");
        base e3 = new base("John", 1999, "26B- WallsStreat");

        System.out.printf("\n", "Name", "Year of Joining", "Address");
        System.out.printf("%-10s %-17d %-20s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.printf("%-10s %-17d %-20s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.printf("%-10s %-17d %-20s\n", e3.name, e3.yearOfJoining, e3.address);
    }
}
