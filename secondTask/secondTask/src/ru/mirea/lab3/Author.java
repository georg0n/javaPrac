package ru.mirea.lab3;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String newName, String newEmail, char newGender){
        name = newName;
        email = newEmail;
        gender = newGender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email = newEmail;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + " (" + gender + ") at " + email;
    }

}
