// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface ExecutionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.Execution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string amount = 1;</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 1;</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string contract = 2;</code>
   * @return The contract.
   */
  java.lang.String getContract();
  /**
   * <code>string contract = 2;</code>
   * @return The bytes for contract.
   */
  com.google.protobuf.ByteString
      getContractBytes();

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>repeated .iotextypes.AccessTuple accessList = 4;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.AccessTuple> 
      getAccessListList();
  /**
   * <code>repeated .iotextypes.AccessTuple accessList = 4;</code>
   */
  com.github.iotexproject.grpc.types.AccessTuple getAccessList(int index);
  /**
   * <code>repeated .iotextypes.AccessTuple accessList = 4;</code>
   */
  int getAccessListCount();
  /**
   * <code>repeated .iotextypes.AccessTuple accessList = 4;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.AccessTupleOrBuilder> 
      getAccessListOrBuilderList();
  /**
   * <code>repeated .iotextypes.AccessTuple accessList = 4;</code>
   */
  com.github.iotexproject.grpc.types.AccessTupleOrBuilder getAccessListOrBuilder(
      int index);
}