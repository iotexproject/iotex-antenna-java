// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface StakeChangeCandidateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.StakeChangeCandidate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 bucketIndex = 1;</code>
   * @return The bucketIndex.
   */
  long getBucketIndex();

  /**
   * <code>string candidateName = 2;</code>
   * @return The candidateName.
   */
  java.lang.String getCandidateName();
  /**
   * <code>string candidateName = 2;</code>
   * @return The bytes for candidateName.
   */
  com.google.protobuf.ByteString
      getCandidateNameBytes();

  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
