// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface GetBlockMetasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetBlockMetasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 total = 2;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>repeated .iotextypes.BlockMeta blkMetas = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.BlockMeta> 
      getBlkMetasList();
  /**
   * <code>repeated .iotextypes.BlockMeta blkMetas = 1;</code>
   */
  com.github.iotexproject.grpc.types.BlockMeta getBlkMetas(int index);
  /**
   * <code>repeated .iotextypes.BlockMeta blkMetas = 1;</code>
   */
  int getBlkMetasCount();
  /**
   * <code>repeated .iotextypes.BlockMeta blkMetas = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.BlockMetaOrBuilder> 
      getBlkMetasOrBuilderList();
  /**
   * <code>repeated .iotextypes.BlockMeta blkMetas = 1;</code>
   */
  com.github.iotexproject.grpc.types.BlockMetaOrBuilder getBlkMetasOrBuilder(
      int index);
}
