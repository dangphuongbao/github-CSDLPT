/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CSDLPT;

/**
 *
 * @author BAO KHANH
 */
public class Curriculum {
    int id;
    String name;
    String author;
    String school;
    String speciality;

    public Curriculum() {
    }

    public Curriculum(int id, String name, String author, String school, String speciality) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.school = school;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
