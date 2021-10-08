package Hafta1Odevler.Odev3;

import java.time.LocalDate;

public class PersonalData {

    private LocalDate birthDate;
    private String address;
    private long ssn;

    public PersonalData(LocalDate birthDate, long ssn) {
        this.birthDate = birthDate;
        this.ssn = ssn;
    }

    public PersonalData(int year, int month, int day, long ssn) {
        this.birthDate = LocalDate.of(year,month,day);
        this.ssn = ssn;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
