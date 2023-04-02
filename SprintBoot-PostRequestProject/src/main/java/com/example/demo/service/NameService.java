package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;



import java.util.*;

@Service
public class NameService {

private static List<String> names = new ArrayList<>();

public List<String> getNames() {
return names;
    }

public void addName(String name) {
names.add(name);
    }

}
