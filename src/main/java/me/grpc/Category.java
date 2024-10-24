// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: restaurant.proto
// Protobuf Java Version: 4.28.2

package me.grpc;

/**
 * <pre>
 * menu items
 * </pre>
 *
 * Protobuf enum {@code Category}
 */
public enum Category
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>APPETIZER = 1;</code>
   */
  APPETIZER(1),
  /**
   * <code>MAIN_COURSE = 2;</code>
   */
  MAIN_COURSE(2),
  /**
   * <code>DESSERT = 3;</code>
   */
  DESSERT(3),
  /**
   * <code>BEVERAGE = 4;</code>
   */
  BEVERAGE(4),
  /**
   * <code>SIDE_DISH = 5;</code>
   */
  SIDE_DISH(5),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Category.class.getName());
  }
  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>APPETIZER = 1;</code>
   */
  public static final int APPETIZER_VALUE = 1;
  /**
   * <code>MAIN_COURSE = 2;</code>
   */
  public static final int MAIN_COURSE_VALUE = 2;
  /**
   * <code>DESSERT = 3;</code>
   */
  public static final int DESSERT_VALUE = 3;
  /**
   * <code>BEVERAGE = 4;</code>
   */
  public static final int BEVERAGE_VALUE = 4;
  /**
   * <code>SIDE_DISH = 5;</code>
   */
  public static final int SIDE_DISH_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Category valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Category forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return APPETIZER;
      case 2: return MAIN_COURSE;
      case 3: return DESSERT;
      case 4: return BEVERAGE;
      case 5: return SIDE_DISH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Category>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Category> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Category>() {
          public Category findValueByNumber(int number) {
            return Category.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return me.grpc.RestaurantOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Category[] VALUES = values();

  public static Category valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Category(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Category)
}

