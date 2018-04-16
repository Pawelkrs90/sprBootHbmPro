package com.project.model.enums;

public enum FlightClass {
        FIRST("F"),
        BUSINESS("B"),
        ECONOMIC("E");
        
        private final String code;
        
        private FlightClass(String code){
            this.code = code;
        }
}
