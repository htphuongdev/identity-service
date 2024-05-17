package com.htp.tuner.identityservice.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {

    MALE,
    FEMALE;

    @JsonCreator
    public static Gender fromString(String value) {
        return value == null
                ? null
                : Gender.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String value() {
        return this.name().toLowerCase();
    }
}
