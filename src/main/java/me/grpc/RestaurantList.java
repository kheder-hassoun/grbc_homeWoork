// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: restaurant.proto
// Protobuf Java Version: 4.28.2

package me.grpc;

/**
 * Protobuf type {@code RestaurantList}
 */
public final class RestaurantList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:RestaurantList)
    RestaurantListOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      RestaurantList.class.getName());
  }
  // Use RestaurantList.newBuilder() to construct.
  private RestaurantList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RestaurantList() {
    restaurants_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return me.grpc.RestaurantOuterClass.internal_static_RestaurantList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return me.grpc.RestaurantOuterClass.internal_static_RestaurantList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            me.grpc.RestaurantList.class, me.grpc.RestaurantList.Builder.class);
  }

  public static final int RESTAURANTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<me.grpc.Restaurant> restaurants_;
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<me.grpc.Restaurant> getRestaurantsList() {
    return restaurants_;
  }
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends me.grpc.RestaurantOrBuilder> 
      getRestaurantsOrBuilderList() {
    return restaurants_;
  }
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  @java.lang.Override
  public int getRestaurantsCount() {
    return restaurants_.size();
  }
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  @java.lang.Override
  public me.grpc.Restaurant getRestaurants(int index) {
    return restaurants_.get(index);
  }
  /**
   * <pre>
   * list of Restu messages
   * </pre>
   *
   * <code>repeated .Restaurant restaurants = 1;</code>
   */
  @java.lang.Override
  public me.grpc.RestaurantOrBuilder getRestaurantsOrBuilder(
      int index) {
    return restaurants_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < restaurants_.size(); i++) {
      output.writeMessage(1, restaurants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < restaurants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, restaurants_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof me.grpc.RestaurantList)) {
      return super.equals(obj);
    }
    me.grpc.RestaurantList other = (me.grpc.RestaurantList) obj;

    if (!getRestaurantsList()
        .equals(other.getRestaurantsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRestaurantsCount() > 0) {
      hash = (37 * hash) + RESTAURANTS_FIELD_NUMBER;
      hash = (53 * hash) + getRestaurantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static me.grpc.RestaurantList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.grpc.RestaurantList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.grpc.RestaurantList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.grpc.RestaurantList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.grpc.RestaurantList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.grpc.RestaurantList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.grpc.RestaurantList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static me.grpc.RestaurantList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static me.grpc.RestaurantList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static me.grpc.RestaurantList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.grpc.RestaurantList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static me.grpc.RestaurantList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(me.grpc.RestaurantList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RestaurantList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RestaurantList)
      me.grpc.RestaurantListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.grpc.RestaurantOuterClass.internal_static_RestaurantList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.grpc.RestaurantOuterClass.internal_static_RestaurantList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.grpc.RestaurantList.class, me.grpc.RestaurantList.Builder.class);
    }

    // Construct using me.grpc.RestaurantList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (restaurantsBuilder_ == null) {
        restaurants_ = java.util.Collections.emptyList();
      } else {
        restaurants_ = null;
        restaurantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return me.grpc.RestaurantOuterClass.internal_static_RestaurantList_descriptor;
    }

    @java.lang.Override
    public me.grpc.RestaurantList getDefaultInstanceForType() {
      return me.grpc.RestaurantList.getDefaultInstance();
    }

    @java.lang.Override
    public me.grpc.RestaurantList build() {
      me.grpc.RestaurantList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public me.grpc.RestaurantList buildPartial() {
      me.grpc.RestaurantList result = new me.grpc.RestaurantList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(me.grpc.RestaurantList result) {
      if (restaurantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          restaurants_ = java.util.Collections.unmodifiableList(restaurants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.restaurants_ = restaurants_;
      } else {
        result.restaurants_ = restaurantsBuilder_.build();
      }
    }

    private void buildPartial0(me.grpc.RestaurantList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof me.grpc.RestaurantList) {
        return mergeFrom((me.grpc.RestaurantList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(me.grpc.RestaurantList other) {
      if (other == me.grpc.RestaurantList.getDefaultInstance()) return this;
      if (restaurantsBuilder_ == null) {
        if (!other.restaurants_.isEmpty()) {
          if (restaurants_.isEmpty()) {
            restaurants_ = other.restaurants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRestaurantsIsMutable();
            restaurants_.addAll(other.restaurants_);
          }
          onChanged();
        }
      } else {
        if (!other.restaurants_.isEmpty()) {
          if (restaurantsBuilder_.isEmpty()) {
            restaurantsBuilder_.dispose();
            restaurantsBuilder_ = null;
            restaurants_ = other.restaurants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            restaurantsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRestaurantsFieldBuilder() : null;
          } else {
            restaurantsBuilder_.addAllMessages(other.restaurants_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              me.grpc.Restaurant m =
                  input.readMessage(
                      me.grpc.Restaurant.parser(),
                      extensionRegistry);
              if (restaurantsBuilder_ == null) {
                ensureRestaurantsIsMutable();
                restaurants_.add(m);
              } else {
                restaurantsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<me.grpc.Restaurant> restaurants_ =
      java.util.Collections.emptyList();
    private void ensureRestaurantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        restaurants_ = new java.util.ArrayList<me.grpc.Restaurant>(restaurants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        me.grpc.Restaurant, me.grpc.Restaurant.Builder, me.grpc.RestaurantOrBuilder> restaurantsBuilder_;

    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public java.util.List<me.grpc.Restaurant> getRestaurantsList() {
      if (restaurantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(restaurants_);
      } else {
        return restaurantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public int getRestaurantsCount() {
      if (restaurantsBuilder_ == null) {
        return restaurants_.size();
      } else {
        return restaurantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public me.grpc.Restaurant getRestaurants(int index) {
      if (restaurantsBuilder_ == null) {
        return restaurants_.get(index);
      } else {
        return restaurantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder setRestaurants(
        int index, me.grpc.Restaurant value) {
      if (restaurantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantsIsMutable();
        restaurants_.set(index, value);
        onChanged();
      } else {
        restaurantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder setRestaurants(
        int index, me.grpc.Restaurant.Builder builderForValue) {
      if (restaurantsBuilder_ == null) {
        ensureRestaurantsIsMutable();
        restaurants_.set(index, builderForValue.build());
        onChanged();
      } else {
        restaurantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder addRestaurants(me.grpc.Restaurant value) {
      if (restaurantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantsIsMutable();
        restaurants_.add(value);
        onChanged();
      } else {
        restaurantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder addRestaurants(
        int index, me.grpc.Restaurant value) {
      if (restaurantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantsIsMutable();
        restaurants_.add(index, value);
        onChanged();
      } else {
        restaurantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder addRestaurants(
        me.grpc.Restaurant.Builder builderForValue) {
      if (restaurantsBuilder_ == null) {
        ensureRestaurantsIsMutable();
        restaurants_.add(builderForValue.build());
        onChanged();
      } else {
        restaurantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder addRestaurants(
        int index, me.grpc.Restaurant.Builder builderForValue) {
      if (restaurantsBuilder_ == null) {
        ensureRestaurantsIsMutable();
        restaurants_.add(index, builderForValue.build());
        onChanged();
      } else {
        restaurantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder addAllRestaurants(
        java.lang.Iterable<? extends me.grpc.Restaurant> values) {
      if (restaurantsBuilder_ == null) {
        ensureRestaurantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, restaurants_);
        onChanged();
      } else {
        restaurantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder clearRestaurants() {
      if (restaurantsBuilder_ == null) {
        restaurants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        restaurantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public Builder removeRestaurants(int index) {
      if (restaurantsBuilder_ == null) {
        ensureRestaurantsIsMutable();
        restaurants_.remove(index);
        onChanged();
      } else {
        restaurantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public me.grpc.Restaurant.Builder getRestaurantsBuilder(
        int index) {
      return getRestaurantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public me.grpc.RestaurantOrBuilder getRestaurantsOrBuilder(
        int index) {
      if (restaurantsBuilder_ == null) {
        return restaurants_.get(index);  } else {
        return restaurantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public java.util.List<? extends me.grpc.RestaurantOrBuilder> 
         getRestaurantsOrBuilderList() {
      if (restaurantsBuilder_ != null) {
        return restaurantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(restaurants_);
      }
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public me.grpc.Restaurant.Builder addRestaurantsBuilder() {
      return getRestaurantsFieldBuilder().addBuilder(
          me.grpc.Restaurant.getDefaultInstance());
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public me.grpc.Restaurant.Builder addRestaurantsBuilder(
        int index) {
      return getRestaurantsFieldBuilder().addBuilder(
          index, me.grpc.Restaurant.getDefaultInstance());
    }
    /**
     * <pre>
     * list of Restu messages
     * </pre>
     *
     * <code>repeated .Restaurant restaurants = 1;</code>
     */
    public java.util.List<me.grpc.Restaurant.Builder> 
         getRestaurantsBuilderList() {
      return getRestaurantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        me.grpc.Restaurant, me.grpc.Restaurant.Builder, me.grpc.RestaurantOrBuilder> 
        getRestaurantsFieldBuilder() {
      if (restaurantsBuilder_ == null) {
        restaurantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            me.grpc.Restaurant, me.grpc.Restaurant.Builder, me.grpc.RestaurantOrBuilder>(
                restaurants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        restaurants_ = null;
      }
      return restaurantsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:RestaurantList)
  }

  // @@protoc_insertion_point(class_scope:RestaurantList)
  private static final me.grpc.RestaurantList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new me.grpc.RestaurantList();
  }

  public static me.grpc.RestaurantList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestaurantList>
      PARSER = new com.google.protobuf.AbstractParser<RestaurantList>() {
    @java.lang.Override
    public RestaurantList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RestaurantList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestaurantList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public me.grpc.RestaurantList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

