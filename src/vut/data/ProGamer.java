/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.util.Locale;

/**
 *
 * @author thato
 */
public class ProGamer extends Gamer {

    private int registeredYears, rank;

    public ProGamer() {
    }

    public ProGamer(String id, String name, int age, int registeredYears, int rank) {

        super(id, name, age);
        this.registeredYears = registeredYears;
        this.rank = rank;
    }

    public int getRegisteredYears() {
        return registeredYears;
    }

    public void setRegisteredYears(int registeredYears) {
        this.registeredYears = registeredYears;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String genCode() {

        // we want to combine Rank+Age so we use format string
        String rankAge = String.format("%02d%02d", rank, getAge());

        // we convert registered years into formatted
        String registeredYearsFormatted = String.format("%02d", registeredYears);

        return "P" + rankAge + "-" + registeredYearsFormatted;
    }

    @Override
    public int calculateDiscount(int fee) {

        if (fee < 0) {

            throw new IllegalArgumentException("Fee must be non-negative");
        }

        int discount = 0;

        if (registeredYears > 10) {
            discount = 250;
        } else {
            discount = (int) (fee * (0.05 * registeredYears));
        }

        return discount;
    }

    @Override
    public String toString() {
        return "Code " + genCode() + ", id number " + getId() + ", Name " + getName()
                + ", Number of years registered " + getRegisteredYears() + ", Rank " + getRank();
    }

}
