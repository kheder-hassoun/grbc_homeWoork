// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: restaurant.proto
// Protobuf Java Version: 4.28.2

package me.grpc;

public interface MenuItemListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MenuItemList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .MenuItem items = 1;</code>
   */
  java.util.List<me.grpc.MenuItem> 
      getItemsList();
  /**
   * <code>repeated .MenuItem items = 1;</code>
   */
  me.grpc.MenuItem getItems(int index);
  /**
   * <code>repeated .MenuItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .MenuItem items = 1;</code>
   */
  java.util.List<? extends me.grpc.MenuItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .MenuItem items = 1;</code>
   */
  me.grpc.MenuItemOrBuilder getItemsOrBuilder(
      int index);
}
