
package model;

import java.util.Objects;


public class Person {

        private String name;
    private String gender;
    private int age;
    private String phoneNumber;
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.gender);
        hash = 17 * hash + this.age;
        hash = 17 * hash + Objects.hashCode(this.phoneNumber);
        return hash;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

 
    public String getGender() {
        return gender;
    }

  
    public void setGender(String gender) {
        this.gender = gender;
    }

  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    public String getPhoneNumber() {
        return phoneNumber;
    }

   
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
