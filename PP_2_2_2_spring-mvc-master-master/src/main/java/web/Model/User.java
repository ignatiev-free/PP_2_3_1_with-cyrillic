package web.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "surname")
    @NotNull(message = "У User нет фамилии")
    @Size(min = 2, max = 50, message = "Фамилия должна содержать от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]*$", message = "Фамилия должна содержать только буквы")
    private String surname;

    @Column(name = "name")
    @NotNull(message = "У User нет имени")
    @Size(min = 2, max = 50, message = "Имя должно содержать от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]*$", message = "Имя должно содержать только буквы")
    private String name;
    @Column(name = "age")
    @NotNull(message = "У User нет возраста")
    @Min(value = 1, message = "Возраст должен быть больше 0")
    private int age;

    public User() {

    }

    public User(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
