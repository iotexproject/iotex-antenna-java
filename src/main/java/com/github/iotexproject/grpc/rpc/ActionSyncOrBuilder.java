// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/rpc/rpc.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.rpc;

public interface ActionSyncOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexrpc.ActionSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes hashes = 1;</code>
   * @return A list containing the hashes.
   */
  java.util.List<com.google.protobuf.ByteString> getHashesList();
  /**
   * <code>repeated bytes hashes = 1;</code>
   * @return The count of hashes.
   */
  int getHashesCount();
  /**
   * <code>repeated bytes hashes = 1;</code>
   * @param index The index of the element to return.
   * @return The hashes at the given index.
   */
  com.google.protobuf.ByteString getHashes(int index);
}
