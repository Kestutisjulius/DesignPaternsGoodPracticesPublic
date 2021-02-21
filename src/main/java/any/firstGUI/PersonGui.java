package any.firstGUI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PersonGui {
    private String name;
    private String email;
    private String phoneNr;
    private LocalDate dateOfBirth;


    public PersonGui(String name, String email, String phoneNr, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.dateOfBirth = dateOfBirth;
    }
    public PersonGui(String name, String email, String phoneNr, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.setDateOfBirth(dateOfBirth);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, today);
        return period.getYears();
    }
}
