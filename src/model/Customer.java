package model;

public class Customer {
    private String fullName;
    private String nationalId;
    private String  telephoneNumber;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String nationalId, String telephoneNumber, String email, String address) {
        this.setFullName(fullName);
        this.setNationalId(nationalId);
        this.setTelephoneNumber(telephoneNumber);
        this.setEmail(email);
        this.setAddress(address);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

