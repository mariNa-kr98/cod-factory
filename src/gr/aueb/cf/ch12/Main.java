package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {
    public static void main(String[] args) {
        User takis = new User(10, "Takis", "K.");
        UserCredentials userCred = new UserCredentials("tAkiS", "123456", 10);

        System.out.println("The user is " + takis.getFirstname() + ", " + takis.getLastname() + " with id: " + takis.getId());
        System.out.println("Credentials are " + userCred.getUsername() + ", " + userCred.getId() + ", " + userCred.getPassword());
    }
}