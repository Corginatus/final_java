package app.entities;

import java.util.Objects;

public class Rate {
    private String name;
    private int rate;

    public Rate() {
    }

    public Rate(String name, int password) {
        this.name = name;
        this.rate = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + rate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rate rate1 = (Rate) o;
        return rate == rate1.rate && Objects.equals(name, rate1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rate);
    }
}
