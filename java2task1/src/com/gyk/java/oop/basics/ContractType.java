package com.gyk.java.oop.basics;

public enum ContractType {
    FULL_TIME(1),
    PART_TIME(2);

    private final int code;

    ContractType(int code) {
        this.code = code;
    }

    public static ContractType fromCode(int code) {
        for (ContractType type: values()) {
            if (type.code == code) {
                return type;
            }
        }

        return null;
    }
}
