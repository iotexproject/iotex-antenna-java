// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/genesis.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.GenesisDelegate}
 */
public final class GenesisDelegate extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.GenesisDelegate)
    GenesisDelegateOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GenesisDelegate.class.getName());
  }
  // Use GenesisDelegate.newBuilder() to construct.
  private GenesisDelegate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenesisDelegate() {
    operatorAddr_ = "";
    rewardAddr_ = "";
    votes_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisDelegate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisDelegate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.GenesisDelegate.class, com.github.iotexproject.grpc.types.GenesisDelegate.Builder.class);
  }

  public static final int OPERATORADDR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object operatorAddr_ = "";
  /**
   * <code>string operatorAddr = 1;</code>
   * @return The operatorAddr.
   */
  @java.lang.Override
  public java.lang.String getOperatorAddr() {
    java.lang.Object ref = operatorAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operatorAddr_ = s;
      return s;
    }
  }
  /**
   * <code>string operatorAddr = 1;</code>
   * @return The bytes for operatorAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperatorAddrBytes() {
    java.lang.Object ref = operatorAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operatorAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARDADDR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardAddr_ = "";
  /**
   * <code>string rewardAddr = 2;</code>
   * @return The rewardAddr.
   */
  @java.lang.Override
  public java.lang.String getRewardAddr() {
    java.lang.Object ref = rewardAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardAddr_ = s;
      return s;
    }
  }
  /**
   * <code>string rewardAddr = 2;</code>
   * @return The bytes for rewardAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardAddrBytes() {
    java.lang.Object ref = rewardAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOTES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object votes_ = "";
  /**
   * <code>string votes = 3;</code>
   * @return The votes.
   */
  @java.lang.Override
  public java.lang.String getVotes() {
    java.lang.Object ref = votes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      votes_ = s;
      return s;
    }
  }
  /**
   * <code>string votes = 3;</code>
   * @return The bytes for votes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVotesBytes() {
    java.lang.Object ref = votes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      votes_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(operatorAddr_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, operatorAddr_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(rewardAddr_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, rewardAddr_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(votes_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, votes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(operatorAddr_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, operatorAddr_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(rewardAddr_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, rewardAddr_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(votes_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, votes_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.GenesisDelegate)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.GenesisDelegate other = (com.github.iotexproject.grpc.types.GenesisDelegate) obj;

    if (!getOperatorAddr()
        .equals(other.getOperatorAddr())) return false;
    if (!getRewardAddr()
        .equals(other.getRewardAddr())) return false;
    if (!getVotes()
        .equals(other.getVotes())) return false;
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
    hash = (37 * hash) + OPERATORADDR_FIELD_NUMBER;
    hash = (53 * hash) + getOperatorAddr().hashCode();
    hash = (37 * hash) + REWARDADDR_FIELD_NUMBER;
    hash = (53 * hash) + getRewardAddr().hashCode();
    hash = (37 * hash) + VOTES_FIELD_NUMBER;
    hash = (53 * hash) + getVotes().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.GenesisDelegate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.GenesisDelegate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisDelegate parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.GenesisDelegate prototype) {
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
   * Protobuf type {@code iotextypes.GenesisDelegate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.GenesisDelegate)
      com.github.iotexproject.grpc.types.GenesisDelegateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisDelegate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisDelegate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.GenesisDelegate.class, com.github.iotexproject.grpc.types.GenesisDelegate.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.GenesisDelegate.newBuilder()
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
      operatorAddr_ = "";
      rewardAddr_ = "";
      votes_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisDelegate_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisDelegate getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.GenesisDelegate.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisDelegate build() {
      com.github.iotexproject.grpc.types.GenesisDelegate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisDelegate buildPartial() {
      com.github.iotexproject.grpc.types.GenesisDelegate result = new com.github.iotexproject.grpc.types.GenesisDelegate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.GenesisDelegate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operatorAddr_ = operatorAddr_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewardAddr_ = rewardAddr_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.votes_ = votes_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.GenesisDelegate) {
        return mergeFrom((com.github.iotexproject.grpc.types.GenesisDelegate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.GenesisDelegate other) {
      if (other == com.github.iotexproject.grpc.types.GenesisDelegate.getDefaultInstance()) return this;
      if (!other.getOperatorAddr().isEmpty()) {
        operatorAddr_ = other.operatorAddr_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRewardAddr().isEmpty()) {
        rewardAddr_ = other.rewardAddr_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getVotes().isEmpty()) {
        votes_ = other.votes_;
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
            case 10: {
              operatorAddr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              rewardAddr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              votes_ = input.readStringRequireUtf8();
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

    private java.lang.Object operatorAddr_ = "";
    /**
     * <code>string operatorAddr = 1;</code>
     * @return The operatorAddr.
     */
    public java.lang.String getOperatorAddr() {
      java.lang.Object ref = operatorAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operatorAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operatorAddr = 1;</code>
     * @return The bytes for operatorAddr.
     */
    public com.google.protobuf.ByteString
        getOperatorAddrBytes() {
      java.lang.Object ref = operatorAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operatorAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operatorAddr = 1;</code>
     * @param value The operatorAddr to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorAddr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      operatorAddr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string operatorAddr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperatorAddr() {
      operatorAddr_ = getDefaultInstance().getOperatorAddr();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string operatorAddr = 1;</code>
     * @param value The bytes for operatorAddr to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      operatorAddr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object rewardAddr_ = "";
    /**
     * <code>string rewardAddr = 2;</code>
     * @return The rewardAddr.
     */
    public java.lang.String getRewardAddr() {
      java.lang.Object ref = rewardAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rewardAddr = 2;</code>
     * @return The bytes for rewardAddr.
     */
    public com.google.protobuf.ByteString
        getRewardAddrBytes() {
      java.lang.Object ref = rewardAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rewardAddr = 2;</code>
     * @param value The rewardAddr to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardAddr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string rewardAddr = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAddr() {
      rewardAddr_ = getDefaultInstance().getRewardAddr();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string rewardAddr = 2;</code>
     * @param value The bytes for rewardAddr to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardAddr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object votes_ = "";
    /**
     * <code>string votes = 3;</code>
     * @return The votes.
     */
    public java.lang.String getVotes() {
      java.lang.Object ref = votes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        votes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string votes = 3;</code>
     * @return The bytes for votes.
     */
    public com.google.protobuf.ByteString
        getVotesBytes() {
      java.lang.Object ref = votes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        votes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string votes = 3;</code>
     * @param value The votes to set.
     * @return This builder for chaining.
     */
    public Builder setVotes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      votes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string votes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVotes() {
      votes_ = getDefaultInstance().getVotes();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string votes = 3;</code>
     * @param value The bytes for votes to set.
     * @return This builder for chaining.
     */
    public Builder setVotesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      votes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.GenesisDelegate)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.GenesisDelegate)
  private static final com.github.iotexproject.grpc.types.GenesisDelegate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.GenesisDelegate();
  }

  public static com.github.iotexproject.grpc.types.GenesisDelegate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisDelegate>
      PARSER = new com.google.protobuf.AbstractParser<GenesisDelegate>() {
    @java.lang.Override
    public GenesisDelegate parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisDelegate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisDelegate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.GenesisDelegate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

