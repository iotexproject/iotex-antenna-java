// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface CandidateTransferOwnershipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.CandidateTransferOwnership)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string newOwnerAddress = 1;</code>
   * @return The newOwnerAddress.
   */
  java.lang.String getNewOwnerAddress();
  /**
   * <code>string newOwnerAddress = 1;</code>
   * @return The bytes for newOwnerAddress.
   */
  com.google.protobuf.ByteString
      getNewOwnerAddressBytes();

  /**
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
