package com.desarrollo.practicacalificada2.Models;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String Name;
    private String Phone;
    private String Email;

    public Contact(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public static List<Contact> getItems() {
        ArrayList<Contact> items = new ArrayList<>();
        items.add(new Contact("Diego", "951026105", "diego@gmail.com"));
        items.add(new Contact("Angel", "951026106", "angel@gmail.com"));
        items.add(new Contact("Yonathan", "951026107", "yonathan@gmail.com"));
        items.add(new Contact("Alex", "951026104", "alex@gmail.com"));
        items.add(new Contact("Juan", "951026103", "juan@gmail.com"));
        items.add(new Contact("Luis", "951026102", "luis@gmail.com"));
        items.add(new Contact("Brandon", "951026101", "brandon@gmail.com"));
        items.add(new Contact("Armando", "951026108", "armando@gmail.com"));
        items.add(new Contact("Julio", "951026109", "julio@gmail.com"));
        items.add(new Contact("Pedro", "951026110", "pedro@gmail.com"));
        items.add(new Contact("Joe", "951026111", "joe@gmail.com"));
        items.add(new Contact("Santiago", "951026112", "santiago@gmail.com"));
        return items;
    }
}
