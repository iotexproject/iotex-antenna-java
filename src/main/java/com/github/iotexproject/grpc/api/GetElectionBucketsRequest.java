// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * <pre>
 *
 * election APIs
 * </pre>
 *
 * Protobuf type {@code iotexapi.GetElectionBucketsRequest}
 */
public final class GetElectionBucketsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.GetElectionBucketsRequest)
    GetElectionBucketsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GetElectionBucketsRequest.class.getName());
  }
  // Use GetElectionBucketsRequest.newBuilder() to construct.
  private GetElectionBucketsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetElectionBucketsRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetElectionBucketsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetElectionBucketsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.GetElectionBucketsRequest.class, com.github.iotexproject.grpc.api.GetElectionBucketsRequest.Builder.class);
  }

  public static final int EPOCHNUM_FIELD_NUMBER = 1;
  private long epochNum_ = 0L;
  /**
   * <code>uint64 epochNum = 1;</code>
   * @return The epochNum.
   */
  @java.lang.Override
  public long getEpochNum() {
    return epochNum_;
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
    if (epochNum_ != 0L) {
      output.writeUInt64(1, epochNum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epochNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, epochNum_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.GetElectionBucketsRequest)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.GetElectionBucketsRequest other = (com.github.iotexproject.grpc.api.GetElectionBucketsRequest) obj;

    if (getEpochNum()
        != other.getEpochNum()) return false;
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
    hash = (37 * hash) + EPOCHNUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEpochNum());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.GetElectionBucketsRequest prototype) {
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
   * <pre>
   *
   * election APIs
   * </pre>
   *
   * Protobuf type {@code iotexapi.GetElectionBucketsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.GetElectionBucketsRequest)
      com.github.iotexproject.grpc.api.GetElectionBucketsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetElectionBucketsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetElectionBucketsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.GetElectionBucketsRequest.class, com.github.iotexproject.grpc.api.GetElectionBucketsRequest.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.GetElectionBucketsRequest.newBuilder()
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
      epochNum_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetElectionBucketsRequest_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetElectionBucketsRequest getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.GetElectionBucketsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetElectionBucketsRequest build() {
      com.github.iotexproject.grpc.api.GetElectionBucketsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetElectionBucketsRequest buildPartial() {
      com.github.iotexproject.grpc.api.GetElectionBucketsRequest result = new com.github.iotexproject.grpc.api.GetElectionBucketsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.GetElectionBucketsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.epochNum_ = epochNum_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.GetElectionBucketsRequest) {
        return mergeFrom((com.github.iotexproject.grpc.api.GetElectionBucketsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.GetElectionBucketsRequest other) {
      if (other == com.github.iotexproject.grpc.api.GetElectionBucketsRequest.getDefaultInstance()) return this;
      if (other.getEpochNum() != 0L) {
        setEpochNum(other.getEpochNum());
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
              epochNum_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long epochNum_ ;
    /**
     * <code>uint64 epochNum = 1;</code>
     * @return The epochNum.
     */
    @java.lang.Override
    public long getEpochNum() {
      return epochNum_;
    }
    /**
     * <code>uint64 epochNum = 1;</code>
     * @param value The epochNum to set.
     * @return This builder for chaining.
     */
    public Builder setEpochNum(long value) {

      epochNum_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 epochNum = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpochNum() {
      bitField0_ = (bitField0_ & ~0x00000001);
      epochNum_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.GetElectionBucketsRequest)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.GetElectionBucketsRequest)
  private static final com.github.iotexproject.grpc.api.GetElectionBucketsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.GetElectionBucketsRequest();
  }

  public static com.github.iotexproject.grpc.api.GetElectionBucketsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetElectionBucketsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetElectionBucketsRequest>() {
    @java.lang.Override
    public GetElectionBucketsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetElectionBucketsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetElectionBucketsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.GetElectionBucketsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

