package com.company;

public enum Gender {
    MALE(1),
    FEMALE(2),
    GENDER_OTHER(3);

    private final int code;

    Gender(int code) {
        this.code = code;
    }

    public static Gender fromCode(int code) {
        for (Gender gender: values()) {
            if (gender.code == code) {
                return gender;
            }
        }

        return null;
    }
}
