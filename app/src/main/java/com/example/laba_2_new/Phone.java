package com.example.laba_2_new;

public class Phone implements Comparable<Phone>{
    private int id;
    private String name;
    private String surname;
    private String secondName;
    private String address;
    private String creditCardNumber;
    private Double debit;
    private Double credit;
    private int cityCallTime;
    private int internalCallTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Double getDebit() {
        return debit;
    }
    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public int getCityCallTime() {
        return cityCallTime;
    }
    public void setCityCallTime(int cityCallTime) {
        this.cityCallTime = cityCallTime;
    }

    public int getInternalCallTime() {
        return internalCallTime;
    }
    public void setInternalCallTime(int internalCallTime) {
        this.internalCallTime = internalCallTime;
    }

    public Phone(int id,
                 String surname,
                 String name,
                 String secondName,
                 String address,
                 String creditCardNumber,
                 Double debit,
                 Double credit,
                 int cityCallTime,
                 int internalCallTime){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.cityCallTime = cityCallTime;
        this.internalCallTime = internalCallTime;
    }

    @Override
    public String toString() {
        return "Абонент №" + id + "\n" +
                "ФИО: " + name + " " + surname + " " + secondName + "\n" +
                "Адрес: " + address + "\n" +
                "Номер кредитной карты: " + creditCardNumber + "\n" +
                "Дебет: " + debit + "\n" +
                "Кредит: " + credit + "\n" +
                "Время городских звонков: " + cityCallTime + "\n" +
                "Время междугородних звонков: " + internalCallTime + "\n";
    }

    @Override
    public int compareTo(Phone phone) {
        return this.surname.compareTo(phone.surname);
    }
}
