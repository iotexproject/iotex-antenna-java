// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/state_data.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface ProbationCandidateListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ProbationCandidateList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .iotextypes.ProbationCandidateList.Info probationList = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.ProbationCandidateList.Info> 
      getProbationListList();
  /**
   * <code>repeated .iotextypes.ProbationCandidateList.Info probationList = 1;</code>
   */
  com.github.iotexproject.grpc.types.ProbationCandidateList.Info getProbationList(int index);
  /**
   * <code>repeated .iotextypes.ProbationCandidateList.Info probationList = 1;</code>
   */
  int getProbationListCount();
  /**
   * <code>repeated .iotextypes.ProbationCandidateList.Info probationList = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.ProbationCandidateList.InfoOrBuilder> 
      getProbationListOrBuilderList();
  /**
   * <code>repeated .iotextypes.ProbationCandidateList.Info probationList = 1;</code>
   */
  com.github.iotexproject.grpc.types.ProbationCandidateList.InfoOrBuilder getProbationListOrBuilder(
      int index);

  /**
   * <code>uint32 intensityRate = 2;</code>
   * @return The intensityRate.
   */
  int getIntensityRate();
}
