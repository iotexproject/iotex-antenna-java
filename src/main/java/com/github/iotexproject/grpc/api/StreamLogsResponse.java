// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.StreamLogsResponse}
 */
public final class StreamLogsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.StreamLogsResponse)
    StreamLogsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      StreamLogsResponse.class.getName());
  }
  // Use StreamLogsResponse.newBuilder() to construct.
  private StreamLogsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StreamLogsResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_StreamLogsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_StreamLogsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.StreamLogsResponse.class, com.github.iotexproject.grpc.api.StreamLogsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LOG_FIELD_NUMBER = 1;
  private com.github.iotexproject.grpc.types.Log log_;
  /**
   * <code>.iotextypes.Log log = 1;</code>
   * @return Whether the log field is set.
   */
  @java.lang.Override
  public boolean hasLog() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.iotextypes.Log log = 1;</code>
   * @return The log.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Log getLog() {
    return log_ == null ? com.github.iotexproject.grpc.types.Log.getDefaultInstance() : log_;
  }
  /**
   * <code>.iotextypes.Log log = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.LogOrBuilder getLogOrBuilder() {
    return log_ == null ? com.github.iotexproject.grpc.types.Log.getDefaultInstance() : log_;
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
      output.writeMessage(1, getLog());
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
        .computeMessageSize(1, getLog());
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.StreamLogsResponse)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.StreamLogsResponse other = (com.github.iotexproject.grpc.api.StreamLogsResponse) obj;

    if (hasLog() != other.hasLog()) return false;
    if (hasLog()) {
      if (!getLog()
          .equals(other.getLog())) return false;
    }
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
    if (hasLog()) {
      hash = (37 * hash) + LOG_FIELD_NUMBER;
      hash = (53 * hash) + getLog().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.StreamLogsResponse parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.StreamLogsResponse prototype) {
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
   * Protobuf type {@code iotexapi.StreamLogsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.StreamLogsResponse)
      com.github.iotexproject.grpc.api.StreamLogsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_StreamLogsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_StreamLogsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.StreamLogsResponse.class, com.github.iotexproject.grpc.api.StreamLogsResponse.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.StreamLogsResponse.newBuilder()
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
        getLogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      log_ = null;
      if (logBuilder_ != null) {
        logBuilder_.dispose();
        logBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_StreamLogsResponse_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.StreamLogsResponse getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.StreamLogsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.StreamLogsResponse build() {
      com.github.iotexproject.grpc.api.StreamLogsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.StreamLogsResponse buildPartial() {
      com.github.iotexproject.grpc.api.StreamLogsResponse result = new com.github.iotexproject.grpc.api.StreamLogsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.StreamLogsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.log_ = logBuilder_ == null
            ? log_
            : logBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.StreamLogsResponse) {
        return mergeFrom((com.github.iotexproject.grpc.api.StreamLogsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.StreamLogsResponse other) {
      if (other == com.github.iotexproject.grpc.api.StreamLogsResponse.getDefaultInstance()) return this;
      if (other.hasLog()) {
        mergeLog(other.getLog());
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
                  getLogFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.github.iotexproject.grpc.types.Log log_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Log, com.github.iotexproject.grpc.types.Log.Builder, com.github.iotexproject.grpc.types.LogOrBuilder> logBuilder_;
    /**
     * <code>.iotextypes.Log log = 1;</code>
     * @return Whether the log field is set.
     */
    public boolean hasLog() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     * @return The log.
     */
    public com.github.iotexproject.grpc.types.Log getLog() {
      if (logBuilder_ == null) {
        return log_ == null ? com.github.iotexproject.grpc.types.Log.getDefaultInstance() : log_;
      } else {
        return logBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public Builder setLog(com.github.iotexproject.grpc.types.Log value) {
      if (logBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        log_ = value;
      } else {
        logBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public Builder setLog(
        com.github.iotexproject.grpc.types.Log.Builder builderForValue) {
      if (logBuilder_ == null) {
        log_ = builderForValue.build();
      } else {
        logBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public Builder mergeLog(com.github.iotexproject.grpc.types.Log value) {
      if (logBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          log_ != null &&
          log_ != com.github.iotexproject.grpc.types.Log.getDefaultInstance()) {
          getLogBuilder().mergeFrom(value);
        } else {
          log_ = value;
        }
      } else {
        logBuilder_.mergeFrom(value);
      }
      if (log_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public Builder clearLog() {
      bitField0_ = (bitField0_ & ~0x00000001);
      log_ = null;
      if (logBuilder_ != null) {
        logBuilder_.dispose();
        logBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Log.Builder getLogBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLogFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    public com.github.iotexproject.grpc.types.LogOrBuilder getLogOrBuilder() {
      if (logBuilder_ != null) {
        return logBuilder_.getMessageOrBuilder();
      } else {
        return log_ == null ?
            com.github.iotexproject.grpc.types.Log.getDefaultInstance() : log_;
      }
    }
    /**
     * <code>.iotextypes.Log log = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Log, com.github.iotexproject.grpc.types.Log.Builder, com.github.iotexproject.grpc.types.LogOrBuilder> 
        getLogFieldBuilder() {
      if (logBuilder_ == null) {
        logBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.iotexproject.grpc.types.Log, com.github.iotexproject.grpc.types.Log.Builder, com.github.iotexproject.grpc.types.LogOrBuilder>(
                getLog(),
                getParentForChildren(),
                isClean());
        log_ = null;
      }
      return logBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.StreamLogsResponse)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.StreamLogsResponse)
  private static final com.github.iotexproject.grpc.api.StreamLogsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.StreamLogsResponse();
  }

  public static com.github.iotexproject.grpc.api.StreamLogsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamLogsResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamLogsResponse>() {
    @java.lang.Override
    public StreamLogsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamLogsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamLogsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.StreamLogsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

