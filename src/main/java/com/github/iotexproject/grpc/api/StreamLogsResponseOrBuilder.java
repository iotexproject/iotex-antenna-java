// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface StreamLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.StreamLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.Log log = 1;</code>
   * @return Whether the log field is set.
   */
  boolean hasLog();
  /**
   * <code>.iotextypes.Log log = 1;</code>
   * @return The log.
   */
  com.github.iotexproject.grpc.types.Log getLog();
  /**
   * <code>.iotextypes.Log log = 1;</code>
   */
  com.github.iotexproject.grpc.types.LogOrBuilder getLogOrBuilder();
}
