// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.ReceiptInfo}
 */
public final class ReceiptInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.ReceiptInfo)
    ReceiptInfoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ReceiptInfo.class.getName());
  }
  // Use ReceiptInfo.newBuilder() to construct.
  private ReceiptInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ReceiptInfo() {
    blkHash_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_ReceiptInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_ReceiptInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.ReceiptInfo.class, com.github.iotexproject.grpc.api.ReceiptInfo.Builder.class);
  }

  private int bitField0_;
  public static final int RECEIPT_FIELD_NUMBER = 1;
  private com.github.iotexproject.grpc.types.Receipt receipt_;
  /**
   * <code>.iotextypes.Receipt receipt = 1;</code>
   * @return Whether the receipt field is set.
   */
  @java.lang.Override
  public boolean hasReceipt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.iotextypes.Receipt receipt = 1;</code>
   * @return The receipt.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Receipt getReceipt() {
    return receipt_ == null ? com.github.iotexproject.grpc.types.Receipt.getDefaultInstance() : receipt_;
  }
  /**
   * <code>.iotextypes.Receipt receipt = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptOrBuilder() {
    return receipt_ == null ? com.github.iotexproject.grpc.types.Receipt.getDefaultInstance() : receipt_;
  }

  public static final int BLKHASH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object blkHash_ = "";
  /**
   * <code>string blkHash = 2;</code>
   * @return The blkHash.
   */
  @java.lang.Override
  public java.lang.String getBlkHash() {
    java.lang.Object ref = blkHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      blkHash_ = s;
      return s;
    }
  }
  /**
   * <code>string blkHash = 2;</code>
   * @return The bytes for blkHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBlkHashBytes() {
    java.lang.Object ref = blkHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      blkHash_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getReceipt());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(blkHash_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, blkHash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReceipt());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(blkHash_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, blkHash_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.ReceiptInfo)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.ReceiptInfo other = (com.github.iotexproject.grpc.api.ReceiptInfo) obj;

    if (hasReceipt() != other.hasReceipt()) return false;
    if (hasReceipt()) {
      if (!getReceipt()
          .equals(other.getReceipt())) return false;
    }
    if (!getBlkHash()
        .equals(other.getBlkHash())) return false;
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
    if (hasReceipt()) {
      hash = (37 * hash) + RECEIPT_FIELD_NUMBER;
      hash = (53 * hash) + getReceipt().hashCode();
    }
    hash = (37 * hash) + BLKHASH_FIELD_NUMBER;
    hash = (53 * hash) + getBlkHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.ReceiptInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.ReceiptInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.ReceiptInfo parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.ReceiptInfo prototype) {
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
   * Protobuf type {@code iotexapi.ReceiptInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.ReceiptInfo)
      com.github.iotexproject.grpc.api.ReceiptInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_ReceiptInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_ReceiptInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.ReceiptInfo.class, com.github.iotexproject.grpc.api.ReceiptInfo.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.ReceiptInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getReceiptFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      receipt_ = null;
      if (receiptBuilder_ != null) {
        receiptBuilder_.dispose();
        receiptBuilder_ = null;
      }
      blkHash_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_ReceiptInfo_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.ReceiptInfo getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.ReceiptInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.ReceiptInfo build() {
      com.github.iotexproject.grpc.api.ReceiptInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.ReceiptInfo buildPartial() {
      com.github.iotexproject.grpc.api.ReceiptInfo result = new com.github.iotexproject.grpc.api.ReceiptInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.ReceiptInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.receipt_ = receiptBuilder_ == null
            ? receipt_
            : receiptBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.blkHash_ = blkHash_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.ReceiptInfo) {
        return mergeFrom((com.github.iotexproject.grpc.api.ReceiptInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.ReceiptInfo other) {
      if (other == com.github.iotexproject.grpc.api.ReceiptInfo.getDefaultInstance()) return this;
      if (other.hasReceipt()) {
        mergeReceipt(other.getReceipt());
      }
      if (!other.getBlkHash().isEmpty()) {
        blkHash_ = other.blkHash_;
        bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getReceiptFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              blkHash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private com.github.iotexproject.grpc.types.Receipt receipt_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder> receiptBuilder_;
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     * @return Whether the receipt field is set.
     */
    public boolean hasReceipt() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     * @return The receipt.
     */
    public com.github.iotexproject.grpc.types.Receipt getReceipt() {
      if (receiptBuilder_ == null) {
        return receipt_ == null ? com.github.iotexproject.grpc.types.Receipt.getDefaultInstance() : receipt_;
      } else {
        return receiptBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public Builder setReceipt(com.github.iotexproject.grpc.types.Receipt value) {
      if (receiptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        receipt_ = value;
      } else {
        receiptBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public Builder setReceipt(
        com.github.iotexproject.grpc.types.Receipt.Builder builderForValue) {
      if (receiptBuilder_ == null) {
        receipt_ = builderForValue.build();
      } else {
        receiptBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public Builder mergeReceipt(com.github.iotexproject.grpc.types.Receipt value) {
      if (receiptBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          receipt_ != null &&
          receipt_ != com.github.iotexproject.grpc.types.Receipt.getDefaultInstance()) {
          getReceiptBuilder().mergeFrom(value);
        } else {
          receipt_ = value;
        }
      } else {
        receiptBuilder_.mergeFrom(value);
      }
      if (receipt_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public Builder clearReceipt() {
      bitField0_ = (bitField0_ & ~0x00000001);
      receipt_ = null;
      if (receiptBuilder_ != null) {
        receiptBuilder_.dispose();
        receiptBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Receipt.Builder getReceiptBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReceiptFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    public com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptOrBuilder() {
      if (receiptBuilder_ != null) {
        return receiptBuilder_.getMessageOrBuilder();
      } else {
        return receipt_ == null ?
            com.github.iotexproject.grpc.types.Receipt.getDefaultInstance() : receipt_;
      }
    }
    /**
     * <code>.iotextypes.Receipt receipt = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder> 
        getReceiptFieldBuilder() {
      if (receiptBuilder_ == null) {
        receiptBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder>(
                getReceipt(),
                getParentForChildren(),
                isClean());
        receipt_ = null;
      }
      return receiptBuilder_;
    }

    private java.lang.Object blkHash_ = "";
    /**
     * <code>string blkHash = 2;</code>
     * @return The blkHash.
     */
    public java.lang.String getBlkHash() {
      java.lang.Object ref = blkHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        blkHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string blkHash = 2;</code>
     * @return The bytes for blkHash.
     */
    public com.google.protobuf.ByteString
        getBlkHashBytes() {
      java.lang.Object ref = blkHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blkHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string blkHash = 2;</code>
     * @param value The blkHash to set.
     * @return This builder for chaining.
     */
    public Builder setBlkHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      blkHash_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string blkHash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlkHash() {
      blkHash_ = getDefaultInstance().getBlkHash();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string blkHash = 2;</code>
     * @param value The bytes for blkHash to set.
     * @return This builder for chaining.
     */
    public Builder setBlkHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      blkHash_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.ReceiptInfo)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.ReceiptInfo)
  private static final com.github.iotexproject.grpc.api.ReceiptInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.ReceiptInfo();
  }

  public static com.github.iotexproject.grpc.api.ReceiptInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReceiptInfo>
      PARSER = new com.google.protobuf.AbstractParser<ReceiptInfo>() {
    @java.lang.Override
    public ReceiptInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReceiptInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReceiptInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.ReceiptInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

