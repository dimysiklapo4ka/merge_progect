package ua.init.max.autorizate.validVacancy.models;

/**
 * Created by d1mys1klapo4ka on 01.06.2017.
 */

public class ModelsVacancy {

    private int id;
    private String name;
    private String salary;
    private String category;
    private String specialtist;

    public ModelsVacancy(String name, String salary, String category, String specialtist){

        this.name = name;
        this.salary = salary;
        this.category = category;
        this.specialtist = specialtist;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpecialtist() {
        return specialtist;
    }

    public void setSpecialtist(String specialtist) {
        this.specialtist = specialtist;
    }
}
