// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: restaurant.proto
// Protobuf Java Version: 4.28.2

package me.grpc;

public interface RestaurantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Restaurant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string location = 2;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 2;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string contact_number = 3;</code>
   * @return The contactNumber.
   */
  java.lang.String getContactNumber();
  /**
   * <code>string contact_number = 3;</code>
   * @return The bytes for contactNumber.
   */
  com.google.protobuf.ByteString
      getContactNumberBytes();

  /**
   * <code>repeated .MenuItem menu = 4;</code>
   */
  java.util.List<me.grpc.MenuItem> 
      getMenuList();
  /**
   * <code>repeated .MenuItem menu = 4;</code>
   */
  me.grpc.MenuItem getMenu(int index);
  /**
   * <code>repeated .MenuItem menu = 4;</code>
   */
  int getMenuCount();
  /**
   * <code>repeated .MenuItem menu = 4;</code>
   */
  java.util.List<? extends me.grpc.MenuItemOrBuilder> 
      getMenuOrBuilderList();
  /**
   * <code>repeated .MenuItem menu = 4;</code>
   */
  me.grpc.MenuItemOrBuilder getMenuOrBuilder(
      int index);
}
