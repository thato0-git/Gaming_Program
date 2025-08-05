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
public class AmGamer extends Gamer {

    private int category;

    public AmGamer() {
    }

    public AmGamer(String id, String name, int age, int category) {
        super(id, name, age);
        this.category = category;

    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override // genarete code for amateur
    public String genCode() {
        return "A" + getId() + "-" + category;
    }

    @Override
    public int calculateDiscount(int fee) {

        // Validate fee
        if (fee < 0) {
            throw new IllegalArgumentException("Fee must be non-negative.");
        }

        int discount = 0;

        // learner
        if (category == 1) {
            if (getAge() >= 16) {
                discount = (int) (fee * 0.03);

            } else {
                discount = (int) (fee * 0.04);
            }

            //student
        } else if (category == 2) {

            discount = (int) (fee * 0.02);
        }

        return discount;

    }

    @Override
    public String toString() {
        return "Code " + genCode() + ", Id number " + getId() + ", Name " + getName() + ", Category " + getCategory();
    }

}
