package dev.aveiro.brdelivery.Domain.valueObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumber {
    private final Integer ddd;
    private final String phoneNumber;

    public PhoneNumber(Integer ddd, String phoneNumber) {
        this.ddd = ddd;
        this.phoneNumber = phoneNumber;
    }
}
