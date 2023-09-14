package com.springboot.kafka.springbootkafkademo.customvalidation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UserTypeValidator.class)
public @interface UserValidator {

    public String message() default "Invalid usertype: it should be either Admin or Enduser";

    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
