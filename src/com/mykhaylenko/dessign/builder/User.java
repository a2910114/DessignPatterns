package com.mykhaylenko.dessign.builder;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String telephone;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.telephone = builder.telephone;
    }

    @Override
    public String toString() {
        return String.format("User[ \n"
                + "\tfirstName: %s\n"
                + "\tlastName: %s\n"
                + "\tage: %d\n"
                + "\taddress: %s\n"
                + "\ttelephone: %s\n]", firstName, lastName, age, address, telephone);

    }

    public static class UserBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String telephone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
