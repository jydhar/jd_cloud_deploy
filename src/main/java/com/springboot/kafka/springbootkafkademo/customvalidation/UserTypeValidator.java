package com.springboot.kafka.springbootkafkademo.customvalidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class UserTypeValidator implements ConstraintValidator<UserValidator,String> {
    @Override
    public boolean isValid(String userType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> userTypes = Arrays.asList("Admin","Enduser");

       return userTypes.contains(userType);
    }
}
