// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface EpochDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.EpochData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 num = 1;</code>
   * @return The num.
   */
  long getNum();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>uint64 gravityChainStartHeight = 3;</code>
   * @return The gravityChainStartHeight.
   */
  long getGravityChainStartHeight();
}