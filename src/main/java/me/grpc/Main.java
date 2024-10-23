package me.grpc;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InvalidProtocolBufferException, IOException {
        // Serialize to JSON
        String jsonMsg = senderToJson();
        System.out.println("Serialized JSON Message:");
        System.out.println(jsonMsg);

        // Deserialize from JSON
        receiverFromJson(jsonMsg);
    }

    //-----------------------------------------------------------------------------------
    private static String senderToJson() throws IOException {
        MenuItem item1 = MenuItem.newBuilder()
                .setName("Item 1 ")
                .setDescription(" item 1 bla bla bla ")
                .setPrice(12.99f)
                .setCategory(Category.MAIN_COURSE)
                .setAvailable(true)
                .build();

        MenuItem item2 = MenuItem.newBuilder()
                .setName("item 2")
                .setDescription("item 2 bla bla bla ")
                .setPrice(5.99f)
                .setCategory(Category.DESSERT)
                .setAvailable(true)
                .build();

        Restaurant restaurant1 = Restaurant.newBuilder()
                .setName("kheder resturnat")
                .setLocation("123 jableh city")
                .setContactNumber("123-456-7890")
                .addMenu(item1)
                .addMenu(item2)
                .build();

        MenuItem item3 = MenuItem.newBuilder()
                .setName("mateh ")
                .setDescription("mateh descrption")
                .setPrice(2.50f)
                .setCategory(Category.BEVERAGE)
                .setAvailable(true)
                .build();

        Restaurant restaurant2 = Restaurant.newBuilder()
                .setName("hadeel resturant")
                .setLocation("456 latakia ")
                .setContactNumber("555-123-4567")
                .addMenu(item3)
                .build();

        RestaurantList restaurantList = RestaurantList.newBuilder()
                .addRestaurants(restaurant1)
                .addRestaurants(restaurant2)
                .build();

        String jsonMsg = JsonFormat.printer().print(restaurantList);

        return jsonMsg;
    }

    //-----------------------------------------------------------------------------------
    private static void receiverFromJson(String jsonMsg) throws InvalidProtocolBufferException, IOException {
        System.out.println("\nReceived JSON Message:");
        System.out.println(jsonMsg);

        RestaurantList.Builder restaurantListBuilder = RestaurantList.newBuilder();
        JsonFormat.parser().merge(jsonMsg, restaurantListBuilder);
        RestaurantList restaurantList = restaurantListBuilder.build();

        System.out.println("Deserialized Restaurant List:");
        for (Restaurant restaurant : restaurantList.getRestaurantsList()) {
            System.out.println("Restaurant Name: " + restaurant.getName());
            System.out.println("Location: " + restaurant.getLocation());
            System.out.println("Contact Number: " + restaurant.getContactNumber());

            System.out.println("Menu:");
            for (MenuItem item : restaurant.getMenuList()) {
                System.out.println("- " + item.getName() + ": " + item.getDescription() +
                        " ($" + item.getPrice() + ") [Category: " + item.getCategory() + "]");
            }
            System.out.println();
        }
    }
}
