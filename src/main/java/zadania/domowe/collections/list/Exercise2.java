package zadania.domowe.collections.list;

import java.util.LinkedList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        Email mail1 = new Email("user@user.pl");
        Email mail2 = new Email("admin@admin.pl");
        Email mail3 = new Email("moderator@moderator.pl");

        List<Email> emailList = new LinkedList<>();
        emailList.add(mail1);
        emailList.add(mail2);
        emailList.add(mail3);

        System.out.println(emailList);

        System.out.println(emailList.indexOf(mail2));

        Email pattern = new Email("moderator@moderator.pl");
        int index = emailList.indexOf(pattern);
        System.out.println(index);

    }
}

class Email{

    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email1 = (Email) o;

        return email != null ? email.equals(email1.email) : email1.email == null;
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
