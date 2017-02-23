package com.travels.auth.validtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.travels.entities.User;
import com.travels.form.RegisterUserForm;
import com.travels.service.UserService;

@Service
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(final Class<?> arg0) {
        return User.class.equals(arg0);
    }

    @Override
    public void validate(final Object o, final Errors errors) {
        final RegisterUserForm user = (RegisterUserForm) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        if (user.getName().length() < 6 || user.getName().length() > 32) {
            errors.rejectValue("name", "Size.userForm.username");
        }
        if (userService.findUserByName(user.getName()) != null) {
            errors.rejectValue("name", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getConfirmPassword().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }

    }

}
