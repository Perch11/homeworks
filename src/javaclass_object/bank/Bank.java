package javaclass_object.bank;

public class Bank {


    private String bankName;
    private Address address;


    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public static void main(String[] args) {

        Bank bank = new Bank("Ameria");

        Address address = bank.new Address("hayastan","aragacotn","ararat","xanjyan","4rd tun");

        bank.address = address;
        System.out.println(bank.bankName);
        System.out.println(bank.address.city);


    }
    class Address{
        private  String country;
        private String region;

        private String city;

        private  String street;
        private  String house;

        public Address(String country, String region, String city, String street, String house) {
            this.country = country;
            this.region = region;
            this.city = city;
            this.street = street;
            this.house = house;
        }
    }
}


