package com.example.Backend1;

import java.util.ArrayList;
import java.util.HashMap;

public class DB {
    HashMap<String, String> storage =
            new HashMap<>();

    ArrayList<User> userTable = new ArrayList<>();

    public DB() {
        storage.put("Sachin", "A great batsman");
        storage.put("Dravid", "Backbone of indian criket team");
    }

    public String search(String word) {
        if (storage.containsKey(word)) {
            return storage.get(word);
        }
        return "Couldn't find a thing!";
    }
}
