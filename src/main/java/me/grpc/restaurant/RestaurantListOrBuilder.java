// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: restaurant.proto
// Protobuf Java Version: 4.28.2

package me.grpc.restaurant;

public interface RestaurantListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RestaurantList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  java.util.List<me.grpc.restaurant.Restaurant> 
      getRestaurantsList();
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  me.grpc.restaurant.Restaurant getRestaurants(int index);
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  int getRestaurantsCount();
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  java.util.List<? extends me.grpc.restaurant.RestaurantOrBuilder> 
      getRestaurantsOrBuilderList();
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  me.grpc.restaurant.RestaurantOrBuilder getRestaurantsOrBuilder(
      int index);
}