package email_admin;

public class EmailApp {
    public static void main(String[] args) {
        Email eml = new Email("Will", "Smith");
        eml.setAlternateEmail("w.s@gmail.com");
        System.out.println("Alternate email: " + eml.getAlternateEmail());
        System.out.println("*********");
        System.out.println(eml.showInfo());

    }
}
