package java8;

import java.util.Objects;

public class PhonePe implements Payment{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhonePe phonePe = (PhonePe) o;
        return age == phonePe.age && Objects.equals(name, phonePe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
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

    public void addCoupon(){
        Payment.super.addCoupon();
    }

    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.addCoupon();
    }
}
