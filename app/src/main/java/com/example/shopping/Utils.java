package com.example.shopping;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Utils {
    private static int ID = 0;
    private static final String DB_NAME  = "db";
    private static final String ALL_ITMES_KEY = "items_key";
    private static Gson gson = new Gson();
    private static Type groceryType = new TypeToken<ArrayList<GroceryItem>>(){}.getType();

    public static void initSharedPreferences(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAME,Context.MODE_PRIVATE);
        ArrayList<GroceryItem> allItems = gson.fromJson(sharedPreferences.getString(ALL_ITMES_KEY,null),groceryType );
        if (null == allItems){

        }


    }
    private static void allItems(Context context){
        ArrayList<GroceryItem> items = new ArrayList<>();
        GroceryItem milk = new GroceryItem(1,200,"Milk","https://www.nicepng.com/png/detail/7-75883_free-png-milk-png-images-transparent-milk-carton.png",
                "Foods",5000);
        items.add(milk);
        GroceryItem iceCream = new GroceryItem(20,"Ice Cream","","Foods",1200);
        GroceryItem soda = new GroceryItem(20,"Soda","","Drinks",300);
        items.add(iceCream);
        items.add(soda);
        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ALL_ITMES_KEY, gson.toJson(items));
        editor.commit();
    }
    public static ArrayList<GroceryItem> getAllItems(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAME,Context.MODE_PRIVATE);
        ArrayList<GroceryItem> allItems = gson.fromJson(sharedPreferences.getString(ALL_ITMES_KEY,null),groceryType );
        return allItems;

    }

    public static int getID() {
        ID++;
        return ID;
    }
}
