package me.grpc;

import com.google.protobuf.InvalidProtocolBufferException;

public class Main {
    public static void main(String[] args) throws InvalidProtocolBufferException {

        byte[] msg = sender();

        receiver(msg);

        System.out.println("Calling GetAllRestaurants service...");
        byte[] allRestaurantsMsg = getAllRestaurants();
        receiver(allRestaurantsMsg);

        System.out.println("\nCalling GetMenuItemsByCategory service (Category: MAIN_COURSE)...");
        byte[] menuItemsMsg = getMenuItemsByCategory(Category.MAIN_COURSE);
        receiverMenuItems(menuItemsMsg);
    }

    //-----------------------------------------------------------------------------------
    private static byte[] sender() {
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

        byte[] msg = restaurantList.toByteArray();

//        System.out.println("Serialized Message (Byte Array):");
//        for (byte b : msg) {
//            System.out.print(b + " ");
//        }
        System.out.println("\n");

        return msg;
    }

    //-----------------------------------------------------------------------------------
    private static void receiver(byte[] msg) throws InvalidProtocolBufferException {
//        System.out.println("Received Message (Byte Array):");
//        for (byte b : msg) {
//            System.out.print(b + " ");
//        }
//        System.out.println("\n");
        System.out.println("Size of serialized Protocol Buffers message: " + msg.length + " bytes");

        RestaurantList restaurantList = RestaurantList.parseFrom(msg);

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

    //-----------------------------------------------------------------------------------
    private static byte[] getAllRestaurants() {
        RestaurantList restaurantList = RestaurantList.newBuilder()
                .addRestaurants(
                        Restaurant.newBuilder()
                                .setName("Restaurant A")
                                .setLocation("Location A")
                                .setContactNumber("000-111-2222")
                                .addMenu(MenuItem.newBuilder()
                                        .setName("Item A")
                                        .setDescription("Description A")
                                        .setPrice(9.99f)
                                        .setCategory(Category.MAIN_COURSE)
                                        .setAvailable(true)
                                        .build())
                                .build())
                .build();

        return restaurantList.toByteArray();
    }

    //-----------------------------------------------------------------------------------
    private static byte[] getMenuItemsByCategory(Category category) {
        MenuItemList menuItemList = MenuItemList.newBuilder()
                .addItems(MenuItem.newBuilder()
                        .setName("Item A")
                        .setDescription("Description A")
                        .setPrice(9.99f)
                        .setCategory(category)
                        .setAvailable(true)
                        .build())
                .addItems(MenuItem.newBuilder()
                        .setName("Item B")
                        .setDescription("Description B")
                        .setPrice(14.99f)
                        .setCategory(category)
                        .setAvailable(true)
                        .build())
                .build();

        return menuItemList.toByteArray();
    }

    //-----------------------------------------------------------------------------------
    // Simulate receiving the MenuItems by category
    private static void receiverMenuItems(byte[] msg) throws InvalidProtocolBufferException {
        MenuItemList menuItemList = MenuItemList.parseFrom(msg);

        System.out.println("Deserialized Menu Items by Category:");
        for (MenuItem item : menuItemList.getItemsList()) {
            System.out.println("- " + item.getName() + ": " + item.getDescription() +
                    " ($" + item.getPrice() + ") [Category: " + item.getCategory() + "]");
        }
    }
}
