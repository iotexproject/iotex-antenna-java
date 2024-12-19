package com.github.iotexproject.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: proto/api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class APIServiceGrpc {

  private APIServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "iotexapi.APIService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetAccountRequest,
      com.github.iotexproject.grpc.api.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = com.github.iotexproject.grpc.api.GetAccountRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetAccountRequest,
      com.github.iotexproject.grpc.api.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetAccountRequest, com.github.iotexproject.grpc.api.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = APIServiceGrpc.getGetAccountMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetAccountMethod = APIServiceGrpc.getGetAccountMethod) == null) {
          APIServiceGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetAccountRequest, com.github.iotexproject.grpc.api.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActionsRequest,
      com.github.iotexproject.grpc.api.GetActionsResponse> getGetActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActions",
      requestType = com.github.iotexproject.grpc.api.GetActionsRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActionsRequest,
      com.github.iotexproject.grpc.api.GetActionsResponse> getGetActionsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActionsRequest, com.github.iotexproject.grpc.api.GetActionsResponse> getGetActionsMethod;
    if ((getGetActionsMethod = APIServiceGrpc.getGetActionsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetActionsMethod = APIServiceGrpc.getGetActionsMethod) == null) {
          APIServiceGrpc.getGetActionsMethod = getGetActionsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetActionsRequest, com.github.iotexproject.grpc.api.GetActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetActions"))
              .build();
        }
      }
    }
    return getGetActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetBlockMetasRequest,
      com.github.iotexproject.grpc.api.GetBlockMetasResponse> getGetBlockMetasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockMetas",
      requestType = com.github.iotexproject.grpc.api.GetBlockMetasRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetBlockMetasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetBlockMetasRequest,
      com.github.iotexproject.grpc.api.GetBlockMetasResponse> getGetBlockMetasMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetBlockMetasRequest, com.github.iotexproject.grpc.api.GetBlockMetasResponse> getGetBlockMetasMethod;
    if ((getGetBlockMetasMethod = APIServiceGrpc.getGetBlockMetasMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetBlockMetasMethod = APIServiceGrpc.getGetBlockMetasMethod) == null) {
          APIServiceGrpc.getGetBlockMetasMethod = getGetBlockMetasMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetBlockMetasRequest, com.github.iotexproject.grpc.api.GetBlockMetasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockMetas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetBlockMetasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetBlockMetasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetBlockMetas"))
              .build();
        }
      }
    }
    return getGetBlockMetasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetChainMetaRequest,
      com.github.iotexproject.grpc.api.GetChainMetaResponse> getGetChainMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainMeta",
      requestType = com.github.iotexproject.grpc.api.GetChainMetaRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetChainMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetChainMetaRequest,
      com.github.iotexproject.grpc.api.GetChainMetaResponse> getGetChainMetaMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetChainMetaRequest, com.github.iotexproject.grpc.api.GetChainMetaResponse> getGetChainMetaMethod;
    if ((getGetChainMetaMethod = APIServiceGrpc.getGetChainMetaMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetChainMetaMethod = APIServiceGrpc.getGetChainMetaMethod) == null) {
          APIServiceGrpc.getGetChainMetaMethod = getGetChainMetaMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetChainMetaRequest, com.github.iotexproject.grpc.api.GetChainMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetChainMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetChainMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetChainMeta"))
              .build();
        }
      }
    }
    return getGetChainMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetServerMetaRequest,
      com.github.iotexproject.grpc.api.GetServerMetaResponse> getGetServerMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServerMeta",
      requestType = com.github.iotexproject.grpc.api.GetServerMetaRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetServerMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetServerMetaRequest,
      com.github.iotexproject.grpc.api.GetServerMetaResponse> getGetServerMetaMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetServerMetaRequest, com.github.iotexproject.grpc.api.GetServerMetaResponse> getGetServerMetaMethod;
    if ((getGetServerMetaMethod = APIServiceGrpc.getGetServerMetaMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetServerMetaMethod = APIServiceGrpc.getGetServerMetaMethod) == null) {
          APIServiceGrpc.getGetServerMetaMethod = getGetServerMetaMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetServerMetaRequest, com.github.iotexproject.grpc.api.GetServerMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServerMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetServerMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetServerMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetServerMeta"))
              .build();
        }
      }
    }
    return getGetServerMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SendActionRequest,
      com.github.iotexproject.grpc.api.SendActionResponse> getSendActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAction",
      requestType = com.github.iotexproject.grpc.api.SendActionRequest.class,
      responseType = com.github.iotexproject.grpc.api.SendActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SendActionRequest,
      com.github.iotexproject.grpc.api.SendActionResponse> getSendActionMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SendActionRequest, com.github.iotexproject.grpc.api.SendActionResponse> getSendActionMethod;
    if ((getSendActionMethod = APIServiceGrpc.getSendActionMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getSendActionMethod = APIServiceGrpc.getSendActionMethod) == null) {
          APIServiceGrpc.getSendActionMethod = getSendActionMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.SendActionRequest, com.github.iotexproject.grpc.api.SendActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.SendActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.SendActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("SendAction"))
              .build();
        }
      }
    }
    return getSendActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetReceiptByActionRequest,
      com.github.iotexproject.grpc.api.GetReceiptByActionResponse> getGetReceiptByActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReceiptByAction",
      requestType = com.github.iotexproject.grpc.api.GetReceiptByActionRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetReceiptByActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetReceiptByActionRequest,
      com.github.iotexproject.grpc.api.GetReceiptByActionResponse> getGetReceiptByActionMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetReceiptByActionRequest, com.github.iotexproject.grpc.api.GetReceiptByActionResponse> getGetReceiptByActionMethod;
    if ((getGetReceiptByActionMethod = APIServiceGrpc.getGetReceiptByActionMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetReceiptByActionMethod = APIServiceGrpc.getGetReceiptByActionMethod) == null) {
          APIServiceGrpc.getGetReceiptByActionMethod = getGetReceiptByActionMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetReceiptByActionRequest, com.github.iotexproject.grpc.api.GetReceiptByActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReceiptByAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetReceiptByActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetReceiptByActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetReceiptByAction"))
              .build();
        }
      }
    }
    return getGetReceiptByActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractRequest,
      com.github.iotexproject.grpc.api.ReadContractResponse> getReadContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadContract",
      requestType = com.github.iotexproject.grpc.api.ReadContractRequest.class,
      responseType = com.github.iotexproject.grpc.api.ReadContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractRequest,
      com.github.iotexproject.grpc.api.ReadContractResponse> getReadContractMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractRequest, com.github.iotexproject.grpc.api.ReadContractResponse> getReadContractMethod;
    if ((getReadContractMethod = APIServiceGrpc.getReadContractMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getReadContractMethod = APIServiceGrpc.getReadContractMethod) == null) {
          APIServiceGrpc.getReadContractMethod = getReadContractMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.ReadContractRequest, com.github.iotexproject.grpc.api.ReadContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("ReadContract"))
              .build();
        }
      }
    }
    return getReadContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SuggestGasPriceRequest,
      com.github.iotexproject.grpc.api.SuggestGasPriceResponse> getSuggestGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestGasPrice",
      requestType = com.github.iotexproject.grpc.api.SuggestGasPriceRequest.class,
      responseType = com.github.iotexproject.grpc.api.SuggestGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SuggestGasPriceRequest,
      com.github.iotexproject.grpc.api.SuggestGasPriceResponse> getSuggestGasPriceMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.SuggestGasPriceRequest, com.github.iotexproject.grpc.api.SuggestGasPriceResponse> getSuggestGasPriceMethod;
    if ((getSuggestGasPriceMethod = APIServiceGrpc.getSuggestGasPriceMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getSuggestGasPriceMethod = APIServiceGrpc.getSuggestGasPriceMethod) == null) {
          APIServiceGrpc.getSuggestGasPriceMethod = getSuggestGasPriceMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.SuggestGasPriceRequest, com.github.iotexproject.grpc.api.SuggestGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.SuggestGasPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.SuggestGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("SuggestGasPrice"))
              .build();
        }
      }
    }
    return getSuggestGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateGasForActionRequest,
      com.github.iotexproject.grpc.api.EstimateGasForActionResponse> getEstimateGasForActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateGasForAction",
      requestType = com.github.iotexproject.grpc.api.EstimateGasForActionRequest.class,
      responseType = com.github.iotexproject.grpc.api.EstimateGasForActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateGasForActionRequest,
      com.github.iotexproject.grpc.api.EstimateGasForActionResponse> getEstimateGasForActionMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateGasForActionRequest, com.github.iotexproject.grpc.api.EstimateGasForActionResponse> getEstimateGasForActionMethod;
    if ((getEstimateGasForActionMethod = APIServiceGrpc.getEstimateGasForActionMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getEstimateGasForActionMethod = APIServiceGrpc.getEstimateGasForActionMethod) == null) {
          APIServiceGrpc.getEstimateGasForActionMethod = getEstimateGasForActionMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.EstimateGasForActionRequest, com.github.iotexproject.grpc.api.EstimateGasForActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateGasForAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.EstimateGasForActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.EstimateGasForActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("EstimateGasForAction"))
              .build();
        }
      }
    }
    return getEstimateGasForActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest,
      com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> getEstimateActionGasConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateActionGasConsumption",
      requestType = com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest.class,
      responseType = com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest,
      com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> getEstimateActionGasConsumptionMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest, com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> getEstimateActionGasConsumptionMethod;
    if ((getEstimateActionGasConsumptionMethod = APIServiceGrpc.getEstimateActionGasConsumptionMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getEstimateActionGasConsumptionMethod = APIServiceGrpc.getEstimateActionGasConsumptionMethod) == null) {
          APIServiceGrpc.getEstimateActionGasConsumptionMethod = getEstimateActionGasConsumptionMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest, com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateActionGasConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("EstimateActionGasConsumption"))
              .build();
        }
      }
    }
    return getEstimateActionGasConsumptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadStateRequest,
      com.github.iotexproject.grpc.api.ReadStateResponse> getReadStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadState",
      requestType = com.github.iotexproject.grpc.api.ReadStateRequest.class,
      responseType = com.github.iotexproject.grpc.api.ReadStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadStateRequest,
      com.github.iotexproject.grpc.api.ReadStateResponse> getReadStateMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadStateRequest, com.github.iotexproject.grpc.api.ReadStateResponse> getReadStateMethod;
    if ((getReadStateMethod = APIServiceGrpc.getReadStateMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getReadStateMethod = APIServiceGrpc.getReadStateMethod) == null) {
          APIServiceGrpc.getReadStateMethod = getReadStateMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.ReadStateRequest, com.github.iotexproject.grpc.api.ReadStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("ReadState"))
              .build();
        }
      }
    }
    return getReadStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEpochMetaRequest,
      com.github.iotexproject.grpc.api.GetEpochMetaResponse> getGetEpochMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEpochMeta",
      requestType = com.github.iotexproject.grpc.api.GetEpochMetaRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetEpochMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEpochMetaRequest,
      com.github.iotexproject.grpc.api.GetEpochMetaResponse> getGetEpochMetaMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEpochMetaRequest, com.github.iotexproject.grpc.api.GetEpochMetaResponse> getGetEpochMetaMethod;
    if ((getGetEpochMetaMethod = APIServiceGrpc.getGetEpochMetaMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetEpochMetaMethod = APIServiceGrpc.getGetEpochMetaMethod) == null) {
          APIServiceGrpc.getGetEpochMetaMethod = getGetEpochMetaMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetEpochMetaRequest, com.github.iotexproject.grpc.api.GetEpochMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEpochMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEpochMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEpochMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetEpochMeta"))
              .build();
        }
      }
    }
    return getGetEpochMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetRawBlocksRequest,
      com.github.iotexproject.grpc.api.GetRawBlocksResponse> getGetRawBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRawBlocks",
      requestType = com.github.iotexproject.grpc.api.GetRawBlocksRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetRawBlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetRawBlocksRequest,
      com.github.iotexproject.grpc.api.GetRawBlocksResponse> getGetRawBlocksMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetRawBlocksRequest, com.github.iotexproject.grpc.api.GetRawBlocksResponse> getGetRawBlocksMethod;
    if ((getGetRawBlocksMethod = APIServiceGrpc.getGetRawBlocksMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetRawBlocksMethod = APIServiceGrpc.getGetRawBlocksMethod) == null) {
          APIServiceGrpc.getGetRawBlocksMethod = getGetRawBlocksMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetRawBlocksRequest, com.github.iotexproject.grpc.api.GetRawBlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRawBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetRawBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetRawBlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetRawBlocks"))
              .build();
        }
      }
    }
    return getGetRawBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetLogsRequest,
      com.github.iotexproject.grpc.api.GetLogsResponse> getGetLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogs",
      requestType = com.github.iotexproject.grpc.api.GetLogsRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetLogsRequest,
      com.github.iotexproject.grpc.api.GetLogsResponse> getGetLogsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetLogsRequest, com.github.iotexproject.grpc.api.GetLogsResponse> getGetLogsMethod;
    if ((getGetLogsMethod = APIServiceGrpc.getGetLogsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetLogsMethod = APIServiceGrpc.getGetLogsMethod) == null) {
          APIServiceGrpc.getGetLogsMethod = getGetLogsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetLogsRequest, com.github.iotexproject.grpc.api.GetLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetLogs"))
              .build();
        }
      }
    }
    return getGetLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionLogByActionHash",
      requestType = com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod;
    if ((getGetTransactionLogByActionHashMethod = APIServiceGrpc.getGetTransactionLogByActionHashMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetTransactionLogByActionHashMethod = APIServiceGrpc.getGetTransactionLogByActionHashMethod) == null) {
          APIServiceGrpc.getGetTransactionLogByActionHashMethod = getGetTransactionLogByActionHashMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionLogByActionHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetTransactionLogByActionHash"))
              .build();
        }
      }
    }
    return getGetTransactionLogByActionHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionLogByBlockHeight",
      requestType = com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest, com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod;
    if ((getGetTransactionLogByBlockHeightMethod = APIServiceGrpc.getGetTransactionLogByBlockHeightMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetTransactionLogByBlockHeightMethod = APIServiceGrpc.getGetTransactionLogByBlockHeightMethod) == null) {
          APIServiceGrpc.getGetTransactionLogByBlockHeightMethod = getGetTransactionLogByBlockHeightMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest, com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionLogByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetTransactionLogByBlockHeight"))
              .build();
        }
      }
    }
    return getGetTransactionLogByBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamBlocksRequest,
      com.github.iotexproject.grpc.api.StreamBlocksResponse> getStreamBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamBlocks",
      requestType = com.github.iotexproject.grpc.api.StreamBlocksRequest.class,
      responseType = com.github.iotexproject.grpc.api.StreamBlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamBlocksRequest,
      com.github.iotexproject.grpc.api.StreamBlocksResponse> getStreamBlocksMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamBlocksRequest, com.github.iotexproject.grpc.api.StreamBlocksResponse> getStreamBlocksMethod;
    if ((getStreamBlocksMethod = APIServiceGrpc.getStreamBlocksMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getStreamBlocksMethod = APIServiceGrpc.getStreamBlocksMethod) == null) {
          APIServiceGrpc.getStreamBlocksMethod = getStreamBlocksMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.StreamBlocksRequest, com.github.iotexproject.grpc.api.StreamBlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.StreamBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.StreamBlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("StreamBlocks"))
              .build();
        }
      }
    }
    return getStreamBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamLogsRequest,
      com.github.iotexproject.grpc.api.StreamLogsResponse> getStreamLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLogs",
      requestType = com.github.iotexproject.grpc.api.StreamLogsRequest.class,
      responseType = com.github.iotexproject.grpc.api.StreamLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamLogsRequest,
      com.github.iotexproject.grpc.api.StreamLogsResponse> getStreamLogsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.StreamLogsRequest, com.github.iotexproject.grpc.api.StreamLogsResponse> getStreamLogsMethod;
    if ((getStreamLogsMethod = APIServiceGrpc.getStreamLogsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getStreamLogsMethod = APIServiceGrpc.getStreamLogsMethod) == null) {
          APIServiceGrpc.getStreamLogsMethod = getStreamLogsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.StreamLogsRequest, com.github.iotexproject.grpc.api.StreamLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.StreamLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.StreamLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("StreamLogs"))
              .build();
        }
      }
    }
    return getStreamLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActPoolActionsRequest,
      com.github.iotexproject.grpc.api.GetActPoolActionsResponse> getGetActPoolActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActPoolActions",
      requestType = com.github.iotexproject.grpc.api.GetActPoolActionsRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetActPoolActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActPoolActionsRequest,
      com.github.iotexproject.grpc.api.GetActPoolActionsResponse> getGetActPoolActionsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetActPoolActionsRequest, com.github.iotexproject.grpc.api.GetActPoolActionsResponse> getGetActPoolActionsMethod;
    if ((getGetActPoolActionsMethod = APIServiceGrpc.getGetActPoolActionsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetActPoolActionsMethod = APIServiceGrpc.getGetActPoolActionsMethod) == null) {
          APIServiceGrpc.getGetActPoolActionsMethod = getGetActPoolActionsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetActPoolActionsRequest, com.github.iotexproject.grpc.api.GetActPoolActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActPoolActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetActPoolActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetActPoolActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetActPoolActions"))
              .build();
        }
      }
    }
    return getGetActPoolActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest,
      com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> getGetEvmTransfersByActionHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvmTransfersByActionHash",
      requestType = com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest,
      com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> getGetEvmTransfersByActionHashMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest, com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> getGetEvmTransfersByActionHashMethod;
    if ((getGetEvmTransfersByActionHashMethod = APIServiceGrpc.getGetEvmTransfersByActionHashMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetEvmTransfersByActionHashMethod = APIServiceGrpc.getGetEvmTransfersByActionHashMethod) == null) {
          APIServiceGrpc.getGetEvmTransfersByActionHashMethod = getGetEvmTransfersByActionHashMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest, com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvmTransfersByActionHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetEvmTransfersByActionHash"))
              .build();
        }
      }
    }
    return getGetEvmTransfersByActionHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> getGetEvmTransfersByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvmTransfersByBlockHeight",
      requestType = com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> getGetEvmTransfersByBlockHeightMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest, com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> getGetEvmTransfersByBlockHeightMethod;
    if ((getGetEvmTransfersByBlockHeightMethod = APIServiceGrpc.getGetEvmTransfersByBlockHeightMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetEvmTransfersByBlockHeightMethod = APIServiceGrpc.getGetEvmTransfersByBlockHeightMethod) == null) {
          APIServiceGrpc.getGetEvmTransfersByBlockHeightMethod = getGetEvmTransfersByBlockHeightMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest, com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvmTransfersByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetEvmTransfersByBlockHeight"))
              .build();
        }
      }
    }
    return getGetEvmTransfersByBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetElectionBucketsRequest,
      com.github.iotexproject.grpc.api.GetElectionBucketsResponse> getGetElectionBucketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectionBuckets",
      requestType = com.github.iotexproject.grpc.api.GetElectionBucketsRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetElectionBucketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetElectionBucketsRequest,
      com.github.iotexproject.grpc.api.GetElectionBucketsResponse> getGetElectionBucketsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetElectionBucketsRequest, com.github.iotexproject.grpc.api.GetElectionBucketsResponse> getGetElectionBucketsMethod;
    if ((getGetElectionBucketsMethod = APIServiceGrpc.getGetElectionBucketsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getGetElectionBucketsMethod = APIServiceGrpc.getGetElectionBucketsMethod) == null) {
          APIServiceGrpc.getGetElectionBucketsMethod = getGetElectionBucketsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetElectionBucketsRequest, com.github.iotexproject.grpc.api.GetElectionBucketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectionBuckets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetElectionBucketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetElectionBucketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("GetElectionBuckets"))
              .build();
        }
      }
    }
    return getGetElectionBucketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractStorageRequest,
      com.github.iotexproject.grpc.api.ReadContractStorageResponse> getReadContractStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadContractStorage",
      requestType = com.github.iotexproject.grpc.api.ReadContractStorageRequest.class,
      responseType = com.github.iotexproject.grpc.api.ReadContractStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractStorageRequest,
      com.github.iotexproject.grpc.api.ReadContractStorageResponse> getReadContractStorageMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.ReadContractStorageRequest, com.github.iotexproject.grpc.api.ReadContractStorageResponse> getReadContractStorageMethod;
    if ((getReadContractStorageMethod = APIServiceGrpc.getReadContractStorageMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getReadContractStorageMethod = APIServiceGrpc.getReadContractStorageMethod) == null) {
          APIServiceGrpc.getReadContractStorageMethod = getReadContractStorageMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.ReadContractStorageRequest, com.github.iotexproject.grpc.api.ReadContractStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadContractStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadContractStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.ReadContractStorageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("ReadContractStorage"))
              .build();
        }
      }
    }
    return getReadContractStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest,
      com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> getTraceTransactionStructLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraceTransactionStructLogs",
      requestType = com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest.class,
      responseType = com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest,
      com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> getTraceTransactionStructLogsMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest, com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> getTraceTransactionStructLogsMethod;
    if ((getTraceTransactionStructLogsMethod = APIServiceGrpc.getTraceTransactionStructLogsMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getTraceTransactionStructLogsMethod = APIServiceGrpc.getTraceTransactionStructLogsMethod) == null) {
          APIServiceGrpc.getTraceTransactionStructLogsMethod = getTraceTransactionStructLogsMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest, com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraceTransactionStructLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("TraceTransactionStructLogs"))
              .build();
        }
      }
    }
    return getTraceTransactionStructLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static APIServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIServiceStub>() {
        @java.lang.Override
        public APIServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIServiceStub(channel, callOptions);
        }
      };
    return APIServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static APIServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIServiceBlockingStub>() {
        @java.lang.Override
        public APIServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIServiceBlockingStub(channel, callOptions);
        }
      };
    return APIServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static APIServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIServiceFutureStub>() {
        @java.lang.Override
        public APIServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIServiceFutureStub(channel, callOptions);
        }
      };
    return APIServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * get the address detail of an address
     * </pre>
     */
    default void getAccount(com.github.iotexproject.grpc.api.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * get action(s) by:
     * 1. start index and action count
     * 2. action hash
     * 3. address with start index and action count
     * 4. get unconfirmed actions by address with start index and action count
     * 5. block hash with start index and action count
     * </pre>
     */
    default void getActions(com.github.iotexproject.grpc.api.GetActionsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get block metadata(s) by:
     * 1. start index and block count
     * 2. block hash
     * </pre>
     */
    default void getBlockMetas(com.github.iotexproject.grpc.api.GetBlockMetasRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetBlockMetasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockMetasMethod(), responseObserver);
    }

    /**
     * <pre>
     * get chain metadata
     * </pre>
     */
    default void getChainMeta(com.github.iotexproject.grpc.api.GetChainMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetChainMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * get server version
     * </pre>
     */
    default void getServerMeta(com.github.iotexproject.grpc.api.GetServerMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetServerMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServerMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * sendAction
     * </pre>
     */
    default void sendAction(com.github.iotexproject.grpc.api.SendActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SendActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * get receipt by action Hash
     * </pre>
     */
    default void getReceiptByAction(com.github.iotexproject.grpc.api.GetReceiptByActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetReceiptByActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReceiptByActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO: read contract
     * </pre>
     */
    default void readContract(com.github.iotexproject.grpc.api.ReadContractRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * suggest gas price
     * </pre>
     */
    default void suggestGasPrice(com.github.iotexproject.grpc.api.SuggestGasPriceRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SuggestGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestGasPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * estimate gas for action, to be deprecated
     * </pre>
     */
    default void estimateGasForAction(com.github.iotexproject.grpc.api.EstimateGasForActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateGasForActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateGasForActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * estimate gas for action and transfer not sealed
     * </pre>
     */
    default void estimateActionGasConsumption(com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateActionGasConsumptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * read state from blockchain
     * </pre>
     */
    default void readState(com.github.iotexproject.grpc.api.ReadStateRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * get epoch metadata
     * </pre>
     */
    default void getEpochMeta(com.github.iotexproject.grpc.api.GetEpochMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEpochMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEpochMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * get raw blocks data
     * </pre>
     */
    default void getRawBlocks(com.github.iotexproject.grpc.api.GetRawBlocksRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetRawBlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRawBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics
     * </pre>
     */
    default void getLogs(com.github.iotexproject.grpc.api.GetLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLogsMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionLogByActionHashMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionLogByBlockHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * get block info in stream
     * </pre>
     */
    default void streamBlocks(com.github.iotexproject.grpc.api.StreamBlocksRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamBlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics in stream
     * </pre>
     */
    default void streamLogs(com.github.iotexproject.grpc.api.StreamLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get actions from act pool
     * </pre>
     */
    default void getActPoolActions(com.github.iotexproject.grpc.api.GetActPoolActionsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActPoolActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActPoolActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    default void getEvmTransfersByActionHash(com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEvmTransfersByActionHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    default void getEvmTransfersByBlockHeight(com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEvmTransfersByBlockHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    default void getElectionBuckets(com.github.iotexproject.grpc.api.GetElectionBucketsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetElectionBucketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectionBucketsMethod(), responseObserver);
    }

    /**
     */
    default void readContractStorage(com.github.iotexproject.grpc.api.ReadContractStorageRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadContractStorageMethod(), responseObserver);
    }

    /**
     */
    default void traceTransactionStructLogs(com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraceTransactionStructLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service APIService.
   */
  public static abstract class APIServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return APIServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service APIService.
   */
  public static final class APIServiceStub
      extends io.grpc.stub.AbstractAsyncStub<APIServiceStub> {
    private APIServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * get the address detail of an address
     * </pre>
     */
    public void getAccount(com.github.iotexproject.grpc.api.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get action(s) by:
     * 1. start index and action count
     * 2. action hash
     * 3. address with start index and action count
     * 4. get unconfirmed actions by address with start index and action count
     * 5. block hash with start index and action count
     * </pre>
     */
    public void getActions(com.github.iotexproject.grpc.api.GetActionsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get block metadata(s) by:
     * 1. start index and block count
     * 2. block hash
     * </pre>
     */
    public void getBlockMetas(com.github.iotexproject.grpc.api.GetBlockMetasRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetBlockMetasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockMetasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get chain metadata
     * </pre>
     */
    public void getChainMeta(com.github.iotexproject.grpc.api.GetChainMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetChainMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get server version
     * </pre>
     */
    public void getServerMeta(com.github.iotexproject.grpc.api.GetServerMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetServerMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServerMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sendAction
     * </pre>
     */
    public void sendAction(com.github.iotexproject.grpc.api.SendActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SendActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get receipt by action Hash
     * </pre>
     */
    public void getReceiptByAction(com.github.iotexproject.grpc.api.GetReceiptByActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetReceiptByActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReceiptByActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: read contract
     * </pre>
     */
    public void readContract(com.github.iotexproject.grpc.api.ReadContractRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * suggest gas price
     * </pre>
     */
    public void suggestGasPrice(com.github.iotexproject.grpc.api.SuggestGasPriceRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SuggestGasPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * estimate gas for action, to be deprecated
     * </pre>
     */
    public void estimateGasForAction(com.github.iotexproject.grpc.api.EstimateGasForActionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateGasForActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateGasForActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * estimate gas for action and transfer not sealed
     * </pre>
     */
    public void estimateActionGasConsumption(com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateActionGasConsumptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * read state from blockchain
     * </pre>
     */
    public void readState(com.github.iotexproject.grpc.api.ReadStateRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get epoch metadata
     * </pre>
     */
    public void getEpochMeta(com.github.iotexproject.grpc.api.GetEpochMetaRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEpochMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEpochMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get raw blocks data
     * </pre>
     */
    public void getRawBlocks(com.github.iotexproject.grpc.api.GetRawBlocksRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetRawBlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRawBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics
     * </pre>
     */
    public void getLogs(com.github.iotexproject.grpc.api.GetLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionLogByActionHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionLogByBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get block info in stream
     * </pre>
     */
    public void streamBlocks(com.github.iotexproject.grpc.api.StreamBlocksRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamBlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics in stream
     * </pre>
     */
    public void streamLogs(com.github.iotexproject.grpc.api.StreamLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get actions from act pool
     * </pre>
     */
    public void getActPoolActions(com.github.iotexproject.grpc.api.GetActPoolActionsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActPoolActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActPoolActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public void getEvmTransfersByActionHash(com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEvmTransfersByActionHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public void getEvmTransfersByBlockHeight(com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEvmTransfersByBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public void getElectionBuckets(com.github.iotexproject.grpc.api.GetElectionBucketsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetElectionBucketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectionBucketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readContractStorage(com.github.iotexproject.grpc.api.ReadContractStorageRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadContractStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void traceTransactionStructLogs(com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraceTransactionStructLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service APIService.
   */
  public static final class APIServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<APIServiceBlockingStub> {
    private APIServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get the address detail of an address
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetAccountResponse getAccount(com.github.iotexproject.grpc.api.GetAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get action(s) by:
     * 1. start index and action count
     * 2. action hash
     * 3. address with start index and action count
     * 4. get unconfirmed actions by address with start index and action count
     * 5. block hash with start index and action count
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetActionsResponse getActions(com.github.iotexproject.grpc.api.GetActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get block metadata(s) by:
     * 1. start index and block count
     * 2. block hash
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetBlockMetasResponse getBlockMetas(com.github.iotexproject.grpc.api.GetBlockMetasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockMetasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get chain metadata
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetChainMetaResponse getChainMeta(com.github.iotexproject.grpc.api.GetChainMetaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get server version
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetServerMetaResponse getServerMeta(com.github.iotexproject.grpc.api.GetServerMetaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServerMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sendAction
     * </pre>
     */
    public com.github.iotexproject.grpc.api.SendActionResponse sendAction(com.github.iotexproject.grpc.api.SendActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get receipt by action Hash
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetReceiptByActionResponse getReceiptByAction(com.github.iotexproject.grpc.api.GetReceiptByActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReceiptByActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: read contract
     * </pre>
     */
    public com.github.iotexproject.grpc.api.ReadContractResponse readContract(com.github.iotexproject.grpc.api.ReadContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * suggest gas price
     * </pre>
     */
    public com.github.iotexproject.grpc.api.SuggestGasPriceResponse suggestGasPrice(com.github.iotexproject.grpc.api.SuggestGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestGasPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * estimate gas for action, to be deprecated
     * </pre>
     */
    public com.github.iotexproject.grpc.api.EstimateGasForActionResponse estimateGasForAction(com.github.iotexproject.grpc.api.EstimateGasForActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateGasForActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * estimate gas for action and transfer not sealed
     * </pre>
     */
    public com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse estimateActionGasConsumption(com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateActionGasConsumptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * read state from blockchain
     * </pre>
     */
    public com.github.iotexproject.grpc.api.ReadStateResponse readState(com.github.iotexproject.grpc.api.ReadStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get epoch metadata
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetEpochMetaResponse getEpochMeta(com.github.iotexproject.grpc.api.GetEpochMetaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEpochMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get raw blocks data
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetRawBlocksResponse getRawBlocks(com.github.iotexproject.grpc.api.GetRawBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRawBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetLogsResponse getLogs(com.github.iotexproject.grpc.api.GetLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionLogByActionHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionLogByBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get block info in stream
     * </pre>
     */
    public java.util.Iterator<com.github.iotexproject.grpc.api.StreamBlocksResponse> streamBlocks(
        com.github.iotexproject.grpc.api.StreamBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics in stream
     * </pre>
     */
    public java.util.Iterator<com.github.iotexproject.grpc.api.StreamLogsResponse> streamLogs(
        com.github.iotexproject.grpc.api.StreamLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get actions from act pool
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetActPoolActionsResponse getActPoolActions(com.github.iotexproject.grpc.api.GetActPoolActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActPoolActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse getEvmTransfersByActionHash(com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEvmTransfersByActionHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse getEvmTransfersByBlockHeight(com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEvmTransfersByBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.github.iotexproject.grpc.api.GetElectionBucketsResponse getElectionBuckets(com.github.iotexproject.grpc.api.GetElectionBucketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectionBucketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.ReadContractStorageResponse readContractStorage(com.github.iotexproject.grpc.api.ReadContractStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadContractStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse traceTransactionStructLogs(com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraceTransactionStructLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service APIService.
   */
  public static final class APIServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<APIServiceFutureStub> {
    private APIServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get the address detail of an address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetAccountResponse> getAccount(
        com.github.iotexproject.grpc.api.GetAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get action(s) by:
     * 1. start index and action count
     * 2. action hash
     * 3. address with start index and action count
     * 4. get unconfirmed actions by address with start index and action count
     * 5. block hash with start index and action count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetActionsResponse> getActions(
        com.github.iotexproject.grpc.api.GetActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get block metadata(s) by:
     * 1. start index and block count
     * 2. block hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetBlockMetasResponse> getBlockMetas(
        com.github.iotexproject.grpc.api.GetBlockMetasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockMetasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get chain metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetChainMetaResponse> getChainMeta(
        com.github.iotexproject.grpc.api.GetChainMetaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get server version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetServerMetaResponse> getServerMeta(
        com.github.iotexproject.grpc.api.GetServerMetaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServerMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sendAction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.SendActionResponse> sendAction(
        com.github.iotexproject.grpc.api.SendActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get receipt by action Hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetReceiptByActionResponse> getReceiptByAction(
        com.github.iotexproject.grpc.api.GetReceiptByActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReceiptByActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: read contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.ReadContractResponse> readContract(
        com.github.iotexproject.grpc.api.ReadContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * suggest gas price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.SuggestGasPriceResponse> suggestGasPrice(
        com.github.iotexproject.grpc.api.SuggestGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestGasPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * estimate gas for action, to be deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.EstimateGasForActionResponse> estimateGasForAction(
        com.github.iotexproject.grpc.api.EstimateGasForActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateGasForActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * estimate gas for action and transfer not sealed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse> estimateActionGasConsumption(
        com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateActionGasConsumptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * read state from blockchain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.ReadStateResponse> readState(
        com.github.iotexproject.grpc.api.ReadStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get epoch metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetEpochMetaResponse> getEpochMeta(
        com.github.iotexproject.grpc.api.GetEpochMetaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEpochMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get raw blocks data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetRawBlocksResponse> getRawBlocks(
        com.github.iotexproject.grpc.api.GetRawBlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRawBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get logs filtered by contract address and topics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetLogsResponse> getLogs(
        com.github.iotexproject.grpc.api.GetLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getTransactionLogByActionHash(
        com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionLogByActionHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getTransactionLogByBlockHeight(
        com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionLogByBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get actions from act pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetActPoolActionsResponse> getActPoolActions(
        com.github.iotexproject.grpc.api.GetActPoolActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActPoolActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse> getEvmTransfersByActionHash(
        com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEvmTransfersByActionHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse> getEvmTransfersByBlockHeight(
        com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEvmTransfersByBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetElectionBucketsResponse> getElectionBuckets(
        com.github.iotexproject.grpc.api.GetElectionBucketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectionBucketsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.ReadContractStorageResponse> readContractStorage(
        com.github.iotexproject.grpc.api.ReadContractStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadContractStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse> traceTransactionStructLogs(
        com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraceTransactionStructLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACTIONS = 1;
  private static final int METHODID_GET_BLOCK_METAS = 2;
  private static final int METHODID_GET_CHAIN_META = 3;
  private static final int METHODID_GET_SERVER_META = 4;
  private static final int METHODID_SEND_ACTION = 5;
  private static final int METHODID_GET_RECEIPT_BY_ACTION = 6;
  private static final int METHODID_READ_CONTRACT = 7;
  private static final int METHODID_SUGGEST_GAS_PRICE = 8;
  private static final int METHODID_ESTIMATE_GAS_FOR_ACTION = 9;
  private static final int METHODID_ESTIMATE_ACTION_GAS_CONSUMPTION = 10;
  private static final int METHODID_READ_STATE = 11;
  private static final int METHODID_GET_EPOCH_META = 12;
  private static final int METHODID_GET_RAW_BLOCKS = 13;
  private static final int METHODID_GET_LOGS = 14;
  private static final int METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH = 15;
  private static final int METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT = 16;
  private static final int METHODID_STREAM_BLOCKS = 17;
  private static final int METHODID_STREAM_LOGS = 18;
  private static final int METHODID_GET_ACT_POOL_ACTIONS = 19;
  private static final int METHODID_GET_EVM_TRANSFERS_BY_ACTION_HASH = 20;
  private static final int METHODID_GET_EVM_TRANSFERS_BY_BLOCK_HEIGHT = 21;
  private static final int METHODID_GET_ELECTION_BUCKETS = 22;
  private static final int METHODID_READ_CONTRACT_STORAGE = 23;
  private static final int METHODID_TRACE_TRANSACTION_STRUCT_LOGS = 24;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.github.iotexproject.grpc.api.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIONS:
          serviceImpl.getActions((com.github.iotexproject.grpc.api.GetActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActionsResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_METAS:
          serviceImpl.getBlockMetas((com.github.iotexproject.grpc.api.GetBlockMetasRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetBlockMetasResponse>) responseObserver);
          break;
        case METHODID_GET_CHAIN_META:
          serviceImpl.getChainMeta((com.github.iotexproject.grpc.api.GetChainMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetChainMetaResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER_META:
          serviceImpl.getServerMeta((com.github.iotexproject.grpc.api.GetServerMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetServerMetaResponse>) responseObserver);
          break;
        case METHODID_SEND_ACTION:
          serviceImpl.sendAction((com.github.iotexproject.grpc.api.SendActionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SendActionResponse>) responseObserver);
          break;
        case METHODID_GET_RECEIPT_BY_ACTION:
          serviceImpl.getReceiptByAction((com.github.iotexproject.grpc.api.GetReceiptByActionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetReceiptByActionResponse>) responseObserver);
          break;
        case METHODID_READ_CONTRACT:
          serviceImpl.readContract((com.github.iotexproject.grpc.api.ReadContractRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractResponse>) responseObserver);
          break;
        case METHODID_SUGGEST_GAS_PRICE:
          serviceImpl.suggestGasPrice((com.github.iotexproject.grpc.api.SuggestGasPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.SuggestGasPriceResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_GAS_FOR_ACTION:
          serviceImpl.estimateGasForAction((com.github.iotexproject.grpc.api.EstimateGasForActionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateGasForActionResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_ACTION_GAS_CONSUMPTION:
          serviceImpl.estimateActionGasConsumption((com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse>) responseObserver);
          break;
        case METHODID_READ_STATE:
          serviceImpl.readState((com.github.iotexproject.grpc.api.ReadStateRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadStateResponse>) responseObserver);
          break;
        case METHODID_GET_EPOCH_META:
          serviceImpl.getEpochMeta((com.github.iotexproject.grpc.api.GetEpochMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEpochMetaResponse>) responseObserver);
          break;
        case METHODID_GET_RAW_BLOCKS:
          serviceImpl.getRawBlocks((com.github.iotexproject.grpc.api.GetRawBlocksRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetRawBlocksResponse>) responseObserver);
          break;
        case METHODID_GET_LOGS:
          serviceImpl.getLogs((com.github.iotexproject.grpc.api.GetLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetLogsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH:
          serviceImpl.getTransactionLogByActionHash((com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT:
          serviceImpl.getTransactionLogByBlockHeight((com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>) responseObserver);
          break;
        case METHODID_STREAM_BLOCKS:
          serviceImpl.streamBlocks((com.github.iotexproject.grpc.api.StreamBlocksRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamBlocksResponse>) responseObserver);
          break;
        case METHODID_STREAM_LOGS:
          serviceImpl.streamLogs((com.github.iotexproject.grpc.api.StreamLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.StreamLogsResponse>) responseObserver);
          break;
        case METHODID_GET_ACT_POOL_ACTIONS:
          serviceImpl.getActPoolActions((com.github.iotexproject.grpc.api.GetActPoolActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetActPoolActionsResponse>) responseObserver);
          break;
        case METHODID_GET_EVM_TRANSFERS_BY_ACTION_HASH:
          serviceImpl.getEvmTransfersByActionHash((com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse>) responseObserver);
          break;
        case METHODID_GET_EVM_TRANSFERS_BY_BLOCK_HEIGHT:
          serviceImpl.getEvmTransfersByBlockHeight((com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse>) responseObserver);
          break;
        case METHODID_GET_ELECTION_BUCKETS:
          serviceImpl.getElectionBuckets((com.github.iotexproject.grpc.api.GetElectionBucketsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetElectionBucketsResponse>) responseObserver);
          break;
        case METHODID_READ_CONTRACT_STORAGE:
          serviceImpl.readContractStorage((com.github.iotexproject.grpc.api.ReadContractStorageRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.ReadContractStorageResponse>) responseObserver);
          break;
        case METHODID_TRACE_TRANSACTION_STRUCT_LOGS:
          serviceImpl.traceTransactionStructLogs((com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetAccountRequest,
              com.github.iotexproject.grpc.api.GetAccountResponse>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getGetActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetActionsRequest,
              com.github.iotexproject.grpc.api.GetActionsResponse>(
                service, METHODID_GET_ACTIONS)))
        .addMethod(
          getGetBlockMetasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetBlockMetasRequest,
              com.github.iotexproject.grpc.api.GetBlockMetasResponse>(
                service, METHODID_GET_BLOCK_METAS)))
        .addMethod(
          getGetChainMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetChainMetaRequest,
              com.github.iotexproject.grpc.api.GetChainMetaResponse>(
                service, METHODID_GET_CHAIN_META)))
        .addMethod(
          getGetServerMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetServerMetaRequest,
              com.github.iotexproject.grpc.api.GetServerMetaResponse>(
                service, METHODID_GET_SERVER_META)))
        .addMethod(
          getSendActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.SendActionRequest,
              com.github.iotexproject.grpc.api.SendActionResponse>(
                service, METHODID_SEND_ACTION)))
        .addMethod(
          getGetReceiptByActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetReceiptByActionRequest,
              com.github.iotexproject.grpc.api.GetReceiptByActionResponse>(
                service, METHODID_GET_RECEIPT_BY_ACTION)))
        .addMethod(
          getReadContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.ReadContractRequest,
              com.github.iotexproject.grpc.api.ReadContractResponse>(
                service, METHODID_READ_CONTRACT)))
        .addMethod(
          getSuggestGasPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.SuggestGasPriceRequest,
              com.github.iotexproject.grpc.api.SuggestGasPriceResponse>(
                service, METHODID_SUGGEST_GAS_PRICE)))
        .addMethod(
          getEstimateGasForActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.EstimateGasForActionRequest,
              com.github.iotexproject.grpc.api.EstimateGasForActionResponse>(
                service, METHODID_ESTIMATE_GAS_FOR_ACTION)))
        .addMethod(
          getEstimateActionGasConsumptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.EstimateActionGasConsumptionRequest,
              com.github.iotexproject.grpc.api.EstimateActionGasConsumptionResponse>(
                service, METHODID_ESTIMATE_ACTION_GAS_CONSUMPTION)))
        .addMethod(
          getReadStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.ReadStateRequest,
              com.github.iotexproject.grpc.api.ReadStateResponse>(
                service, METHODID_READ_STATE)))
        .addMethod(
          getGetEpochMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetEpochMetaRequest,
              com.github.iotexproject.grpc.api.GetEpochMetaResponse>(
                service, METHODID_GET_EPOCH_META)))
        .addMethod(
          getGetRawBlocksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetRawBlocksRequest,
              com.github.iotexproject.grpc.api.GetRawBlocksResponse>(
                service, METHODID_GET_RAW_BLOCKS)))
        .addMethod(
          getGetLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetLogsRequest,
              com.github.iotexproject.grpc.api.GetLogsResponse>(
                service, METHODID_GET_LOGS)))
        .addMethod(
          getGetTransactionLogByActionHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
              com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>(
                service, METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH)))
        .addMethod(
          getGetTransactionLogByBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
              com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>(
                service, METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT)))
        .addMethod(
          getStreamBlocksMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.StreamBlocksRequest,
              com.github.iotexproject.grpc.api.StreamBlocksResponse>(
                service, METHODID_STREAM_BLOCKS)))
        .addMethod(
          getStreamLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.StreamLogsRequest,
              com.github.iotexproject.grpc.api.StreamLogsResponse>(
                service, METHODID_STREAM_LOGS)))
        .addMethod(
          getGetActPoolActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetActPoolActionsRequest,
              com.github.iotexproject.grpc.api.GetActPoolActionsResponse>(
                service, METHODID_GET_ACT_POOL_ACTIONS)))
        .addMethod(
          getGetEvmTransfersByActionHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashRequest,
              com.github.iotexproject.grpc.api.GetEvmTransfersByActionHashResponse>(
                service, METHODID_GET_EVM_TRANSFERS_BY_ACTION_HASH)))
        .addMethod(
          getGetEvmTransfersByBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightRequest,
              com.github.iotexproject.grpc.api.GetEvmTransfersByBlockHeightResponse>(
                service, METHODID_GET_EVM_TRANSFERS_BY_BLOCK_HEIGHT)))
        .addMethod(
          getGetElectionBucketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetElectionBucketsRequest,
              com.github.iotexproject.grpc.api.GetElectionBucketsResponse>(
                service, METHODID_GET_ELECTION_BUCKETS)))
        .addMethod(
          getReadContractStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.ReadContractStorageRequest,
              com.github.iotexproject.grpc.api.ReadContractStorageResponse>(
                service, METHODID_READ_CONTRACT_STORAGE)))
        .addMethod(
          getTraceTransactionStructLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.TraceTransactionStructLogsRequest,
              com.github.iotexproject.grpc.api.TraceTransactionStructLogsResponse>(
                service, METHODID_TRACE_TRANSACTION_STRUCT_LOGS)))
        .build();
  }

  private static abstract class APIServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    APIServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.iotexproject.grpc.api.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("APIService");
    }
  }

  private static final class APIServiceFileDescriptorSupplier
      extends APIServiceBaseDescriptorSupplier {
    APIServiceFileDescriptorSupplier() {}
  }

  private static final class APIServiceMethodDescriptorSupplier
      extends APIServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    APIServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (APIServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new APIServiceFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetActionsMethod())
              .addMethod(getGetBlockMetasMethod())
              .addMethod(getGetChainMetaMethod())
              .addMethod(getGetServerMetaMethod())
              .addMethod(getSendActionMethod())
              .addMethod(getGetReceiptByActionMethod())
              .addMethod(getReadContractMethod())
              .addMethod(getSuggestGasPriceMethod())
              .addMethod(getEstimateGasForActionMethod())
              .addMethod(getEstimateActionGasConsumptionMethod())
              .addMethod(getReadStateMethod())
              .addMethod(getGetEpochMetaMethod())
              .addMethod(getGetRawBlocksMethod())
              .addMethod(getGetLogsMethod())
              .addMethod(getGetTransactionLogByActionHashMethod())
              .addMethod(getGetTransactionLogByBlockHeightMethod())
              .addMethod(getStreamBlocksMethod())
              .addMethod(getStreamLogsMethod())
              .addMethod(getGetActPoolActionsMethod())
              .addMethod(getGetEvmTransfersByActionHashMethod())
              .addMethod(getGetEvmTransfersByBlockHeightMethod())
              .addMethod(getGetElectionBucketsMethod())
              .addMethod(getReadContractStorageMethod())
              .addMethod(getTraceTransactionStructLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
