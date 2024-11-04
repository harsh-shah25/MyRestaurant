package com.prashantjain.yummyrest.dto;

public record LoginResponse(String message, String token) {} // token is optional depending on your auth approach
