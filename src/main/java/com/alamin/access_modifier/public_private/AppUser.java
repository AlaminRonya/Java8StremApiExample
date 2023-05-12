package com.alamin.access_modifier.public_private;

import java.security.MessageDigest;

// TODO: 5/12/2023 tiredly encapsulation class-> When all property are private
public class AppUser {
    private String username;
    private String password;

    public AppUser() {
    }

    public AppUser(String username, String password) {
        this.username = username;
        this.password = encodedPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encodedPassword(password);
    }

    private String encodedPassword(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (Byte b: bytes){
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
