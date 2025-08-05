/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author thato
 */
public abstract class Gamer implements Registerable {

    
    private String id, name, code;
    private int age;

    public Gamer() {
    }

    public Gamer(String id, String name, int age) {

        setId(id);
        setName(name);
        setAge(age);

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //our Abstract method should not have a body
    public abstract String genCode();

    public abstract int calculateDiscount(int fee);

}
