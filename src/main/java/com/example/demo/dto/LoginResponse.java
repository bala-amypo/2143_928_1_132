//wedwef



package com.example.demo.dto;

public class LoginResponse {

    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}…………………………
package com.example.demo.dto;

public class RegisterRequest {

    private String fullName;
    private String email;
    private String password;

    public String getFullName() {   // REQUIRED
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}