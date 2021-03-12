package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook = new LinkedHashMap<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook.putAll(map);
    }

    public PhoneBook() {
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String person = "";
        for(String name : phonebook.keySet()) {
            if(phonebook.get(name).contains(phoneNumber)) {
                person = name;
            }
        }
        return person;
    }

    public List<String> getAllContactNames() {
        List<String> keyNames = new ArrayList<>();
        keyNames.addAll(phonebook.keySet());
        return keyNames;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
