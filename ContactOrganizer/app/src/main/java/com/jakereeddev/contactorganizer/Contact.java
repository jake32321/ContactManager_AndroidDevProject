package com.jakereeddev.contactorganizer;

/**
 * Created by Jacob Reed on 10/26/2015.
 */
public class Contact {

    private String _name, _email, _address, _phone;

    public Contact(String name, String phone, String email, String address){
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
    }

    public String getName(){
        return _name;
    }

    public String getPhone(){
        return _phone;
    }

    public String getEmail(){
        return _email;
    }

    public String getAddress(){
        return _address;
    }
}
