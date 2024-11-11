package com.harshshah.khaanakhazana.dto;

import jakarta.validation.constraints.*;

public record LoginRequest(
        @NotNull(message = "Email is required")
        @Email(message = "Invalid email format")
        String email,

        @NotNull(message = "Password is required")
        String password
) {}