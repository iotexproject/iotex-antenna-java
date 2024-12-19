// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/election.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface ElectionBucketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ElectionBucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes voter = 1;</code>
   * @return The voter.
   */
  com.google.protobuf.ByteString getVoter();

  /**
   * <code>bytes candidate = 2;</code>
   * @return The candidate.
   */
  com.google.protobuf.ByteString getCandidate();

  /**
   * <code>bytes amount = 3;</code>
   * @return The amount.
   */
  com.google.protobuf.ByteString getAmount();

  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   * <code>bool decay = 6;</code>
   * @return The decay.
   */
  boolean getDecay();
}