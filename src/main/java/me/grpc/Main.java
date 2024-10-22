package me.grpc;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        // JSON serialization
        String jsonMsg = sender();

        // Print size of JSON message
        System.out.println("Size of serialized JSON message: " + jsonMsg.getBytes().length + " bytes");

        // Simulate receiver side to print deserialized data
        receiver(jsonMsg);
    }

    //-----------------------------------------------------------------------------------
    private static String sender() {
        // Create MenuItems
        JsonMenuItem item1 = new JsonMenuItem("Item 1", "item 1 bla bla bla", 12.99f, "MAIN_COURSE", true);
        JsonMenuItem item2 = new JsonMenuItem("item 2", "item 2 bla bla bla", 5.99f, "DESSERT", true);

        // Create Restaurant 1
        JsonRestaurant restaurant1 = new JsonRestaurant("kheder restaurant", "123 jableh city", "123-456-7890", new JsonMenuItem[]{item1, item2});

        // Create MenuItem for Restaurant 2
        JsonMenuItem item3 = new JsonMenuItem("mateh", "mateh description", 2.50f, "BEVERAGE", true);

        // Create Restaurant 2
        JsonRestaurant restaurant2 = new JsonRestaurant("hadeel restaurant", "456 latakia", "555-123-4567", new JsonMenuItem[]{item3});

        // Create a RestaurantList that holds multiple restaurants
        JsonRestaurantList restaurantList = new JsonRestaurantList(new JsonRestaurant[]{restaurant1, restaurant2});

        // Convert RestaurantList to JSON using Gson
        Gson gson = new Gson();
        String jsonMsg = gson.toJson(restaurantList);

        // Print the JSON message
        System.out.println("Serialized JSON Message:\n" + jsonMsg);

        return jsonMsg;
    }

    // Receiver method to deserialize and print the JSON data
    private static void receiver(String jsonMsg) {
        // Convert JSON back to RestaurantList using Gson
        Gson gson = new Gson();
        JsonRestaurantList restaurantList = gson.fromJson(jsonMsg, JsonRestaurantList.class);

        // Print deserialized Restaurant List
        System.out.println("\nDeserialized Restaurant List:");
        for (JsonRestaurant restaurant : restaurantList.getRestaurants()) {
            System.out.println("Restaurant Name: " + restaurant.getName());
            System.out.println("Location: " + restaurant.getLocation());
            System.out.println("Contact Number: " + restaurant.getContactNumber());

            System.out.println("Menu:");
            for (JsonMenuItem item : restaurant.getMenu()) {
                System.out.println("- " + item.getName() + ": " + item.getDescription() +
                        " ($" + item.getPrice() + ") [Category: " + item.getCategory() + "]");
            }
            System.out.println();
        }
    }
}

// Supporting classes for JSON serialization with new names to avoid conflict
class JsonMenuItem {
    private String name;
    private String description;
    private float price;
    private String category;
    private boolean available;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public JsonMenuItem(String name, String description, float price, String category, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    // Getters and setters (optional)...
}

class JsonRestaurant {
    private String name;
    private String location;
    private String contactNumber;
    private JsonMenuItem[] menu;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public JsonMenuItem[] getMenu() {
        return menu;
    }

    public JsonRestaurant(String name, String location, String contactNumber, JsonMenuItem[] menu) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.menu = menu;
    }

    // Getters and setters (optional)...
}

class JsonRestaurantList {
    private JsonRestaurant[] restaurants;

    public JsonRestaurantList(JsonRestaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    public JsonRestaurant[] getRestaurants() {
        return restaurants;
    }
}
