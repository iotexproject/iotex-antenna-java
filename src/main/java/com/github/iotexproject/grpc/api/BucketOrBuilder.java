// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface BucketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.Bucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * hex string
   * </pre>
   *
   * <code>string voter = 1;</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <pre>
   * hex string
   * </pre>
   *
   * <code>string voter = 1;</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();

  /**
   * <code>string votes = 2;</code>
   * @return The votes.
   */
  java.lang.String getVotes();
  /**
   * <code>string votes = 2;</code>
   * @return The bytes for votes.
   */
  com.google.protobuf.ByteString
      getVotesBytes();

  /**
   * <code>string weightedVotes = 3;</code>
   * @return The weightedVotes.
   */
  java.lang.String getWeightedVotes();
  /**
   * <code>string weightedVotes = 3;</code>
   * @return The bytes for weightedVotes.
   */
  com.google.protobuf.ByteString
      getWeightedVotesBytes();

  /**
   * <pre>
   * human readable duration
   * </pre>
   *
   * <code>string remainingDuration = 4;</code>
   * @return The remainingDuration.
   */
  java.lang.String getRemainingDuration();
  /**
   * <pre>
   * human readable duration
   * </pre>
   *
   * <code>string remainingDuration = 4;</code>
   * @return The bytes for remainingDuration.
   */
  com.google.protobuf.ByteString
      getRemainingDurationBytes();
}
