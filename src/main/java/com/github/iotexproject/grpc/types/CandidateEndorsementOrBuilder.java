// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface CandidateEndorsementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.CandidateEndorsement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 bucketIndex = 1;</code>
   * @return The bucketIndex.
   */
  long getBucketIndex();

  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>bool endorse = 2;</code>
   * @return The endorse.
   */
  boolean getEndorse();

  /**
   * <code>uint32 op = 3;</code>
   * @return The op.
   */
  int getOp();
}
