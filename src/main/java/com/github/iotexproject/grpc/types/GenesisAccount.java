// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/genesis.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.GenesisAccount}
 */
public final class GenesisAccount extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.GenesisAccount)
    GenesisAccountOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GenesisAccount.class.getName());
  }
  // Use GenesisAccount.newBuilder() to construct.
  private GenesisAccount(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenesisAccount() {
    initBalanceAddrs_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    initBalances_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.GenesisAccount.class, com.github.iotexproject.grpc.types.GenesisAccount.Builder.class);
  }

  public static final int INITBALANCEADDRS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList initBalanceAddrs_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string initBalanceAddrs = 1;</code>
   * @return A list containing the initBalanceAddrs.
   */
  public com.google.protobuf.ProtocolStringList
      getInitBalanceAddrsList() {
    return initBalanceAddrs_;
  }
  /**
   * <code>repeated string initBalanceAddrs = 1;</code>
   * @return The count of initBalanceAddrs.
   */
  public int getInitBalanceAddrsCount() {
    return initBalanceAddrs_.size();
  }
  /**
   * <code>repeated string initBalanceAddrs = 1;</code>
   * @param index The index of the element to return.
   * @return The initBalanceAddrs at the given index.
   */
  public java.lang.String getInitBalanceAddrs(int index) {
    return initBalanceAddrs_.get(index);
  }
  /**
   * <code>repeated string initBalanceAddrs = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the initBalanceAddrs at the given index.
   */
  public com.google.protobuf.ByteString
      getInitBalanceAddrsBytes(int index) {
    return initBalanceAddrs_.getByteString(index);
  }

  public static final int INITBALANCES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList initBalances_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string initBalances = 2;</code>
   * @return A list containing the initBalances.
   */
  public com.google.protobuf.ProtocolStringList
      getInitBalancesList() {
    return initBalances_;
  }
  /**
   * <code>repeated string initBalances = 2;</code>
   * @return The count of initBalances.
   */
  public int getInitBalancesCount() {
    return initBalances_.size();
  }
  /**
   * <code>repeated string initBalances = 2;</code>
   * @param index The index of the element to return.
   * @return The initBalances at the given index.
   */
  public java.lang.String getInitBalances(int index) {
    return initBalances_.get(index);
  }
  /**
   * <code>repeated string initBalances = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the initBalances at the given index.
   */
  public com.google.protobuf.ByteString
      getInitBalancesBytes(int index) {
    return initBalances_.getByteString(index);
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
    for (int i = 0; i < initBalanceAddrs_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, initBalanceAddrs_.getRaw(i));
    }
    for (int i = 0; i < initBalances_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, initBalances_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < initBalanceAddrs_.size(); i++) {
        dataSize += computeStringSizeNoTag(initBalanceAddrs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInitBalanceAddrsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < initBalances_.size(); i++) {
        dataSize += computeStringSizeNoTag(initBalances_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInitBalancesList().size();
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.GenesisAccount)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.GenesisAccount other = (com.github.iotexproject.grpc.types.GenesisAccount) obj;

    if (!getInitBalanceAddrsList()
        .equals(other.getInitBalanceAddrsList())) return false;
    if (!getInitBalancesList()
        .equals(other.getInitBalancesList())) return false;
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
    if (getInitBalanceAddrsCount() > 0) {
      hash = (37 * hash) + INITBALANCEADDRS_FIELD_NUMBER;
      hash = (53 * hash) + getInitBalanceAddrsList().hashCode();
    }
    if (getInitBalancesCount() > 0) {
      hash = (37 * hash) + INITBALANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInitBalancesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.GenesisAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.GenesisAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisAccount parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.GenesisAccount prototype) {
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
   * Protobuf type {@code iotextypes.GenesisAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.GenesisAccount)
      com.github.iotexproject.grpc.types.GenesisAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.GenesisAccount.class, com.github.iotexproject.grpc.types.GenesisAccount.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.GenesisAccount.newBuilder()
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
      initBalanceAddrs_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      initBalances_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisAccount_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisAccount getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.GenesisAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisAccount build() {
      com.github.iotexproject.grpc.types.GenesisAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisAccount buildPartial() {
      com.github.iotexproject.grpc.types.GenesisAccount result = new com.github.iotexproject.grpc.types.GenesisAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.GenesisAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        initBalanceAddrs_.makeImmutable();
        result.initBalanceAddrs_ = initBalanceAddrs_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        initBalances_.makeImmutable();
        result.initBalances_ = initBalances_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.GenesisAccount) {
        return mergeFrom((com.github.iotexproject.grpc.types.GenesisAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.GenesisAccount other) {
      if (other == com.github.iotexproject.grpc.types.GenesisAccount.getDefaultInstance()) return this;
      if (!other.initBalanceAddrs_.isEmpty()) {
        if (initBalanceAddrs_.isEmpty()) {
          initBalanceAddrs_ = other.initBalanceAddrs_;
          bitField0_ |= 0x00000001;
        } else {
          ensureInitBalanceAddrsIsMutable();
          initBalanceAddrs_.addAll(other.initBalanceAddrs_);
        }
        onChanged();
      }
      if (!other.initBalances_.isEmpty()) {
        if (initBalances_.isEmpty()) {
          initBalances_ = other.initBalances_;
          bitField0_ |= 0x00000002;
        } else {
          ensureInitBalancesIsMutable();
          initBalances_.addAll(other.initBalances_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureInitBalanceAddrsIsMutable();
              initBalanceAddrs_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureInitBalancesIsMutable();
              initBalances_.add(s);
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

    private com.google.protobuf.LazyStringArrayList initBalanceAddrs_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureInitBalanceAddrsIsMutable() {
      if (!initBalanceAddrs_.isModifiable()) {
        initBalanceAddrs_ = new com.google.protobuf.LazyStringArrayList(initBalanceAddrs_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @return A list containing the initBalanceAddrs.
     */
    public com.google.protobuf.ProtocolStringList
        getInitBalanceAddrsList() {
      initBalanceAddrs_.makeImmutable();
      return initBalanceAddrs_;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @return The count of initBalanceAddrs.
     */
    public int getInitBalanceAddrsCount() {
      return initBalanceAddrs_.size();
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param index The index of the element to return.
     * @return The initBalanceAddrs at the given index.
     */
    public java.lang.String getInitBalanceAddrs(int index) {
      return initBalanceAddrs_.get(index);
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the initBalanceAddrs at the given index.
     */
    public com.google.protobuf.ByteString
        getInitBalanceAddrsBytes(int index) {
      return initBalanceAddrs_.getByteString(index);
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param index The index to set the value at.
     * @param value The initBalanceAddrs to set.
     * @return This builder for chaining.
     */
    public Builder setInitBalanceAddrs(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInitBalanceAddrsIsMutable();
      initBalanceAddrs_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param value The initBalanceAddrs to add.
     * @return This builder for chaining.
     */
    public Builder addInitBalanceAddrs(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInitBalanceAddrsIsMutable();
      initBalanceAddrs_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param values The initBalanceAddrs to add.
     * @return This builder for chaining.
     */
    public Builder addAllInitBalanceAddrs(
        java.lang.Iterable<java.lang.String> values) {
      ensureInitBalanceAddrsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, initBalanceAddrs_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitBalanceAddrs() {
      initBalanceAddrs_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalanceAddrs = 1;</code>
     * @param value The bytes of the initBalanceAddrs to add.
     * @return This builder for chaining.
     */
    public Builder addInitBalanceAddrsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureInitBalanceAddrsIsMutable();
      initBalanceAddrs_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList initBalances_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureInitBalancesIsMutable() {
      if (!initBalances_.isModifiable()) {
        initBalances_ = new com.google.protobuf.LazyStringArrayList(initBalances_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @return A list containing the initBalances.
     */
    public com.google.protobuf.ProtocolStringList
        getInitBalancesList() {
      initBalances_.makeImmutable();
      return initBalances_;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @return The count of initBalances.
     */
    public int getInitBalancesCount() {
      return initBalances_.size();
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param index The index of the element to return.
     * @return The initBalances at the given index.
     */
    public java.lang.String getInitBalances(int index) {
      return initBalances_.get(index);
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the initBalances at the given index.
     */
    public com.google.protobuf.ByteString
        getInitBalancesBytes(int index) {
      return initBalances_.getByteString(index);
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param index The index to set the value at.
     * @param value The initBalances to set.
     * @return This builder for chaining.
     */
    public Builder setInitBalances(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInitBalancesIsMutable();
      initBalances_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param value The initBalances to add.
     * @return This builder for chaining.
     */
    public Builder addInitBalances(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInitBalancesIsMutable();
      initBalances_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param values The initBalances to add.
     * @return This builder for chaining.
     */
    public Builder addAllInitBalances(
        java.lang.Iterable<java.lang.String> values) {
      ensureInitBalancesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, initBalances_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitBalances() {
      initBalances_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string initBalances = 2;</code>
     * @param value The bytes of the initBalances to add.
     * @return This builder for chaining.
     */
    public Builder addInitBalancesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureInitBalancesIsMutable();
      initBalances_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.GenesisAccount)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.GenesisAccount)
  private static final com.github.iotexproject.grpc.types.GenesisAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.GenesisAccount();
  }

  public static com.github.iotexproject.grpc.types.GenesisAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisAccount>
      PARSER = new com.google.protobuf.AbstractParser<GenesisAccount>() {
    @java.lang.Override
    public GenesisAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.GenesisAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

