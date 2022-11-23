package com.company;

public class Main {

    public static void main(String[] args) {
//        Person karolis = new Person("Karolis", 26);
//
//        System.out.println(karolis.getAge());
//        karolis.setAge(40);
//        System.out.println(karolis.getAge());
//
//        karolis.setGender(Gender.MALE);
//
//        switch (karolis.getGender()) {
//            case MALE:
//                System.out.println(karolis.getName() + " is male");
//                break;
////            case FEMALE -> System.out.println(karolis.getName() + "is female");
//
//            case FEMALE:
//                System.out.println(karolis.getName() + " is female");
//                break;
//
//            default:
//                System.out.println(karolis.getName() + " does not know");
//
//        }
//
//        Gender female = Gender.fromCode(2);
//        System.out.println(female);
//
//
//        System.out.println(Gender.fromCode(4));

//        Employee employee = new Employee("Arnoldas", 20, 500);
//
//        System.out.println(employee);
//
//        Person person = new Employee();
//        System.out.println(person);
//        // Employee{salary=0,name='null', age=0}
//
//        System.out.println(employee.calcSalary());
//        System.out.println(employee.calcSalary(5.2));
//        System.out.println(employee.calcSalary(5.2, 200));

        CreditCard card = new CreditCard();

        card.setBalance(500);
        System.out.println(card.getBalance());
        System.out.println(card.calculateBalance());


    }
}
