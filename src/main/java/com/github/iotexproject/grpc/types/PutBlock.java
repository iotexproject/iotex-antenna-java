// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.PutBlock}
 */
public final class PutBlock extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.PutBlock)
    PutBlockOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      PutBlock.class.getName());
  }
  // Use PutBlock.newBuilder() to construct.
  private PutBlock(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PutBlock() {
    subChainAddress_ = "";
    roots_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutBlock_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutBlock_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.PutBlock.class, com.github.iotexproject.grpc.types.PutBlock.Builder.class);
  }

  public static final int SUBCHAINADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subChainAddress_ = "";
  /**
   * <code>string subChainAddress = 1;</code>
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
   * <code>string subChainAddress = 1;</code>
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

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_ = 0L;
  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROOTS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.github.iotexproject.grpc.types.MerkleRoot> roots_;
  /**
   * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.MerkleRoot> getRootsList() {
    return roots_;
  }
  /**
   * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.MerkleRootOrBuilder> 
      getRootsOrBuilderList() {
    return roots_;
  }
  /**
   * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
   */
  @java.lang.Override
  public int getRootsCount() {
    return roots_.size();
  }
  /**
   * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.MerkleRoot getRoots(int index) {
    return roots_.get(index);
  }
  /**
   * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.MerkleRootOrBuilder getRootsOrBuilder(
      int index) {
    return roots_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subChainAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, subChainAddress_);
    }
    if (height_ != 0L) {
      output.writeUInt64(2, height_);
    }
    for (int i = 0; i < roots_.size(); i++) {
      output.writeMessage(3, roots_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subChainAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, subChainAddress_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, height_);
    }
    for (int i = 0; i < roots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, roots_.get(i));
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.PutBlock)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.PutBlock other = (com.github.iotexproject.grpc.types.PutBlock) obj;

    if (!getSubChainAddress()
        .equals(other.getSubChainAddress())) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (!getRootsList()
        .equals(other.getRootsList())) return false;
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
    hash = (37 * hash) + SUBCHAINADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getSubChainAddress().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (getRootsCount() > 0) {
      hash = (37 * hash) + ROOTS_FIELD_NUMBER;
      hash = (53 * hash) + getRootsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.PutBlock parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.PutBlock parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PutBlock parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.PutBlock prototype) {
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
   * Protobuf type {@code iotextypes.PutBlock}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.PutBlock)
      com.github.iotexproject.grpc.types.PutBlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutBlock_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutBlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.PutBlock.class, com.github.iotexproject.grpc.types.PutBlock.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.PutBlock.newBuilder()
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
      subChainAddress_ = "";
      height_ = 0L;
      if (rootsBuilder_ == null) {
        roots_ = java.util.Collections.emptyList();
      } else {
        roots_ = null;
        rootsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutBlock_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutBlock getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.PutBlock.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutBlock build() {
      com.github.iotexproject.grpc.types.PutBlock result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutBlock buildPartial() {
      com.github.iotexproject.grpc.types.PutBlock result = new com.github.iotexproject.grpc.types.PutBlock(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.github.iotexproject.grpc.types.PutBlock result) {
      if (rootsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          roots_ = java.util.Collections.unmodifiableList(roots_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.roots_ = roots_;
      } else {
        result.roots_ = rootsBuilder_.build();
      }
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.PutBlock result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subChainAddress_ = subChainAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.PutBlock) {
        return mergeFrom((com.github.iotexproject.grpc.types.PutBlock)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.PutBlock other) {
      if (other == com.github.iotexproject.grpc.types.PutBlock.getDefaultInstance()) return this;
      if (!other.getSubChainAddress().isEmpty()) {
        subChainAddress_ = other.subChainAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (rootsBuilder_ == null) {
        if (!other.roots_.isEmpty()) {
          if (roots_.isEmpty()) {
            roots_ = other.roots_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRootsIsMutable();
            roots_.addAll(other.roots_);
          }
          onChanged();
        }
      } else {
        if (!other.roots_.isEmpty()) {
          if (rootsBuilder_.isEmpty()) {
            rootsBuilder_.dispose();
            rootsBuilder_ = null;
            roots_ = other.roots_;
            bitField0_ = (bitField0_ & ~0x00000004);
            rootsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRootsFieldBuilder() : null;
          } else {
            rootsBuilder_.addAllMessages(other.roots_);
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
              subChainAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              height_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              com.github.iotexproject.grpc.types.MerkleRoot m =
                  input.readMessage(
                      com.github.iotexproject.grpc.types.MerkleRoot.parser(),
                      extensionRegistry);
              if (rootsBuilder_ == null) {
                ensureRootsIsMutable();
                roots_.add(m);
              } else {
                rootsBuilder_.addMessage(m);
              }
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

    private java.lang.Object subChainAddress_ = "";
    /**
     * <code>string subChainAddress = 1;</code>
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
     * <code>string subChainAddress = 1;</code>
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
     * <code>string subChainAddress = 1;</code>
     * @param value The subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subChainAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubChainAddress() {
      subChainAddress_ = getDefaultInstance().getSubChainAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @param value The bytes for subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subChainAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>uint64 height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.github.iotexproject.grpc.types.MerkleRoot> roots_ =
      java.util.Collections.emptyList();
    private void ensureRootsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        roots_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.MerkleRoot>(roots_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.MerkleRoot, com.github.iotexproject.grpc.types.MerkleRoot.Builder, com.github.iotexproject.grpc.types.MerkleRootOrBuilder> rootsBuilder_;

    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.MerkleRoot> getRootsList() {
      if (rootsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roots_);
      } else {
        return rootsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public int getRootsCount() {
      if (rootsBuilder_ == null) {
        return roots_.size();
      } else {
        return rootsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public com.github.iotexproject.grpc.types.MerkleRoot getRoots(int index) {
      if (rootsBuilder_ == null) {
        return roots_.get(index);
      } else {
        return rootsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder setRoots(
        int index, com.github.iotexproject.grpc.types.MerkleRoot value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.set(index, value);
        onChanged();
      } else {
        rootsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder setRoots(
        int index, com.github.iotexproject.grpc.types.MerkleRoot.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.set(index, builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder addRoots(com.github.iotexproject.grpc.types.MerkleRoot value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.add(value);
        onChanged();
      } else {
        rootsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder addRoots(
        int index, com.github.iotexproject.grpc.types.MerkleRoot value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.add(index, value);
        onChanged();
      } else {
        rootsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder addRoots(
        com.github.iotexproject.grpc.types.MerkleRoot.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.add(builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder addRoots(
        int index, com.github.iotexproject.grpc.types.MerkleRoot.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.add(index, builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder addAllRoots(
        java.lang.Iterable<? extends com.github.iotexproject.grpc.types.MerkleRoot> values) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roots_);
        onChanged();
      } else {
        rootsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder clearRoots() {
      if (rootsBuilder_ == null) {
        roots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        rootsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public Builder removeRoots(int index) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.remove(index);
        onChanged();
      } else {
        rootsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public com.github.iotexproject.grpc.types.MerkleRoot.Builder getRootsBuilder(
        int index) {
      return getRootsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public com.github.iotexproject.grpc.types.MerkleRootOrBuilder getRootsOrBuilder(
        int index) {
      if (rootsBuilder_ == null) {
        return roots_.get(index);  } else {
        return rootsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public java.util.List<? extends com.github.iotexproject.grpc.types.MerkleRootOrBuilder> 
         getRootsOrBuilderList() {
      if (rootsBuilder_ != null) {
        return rootsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roots_);
      }
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public com.github.iotexproject.grpc.types.MerkleRoot.Builder addRootsBuilder() {
      return getRootsFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.MerkleRoot.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public com.github.iotexproject.grpc.types.MerkleRoot.Builder addRootsBuilder(
        int index) {
      return getRootsFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.MerkleRoot.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.MerkleRoot roots = 3;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.MerkleRoot.Builder> 
         getRootsBuilderList() {
      return getRootsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.MerkleRoot, com.github.iotexproject.grpc.types.MerkleRoot.Builder, com.github.iotexproject.grpc.types.MerkleRootOrBuilder> 
        getRootsFieldBuilder() {
      if (rootsBuilder_ == null) {
        rootsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.iotexproject.grpc.types.MerkleRoot, com.github.iotexproject.grpc.types.MerkleRoot.Builder, com.github.iotexproject.grpc.types.MerkleRootOrBuilder>(
                roots_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        roots_ = null;
      }
      return rootsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.PutBlock)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.PutBlock)
  private static final com.github.iotexproject.grpc.types.PutBlock DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.PutBlock();
  }

  public static com.github.iotexproject.grpc.types.PutBlock getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutBlock>
      PARSER = new com.google.protobuf.AbstractParser<PutBlock>() {
    @java.lang.Override
    public PutBlock parsePartialFrom(
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

  public static com.google.protobuf.Parser<PutBlock> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutBlock> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.PutBlock getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

