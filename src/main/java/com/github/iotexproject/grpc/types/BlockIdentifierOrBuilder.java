// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface BlockIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.BlockIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hash = 1;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 1;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
