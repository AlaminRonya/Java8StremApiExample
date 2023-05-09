package com.alamin.oops.enums;


public enum CustomEnum {
    HIGH(1){
        @Override
        public String normalize() {
            return HIGH.toString().toUpperCase();
        }
    },
    MEDIUM(2){
        @Override
        public String normalize() {
            return MEDIUM.toString().toUpperCase() + MEDIUM.toString().toLowerCase();
        }
    },
    LOW(3){
        @Override
        public String normalize() {
            return LOW.toString().toLowerCase() + LOW.toString().toUpperCase();
        }
    };

    private final int value;

    CustomEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    abstract public String normalize();
}
