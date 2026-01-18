package com.tuananh.authenticate.dto.request;

import com.tuananh.authenticate.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    String username;

    @Size(min = 3, max = 50, message = "PASSWORD_INVALID")
    String password;
    String email;

    @DobConstraint(min = 16, message = "INVALID_DOB")
    LocalDate dob;
}
