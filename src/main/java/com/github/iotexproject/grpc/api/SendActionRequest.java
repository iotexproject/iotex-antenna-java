// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.SendActionRequest}
 */
public final class SendActionRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.SendActionRequest)
    SendActionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      SendActionRequest.class.getName());
  }
  // Use SendActionRequest.newBuilder() to construct.
  private SendActionRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SendActionRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_SendActionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_SendActionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.SendActionRequest.class, com.github.iotexproject.grpc.api.SendActionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACTION_FIELD_NUMBER = 1;
  private com.github.iotexproject.grpc.types.Action action_;
  /**
   * <code>.iotextypes.Action action = 1;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.iotextypes.Action action = 1;</code>
   * @return The action.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Action getAction() {
    return action_ == null ? com.github.iotexproject.grpc.types.Action.getDefaultInstance() : action_;
  }
  /**
   * <code>.iotextypes.Action action = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.ActionOrBuilder getActionOrBuilder() {
    return action_ == null ? com.github.iotexproject.grpc.types.Action.getDefaultInstance() : action_;
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
      output.writeMessage(1, getAction());
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
        .computeMessageSize(1, getAction());
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.SendActionRequest)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.SendActionRequest other = (com.github.iotexproject.grpc.api.SendActionRequest) obj;

    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
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
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.SendActionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.SendActionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.SendActionRequest parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.SendActionRequest prototype) {
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
   * Protobuf type {@code iotexapi.SendActionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.SendActionRequest)
      com.github.iotexproject.grpc.api.SendActionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_SendActionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_SendActionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.SendActionRequest.class, com.github.iotexproject.grpc.api.SendActionRequest.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.SendActionRequest.newBuilder()
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
        getActionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      action_ = null;
      if (actionBuilder_ != null) {
        actionBuilder_.dispose();
        actionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_SendActionRequest_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.SendActionRequest getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.SendActionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.SendActionRequest build() {
      com.github.iotexproject.grpc.api.SendActionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.SendActionRequest buildPartial() {
      com.github.iotexproject.grpc.api.SendActionRequest result = new com.github.iotexproject.grpc.api.SendActionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.SendActionRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = actionBuilder_ == null
            ? action_
            : actionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.SendActionRequest) {
        return mergeFrom((com.github.iotexproject.grpc.api.SendActionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.SendActionRequest other) {
      if (other == com.github.iotexproject.grpc.api.SendActionRequest.getDefaultInstance()) return this;
      if (other.hasAction()) {
        mergeAction(other.getAction());
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
                  getActionFieldBuilder().getBuilder(),
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

    private com.github.iotexproject.grpc.types.Action action_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder> actionBuilder_;
    /**
     * <code>.iotextypes.Action action = 1;</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     * @return The action.
     */
    public com.github.iotexproject.grpc.types.Action getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? com.github.iotexproject.grpc.types.Action.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public Builder setAction(com.github.iotexproject.grpc.types.Action value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
      } else {
        actionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public Builder setAction(
        com.github.iotexproject.grpc.types.Action.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public Builder mergeAction(com.github.iotexproject.grpc.types.Action value) {
      if (actionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          action_ != null &&
          action_ != com.github.iotexproject.grpc.types.Action.getDefaultInstance()) {
          getActionBuilder().mergeFrom(value);
        } else {
          action_ = value;
        }
      } else {
        actionBuilder_.mergeFrom(value);
      }
      if (action_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = null;
      if (actionBuilder_ != null) {
        actionBuilder_.dispose();
        actionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Action.Builder getActionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    public com.github.iotexproject.grpc.types.ActionOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            com.github.iotexproject.grpc.types.Action.getDefaultInstance() : action_;
      }
    }
    /**
     * <code>.iotextypes.Action action = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.SendActionRequest)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.SendActionRequest)
  private static final com.github.iotexproject.grpc.api.SendActionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.SendActionRequest();
  }

  public static com.github.iotexproject.grpc.api.SendActionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendActionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendActionRequest>() {
    @java.lang.Override
    public SendActionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SendActionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendActionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.SendActionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

