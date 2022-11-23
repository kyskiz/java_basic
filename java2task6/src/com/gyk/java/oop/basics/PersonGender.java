package com.gyk.java.oop.basics;

public enum PersonGender {
    MALE(1),
    FEMALE(2);

    private final int code;

    PersonGender(int code) {
        this.code = code;
    }

    public static PersonGender fromCode(int code) {
        for (PersonGender gender: values()) {
            if (gender.code == code) {
                return gender;
            }
        }

        return null;
    }
}
