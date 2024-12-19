// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.AccessTuple}
 */
public final class AccessTuple extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.AccessTuple)
    AccessTupleOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      AccessTuple.class.getName());
  }
  // Use AccessTuple.newBuilder() to construct.
  private AccessTuple(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccessTuple() {
    address_ = "";
    storageKeys_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_AccessTuple_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_AccessTuple_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.AccessTuple.class, com.github.iotexproject.grpc.types.AccessTuple.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGEKEYS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList storageKeys_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string storageKeys = 2;</code>
   * @return A list containing the storageKeys.
   */
  public com.google.protobuf.ProtocolStringList
      getStorageKeysList() {
    return storageKeys_;
  }
  /**
   * <code>repeated string storageKeys = 2;</code>
   * @return The count of storageKeys.
   */
  public int getStorageKeysCount() {
    return storageKeys_.size();
  }
  /**
   * <code>repeated string storageKeys = 2;</code>
   * @param index The index of the element to return.
   * @return The storageKeys at the given index.
   */
  public java.lang.String getStorageKeys(int index) {
    return storageKeys_.get(index);
  }
  /**
   * <code>repeated string storageKeys = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storageKeys at the given index.
   */
  public com.google.protobuf.ByteString
      getStorageKeysBytes(int index) {
    return storageKeys_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, address_);
    }
    for (int i = 0; i < storageKeys_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, storageKeys_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, address_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < storageKeys_.size(); i++) {
        dataSize += computeStringSizeNoTag(storageKeys_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStorageKeysList().size();
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.AccessTuple)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.AccessTuple other = (com.github.iotexproject.grpc.types.AccessTuple) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getStorageKeysList()
        .equals(other.getStorageKeysList())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (getStorageKeysCount() > 0) {
      hash = (37 * hash) + STORAGEKEYS_FIELD_NUMBER;
      hash = (53 * hash) + getStorageKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.AccessTuple parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.AccessTuple parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.AccessTuple parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.AccessTuple prototype) {
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
   * Protobuf type {@code iotextypes.AccessTuple}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.AccessTuple)
      com.github.iotexproject.grpc.types.AccessTupleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_AccessTuple_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_AccessTuple_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.AccessTuple.class, com.github.iotexproject.grpc.types.AccessTuple.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.AccessTuple.newBuilder()
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
      address_ = "";
      storageKeys_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_AccessTuple_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccessTuple getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.AccessTuple.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccessTuple build() {
      com.github.iotexproject.grpc.types.AccessTuple result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccessTuple buildPartial() {
      com.github.iotexproject.grpc.types.AccessTuple result = new com.github.iotexproject.grpc.types.AccessTuple(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.AccessTuple result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        storageKeys_.makeImmutable();
        result.storageKeys_ = storageKeys_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.AccessTuple) {
        return mergeFrom((com.github.iotexproject.grpc.types.AccessTuple)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.AccessTuple other) {
      if (other == com.github.iotexproject.grpc.types.AccessTuple.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.storageKeys_.isEmpty()) {
        if (storageKeys_.isEmpty()) {
          storageKeys_ = other.storageKeys_;
          bitField0_ |= 0x00000002;
        } else {
          ensureStorageKeysIsMutable();
          storageKeys_.addAll(other.storageKeys_);
        }
        onChanged();
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureStorageKeysIsMutable();
              storageKeys_.add(s);
              break;
            } // case 18
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList storageKeys_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureStorageKeysIsMutable() {
      if (!storageKeys_.isModifiable()) {
        storageKeys_ = new com.google.protobuf.LazyStringArrayList(storageKeys_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @return A list containing the storageKeys.
     */
    public com.google.protobuf.ProtocolStringList
        getStorageKeysList() {
      storageKeys_.makeImmutable();
      return storageKeys_;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @return The count of storageKeys.
     */
    public int getStorageKeysCount() {
      return storageKeys_.size();
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param index The index of the element to return.
     * @return The storageKeys at the given index.
     */
    public java.lang.String getStorageKeys(int index) {
      return storageKeys_.get(index);
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the storageKeys at the given index.
     */
    public com.google.protobuf.ByteString
        getStorageKeysBytes(int index) {
      return storageKeys_.getByteString(index);
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param index The index to set the value at.
     * @param value The storageKeys to set.
     * @return This builder for chaining.
     */
    public Builder setStorageKeys(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStorageKeysIsMutable();
      storageKeys_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param value The storageKeys to add.
     * @return This builder for chaining.
     */
    public Builder addStorageKeys(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureStorageKeysIsMutable();
      storageKeys_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param values The storageKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAllStorageKeys(
        java.lang.Iterable<java.lang.String> values) {
      ensureStorageKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, storageKeys_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStorageKeys() {
      storageKeys_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string storageKeys = 2;</code>
     * @param value The bytes of the storageKeys to add.
     * @return This builder for chaining.
     */
    public Builder addStorageKeysBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureStorageKeysIsMutable();
      storageKeys_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.AccessTuple)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.AccessTuple)
  private static final com.github.iotexproject.grpc.types.AccessTuple DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.AccessTuple();
  }

  public static com.github.iotexproject.grpc.types.AccessTuple getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessTuple>
      PARSER = new com.google.protobuf.AbstractParser<AccessTuple>() {
    @java.lang.Override
    public AccessTuple parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessTuple> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessTuple> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.AccessTuple getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
