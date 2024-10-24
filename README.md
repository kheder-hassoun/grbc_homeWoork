# gRPC Restaurant Service (Java)

This project implements a gRPC service for managing restaurants and their menu items.
It allows operations like adding a restaurant, retrieving all restaurants, finding a restaurant by name, and getting menu items by category.

## Project Structure

```
grbc_homeWoork
│
├── .idea
├── proto
├── src
│   └── main
│       └── java
│           └── me.grpc
│               ├── Category
│               ├── CategoryRequest
│               ├── CategoryRequestOrBuilder
│               ├── Empty
│               ├── EmptyOrBuilder
│               ├── Main
│               ├── MenuItem
│               ├── MenuItemList
│               ├── MenuItemListOrBuilder
│               ├── MenuItemOrBuilder
│               ├── NameRequest
│               ├── NameRequestOrBuilder
│               ├── Response
│               ├── ResponseOrBuilder
│               ├── Restaurant
│               ├── RestaurantList
│               ├── RestaurantListOrBuilder
│               ├── RestaurantOrBuilder
│               └── RestaurantOuterClass
└── resources
```

## Overview

This Java project uses gRPC to implement a restaurant management service. The service supports the following functionalities:

- **AddRestaurant**: Adds a new restaurant.
- **GetAllRestaurants**: Returns a list of all available restaurants.
- **GetRestaurantByName**: Retrieves a restaurant by its name.
- **GetMenuItemsByCategory**: Retrieves menu items filtered by a specific category.

### Prerequisites

- **Java**: JDK 11+
- **gRPC and Protobuf**: Libraries and plugins for generating gRPC Java code
- **Maven or Gradle**: For managing dependencies and building the project

### Setup Instructions

1. **Clone the repository**:

   ```bash
   git clone https://github.com/kheder-hassoun/grbc_homeWoork.git
   ```

2. **Install required dependencies** ( Maven):

   Add the following dependencies to your `pom.xml`:

   ```xml
   <dependencies>
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <version>4.28.2</version>
        </dependency>

    </dependencies>

   ```

3. **Generate Java files from `.proto`**:

   Use the `protoc` compiler to generate the Java files from the `proto` files. For example:

   ```bash
   protoc --java_out=src/main/java proto/restaurant_service.proto
   protoc --grpc-java_out=src/main/java proto/restaurant_service.proto
   ```

4. **Build the project**:

   If you're using Maven, run:

   ```bash
   mvn clean install
   ```

   For Gradle, run:

   ```bash
   gradle build
   ```

### Project Components

- **proto/**: This directory contains the `restaurant_service.proto` file, which defines the gRPC service and message formats.
- **src/main/java/**: This directory contains the generated gRPC and Protobuf Java classes along with your server implementation.
