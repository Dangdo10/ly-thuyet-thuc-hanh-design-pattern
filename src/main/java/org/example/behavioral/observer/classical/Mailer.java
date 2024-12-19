package org.example.behavioral.observer.classical;

public class Mailer implements Observer {

    @Override
    public void update(User user) {

        if (user.getStatus() == LoginStatus.SUCCESS) {
            System.out.println("Mailer: User " + user.getEmail() + " is login success. An email was sent!");
        }

        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
