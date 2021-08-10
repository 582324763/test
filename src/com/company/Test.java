package com.company;

import java.util.Objects;

public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(){

    }
    public Test(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Test test1 = new Test("张三");
        Test test2 = new Test("张三");
        System.out.println(test1.equals(test2));
        System.out.println(test1==test2);
    }
}
