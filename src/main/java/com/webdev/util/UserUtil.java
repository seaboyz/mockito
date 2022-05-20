package com.webdev.util;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

import com.google.gson.Gson;

public class UserUtil {

    public static void main(String[] args) {

    }

    public static void loadUsers() {
        String absPath = new File("").getAbsolutePath();
        String jsonFilePath = absPath + "src/main/resources/users.json";
        System.out.println(jsonFilePath);
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader(jsonFilePath);
            Gson gson = new Gson();

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
