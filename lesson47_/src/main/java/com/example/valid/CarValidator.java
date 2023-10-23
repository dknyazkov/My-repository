package com.example.valid;



import com.example.domain.CarDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CarValidator implements ConstraintValidator<CheckPower,CarDTO> {


    @Override
    public void initialize(CheckPower constraintAnnotation) {
    }

    @Override
    public boolean isValid(CarDTO value, ConstraintValidatorContext context) {
       if (value.getPower()!=null&&value.getPower()>100){
           return true;
       }
       return false;
    }
}
