package by.epam.unit03.task5;

public class Customer {

    private int id;

    private String surname;

    private String name;

    private String patronymic;

    private String address;

    private int creditCardNumber;

    private int bankAccount;

    public Customer(int id, String surname, String name, String patronymic, String address, int creditCardNumber, int bankAccount) {
        this.id = (id < 0) ? id * -1 : id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = (creditCardNumber < 0) ? creditCardNumber * -1 : creditCardNumber;
        this.bankAccount = (bankAccount < 0) ? bankAccount * -1 : bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (id < 0) ? id * -1 : id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = (creditCardNumber < 0) ? creditCardNumber * -1 : creditCardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = (bankAccount < 0) ? bankAccount * -1 : bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
