package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {

    public void validateEmails(String email, String alternateEmail) {
        class Email {
            private final String formattedEmail;

            public Email(String email) {
                if (email == null || email.isEmpty()) {
                    formattedEmail = "unknown";
                } else if (!isValidEmail(email)) {
                    formattedEmail = "unknown";
                } else {
                    formattedEmail = email;
                }
            }

            public String getFormattedEmail() {
                return formattedEmail;
            }

            private boolean isValidEmail(String email) {
                String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                return matcher.matches();
            }
        }

        Email formattedEmail = new Email(email);
        Email formattedAlternateEmail = new Email(alternateEmail);

        System.out.println("Email: " + formattedEmail.getFormattedEmail());
        System.out.println("Alternate Email: " + formattedAlternateEmail.getFormattedEmail());
    }

    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        userValidator.validateEmails("example@email.com", "alternate@example.com");
        userValidator.validateEmails("", "invalid-email");
        userValidator.validateEmails(null, "another-invalid-email");
    }
}
