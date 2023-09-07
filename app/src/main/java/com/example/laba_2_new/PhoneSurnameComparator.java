package com.example.laba_2_new;

import java.util.Comparator;

public class PhoneSurnameComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone phone, Phone t1) {
        return phone.getSurname().compareTo(t1.getSurname());
    }
}