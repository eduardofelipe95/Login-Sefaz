package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="PHONE")
public class Phone implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private int ddd;
    private String number;
    private String type;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    private User user;

    public Phone(int ddd, String number, String type) {
        this.ddd = ddd;
        this.number = number;
        this.type = type;
    }

    public Phone() {

    }


    public Long getId() {
        return id;
    }

    public int getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", ddd=" + ddd +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
