// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.StopSubChain}
 */
public final class StopSubChain extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.StopSubChain)
    StopSubChainOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      StopSubChain.class.getName());
  }
  // Use StopSubChain.newBuilder() to construct.
  private StopSubChain(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StopSubChain() {
    subChainAddress_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StopSubChain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StopSubChain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.StopSubChain.class, com.github.iotexproject.grpc.types.StopSubChain.Builder.class);
  }

  public static final int CHAINID_FIELD_NUMBER = 1;
  private int chainID_ = 0;
  /**
   * <code>uint32 chainID = 1;</code>
   * @return The chainID.
   */
  @java.lang.Override
  public int getChainID() {
    return chainID_;
  }

  public static final int STOPHEIGHT_FIELD_NUMBER = 2;
  private long stopHeight_ = 0L;
  /**
   * <code>uint64 stopHeight = 2;</code>
   * @return The stopHeight.
   */
  @java.lang.Override
  public long getStopHeight() {
    return stopHeight_;
  }

  public static final int SUBCHAINADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subChainAddress_ = "";
  /**
   * <code>string subChainAddress = 3;</code>
   * @return The subChainAddress.
   */
  @java.lang.Override
  public java.lang.String getSubChainAddress() {
    java.lang.Object ref = subChainAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subChainAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string subChainAddress = 3;</code>
   * @return The bytes for subChainAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubChainAddressBytes() {
    java.lang.Object ref = subChainAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subChainAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (chainID_ != 0) {
      output.writeUInt32(1, chainID_);
    }
    if (stopHeight_ != 0L) {
      output.writeUInt64(2, stopHeight_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subChainAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, subChainAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chainID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, chainID_);
    }
    if (stopHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, stopHeight_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subChainAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, subChainAddress_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.StopSubChain)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.StopSubChain other = (com.github.iotexproject.grpc.types.StopSubChain) obj;

    if (getChainID()
        != other.getChainID()) return false;
    if (getStopHeight()
        != other.getStopHeight()) return false;
    if (!getSubChainAddress()
        .equals(other.getSubChainAddress())) return false;
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
    hash = (37 * hash) + CHAINID_FIELD_NUMBER;
    hash = (53 * hash) + getChainID();
    hash = (37 * hash) + STOPHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStopHeight());
    hash = (37 * hash) + SUBCHAINADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getSubChainAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.StopSubChain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.StopSubChain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.StopSubChain parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.StopSubChain prototype) {
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
   * Protobuf type {@code iotextypes.StopSubChain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.StopSubChain)
      com.github.iotexproject.grpc.types.StopSubChainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StopSubChain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StopSubChain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.StopSubChain.class, com.github.iotexproject.grpc.types.StopSubChain.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.StopSubChain.newBuilder()
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
      chainID_ = 0;
      stopHeight_ = 0L;
      subChainAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StopSubChain_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StopSubChain getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.StopSubChain.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StopSubChain build() {
      com.github.iotexproject.grpc.types.StopSubChain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StopSubChain buildPartial() {
      com.github.iotexproject.grpc.types.StopSubChain result = new com.github.iotexproject.grpc.types.StopSubChain(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.StopSubChain result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chainID_ = chainID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stopHeight_ = stopHeight_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subChainAddress_ = subChainAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.StopSubChain) {
        return mergeFrom((com.github.iotexproject.grpc.types.StopSubChain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.StopSubChain other) {
      if (other == com.github.iotexproject.grpc.types.StopSubChain.getDefaultInstance()) return this;
      if (other.getChainID() != 0) {
        setChainID(other.getChainID());
      }
      if (other.getStopHeight() != 0L) {
        setStopHeight(other.getStopHeight());
      }
      if (!other.getSubChainAddress().isEmpty()) {
        subChainAddress_ = other.subChainAddress_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              chainID_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              stopHeight_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              subChainAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int chainID_ ;
    /**
     * <code>uint32 chainID = 1;</code>
     * @return The chainID.
     */
    @java.lang.Override
    public int getChainID() {
      return chainID_;
    }
    /**
     * <code>uint32 chainID = 1;</code>
     * @param value The chainID to set.
     * @return This builder for chaining.
     */
    public Builder setChainID(int value) {

      chainID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 chainID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChainID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      chainID_ = 0;
      onChanged();
      return this;
    }

    private long stopHeight_ ;
    /**
     * <code>uint64 stopHeight = 2;</code>
     * @return The stopHeight.
     */
    @java.lang.Override
    public long getStopHeight() {
      return stopHeight_;
    }
    /**
     * <code>uint64 stopHeight = 2;</code>
     * @param value The stopHeight to set.
     * @return This builder for chaining.
     */
    public Builder setStopHeight(long value) {

      stopHeight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 stopHeight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStopHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      stopHeight_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subChainAddress_ = "";
    /**
     * <code>string subChainAddress = 3;</code>
     * @return The subChainAddress.
     */
    public java.lang.String getSubChainAddress() {
      java.lang.Object ref = subChainAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subChainAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subChainAddress = 3;</code>
     * @return The bytes for subChainAddress.
     */
    public com.google.protobuf.ByteString
        getSubChainAddressBytes() {
      java.lang.Object ref = subChainAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subChainAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subChainAddress = 3;</code>
     * @param value The subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subChainAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubChainAddress() {
      subChainAddress_ = getDefaultInstance().getSubChainAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 3;</code>
     * @param value The bytes for subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subChainAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.StopSubChain)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.StopSubChain)
  private static final com.github.iotexproject.grpc.types.StopSubChain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.StopSubChain();
  }

  public static com.github.iotexproject.grpc.types.StopSubChain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopSubChain>
      PARSER = new com.google.protobuf.AbstractParser<StopSubChain>() {
    @java.lang.Override
    public StopSubChain parsePartialFrom(
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

  public static com.google.protobuf.Parser<StopSubChain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopSubChain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.StopSubChain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

