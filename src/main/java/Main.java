import dao.PersonDAO;
import model.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        // Lay ra toan bo nguoi
        List<Person> list = personDAO.getAll();
        // Them 1 nguoi vao database
        Person p = new Person();
        p.setName("Nguyen Mạnh Túa");
        p.setAddress("HN");
        p.setEmail("bcdddd@gmai.com");
        p.setPhone("1244567890");
        personDAO.insert(p);
        System.out.println(list);
    }
}
