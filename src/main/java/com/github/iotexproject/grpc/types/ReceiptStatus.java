// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/receipt_status.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * BELOW ARE DEFINITIONS FOR EVM ERROR CLASSIFICATION IN RECEIPT STATUS 
 * </pre>
 *
 * Protobuf enum {@code iotextypes.ReceiptStatus}
 */
public enum ReceiptStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Failure = 0;</code>
   */
  Failure(0),
  /**
   * <code>Success = 1;</code>
   */
  Success(1),
  /**
   * <pre>
   * 1xx for EVM ErrorCode
   * </pre>
   *
   * <code>ErrUnknown = 100;</code>
   */
  ErrUnknown(100),
  /**
   * <code>ErrOutOfGas = 101;</code>
   */
  ErrOutOfGas(101),
  /**
   * <code>ErrCodeStoreOutOfGas = 102;</code>
   */
  ErrCodeStoreOutOfGas(102),
  /**
   * <code>ErrDepth = 103;</code>
   */
  ErrDepth(103),
  /**
   * <code>ErrContractAddressCollision = 104;</code>
   */
  ErrContractAddressCollision(104),
  /**
   * <code>ErrNoCompatibleInterpreter = 105;</code>
   */
  ErrNoCompatibleInterpreter(105),
  /**
   * <code>ErrExecutionReverted = 106;</code>
   */
  ErrExecutionReverted(106),
  /**
   * <code>ErrMaxCodeSizeExceeded = 107;</code>
   */
  ErrMaxCodeSizeExceeded(107),
  /**
   * <code>ErrWriteProtection = 108;</code>
   */
  ErrWriteProtection(108),
  /**
   * <code>ErrInvalidSubroutineEntry = 109;</code>
   */
  ErrInvalidSubroutineEntry(109),
  /**
   * <code>ErrInsufficientBalance = 110;</code>
   */
  ErrInsufficientBalance(110),
  /**
   * <code>ErrInvalidJump = 111;</code>
   */
  ErrInvalidJump(111),
  /**
   * <code>ErrReturnDataOutOfBounds = 112;</code>
   */
  ErrReturnDataOutOfBounds(112),
  /**
   * <code>ErrGasUintOverflow = 113;</code>
   */
  ErrGasUintOverflow(113),
  /**
   * <code>ErrInvalidRetsub = 114;</code>
   */
  ErrInvalidRetsub(114),
  /**
   * <code>ErrReturnStackExceeded = 115;</code>
   */
  ErrReturnStackExceeded(115),
  /**
   * <code>ErrInvalidCode = 116;</code>
   */
  ErrInvalidCode(116),
  /**
   * <pre>
   * 2xx for Staking ErrorCode
   * </pre>
   *
   * <code>ErrLoadAccount = 200;</code>
   */
  ErrLoadAccount(200),
  /**
   * <code>ErrNotEnoughBalance = 201;</code>
   */
  ErrNotEnoughBalance(201),
  /**
   * <code>ErrInvalidBucketIndex = 202;</code>
   */
  ErrInvalidBucketIndex(202),
  /**
   * <code>ErrUnauthorizedOperator = 203;</code>
   */
  ErrUnauthorizedOperator(203),
  /**
   * <code>ErrInvalidBucketType = 204;</code>
   */
  ErrInvalidBucketType(204),
  /**
   * <code>ErrCandidateNotExist = 205;</code>
   */
  ErrCandidateNotExist(205),
  /**
   * <code>ErrReduceDurationBeforeMaturity = 206;</code>
   */
  ErrReduceDurationBeforeMaturity(206),
  /**
   * <code>ErrUnstakeBeforeMaturity = 207;</code>
   */
  ErrUnstakeBeforeMaturity(207),
  /**
   * <code>ErrWithdrawBeforeUnstake = 208;</code>
   */
  ErrWithdrawBeforeUnstake(208),
  /**
   * <code>ErrWithdrawBeforeMaturity = 209;</code>
   */
  ErrWithdrawBeforeMaturity(209),
  /**
   * <code>ErrCandidateAlreadyExist = 210;</code>
   */
  ErrCandidateAlreadyExist(210),
  /**
   * <code>ErrCandidateConflict = 211;</code>
   */
  ErrCandidateConflict(211),
  /**
   * <code>ErrInvalidBucketAmount = 212;</code>
   */
  ErrInvalidBucketAmount(212),
  /**
   * <code>ErrWriteAccount = 213;</code>
   */
  ErrWriteAccount(213),
  /**
   * <code>ErrWriteBucket = 214;</code>
   */
  ErrWriteBucket(214),
  /**
   * <code>ErrWriteCandidate = 215;</code>
   */
  ErrWriteCandidate(215),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ReceiptStatus.class.getName());
  }
  /**
   * <code>Failure = 0;</code>
   */
  public static final int Failure_VALUE = 0;
  /**
   * <code>Success = 1;</code>
   */
  public static final int Success_VALUE = 1;
  /**
   * <pre>
   * 1xx for EVM ErrorCode
   * </pre>
   *
   * <code>ErrUnknown = 100;</code>
   */
  public static final int ErrUnknown_VALUE = 100;
  /**
   * <code>ErrOutOfGas = 101;</code>
   */
  public static final int ErrOutOfGas_VALUE = 101;
  /**
   * <code>ErrCodeStoreOutOfGas = 102;</code>
   */
  public static final int ErrCodeStoreOutOfGas_VALUE = 102;
  /**
   * <code>ErrDepth = 103;</code>
   */
  public static final int ErrDepth_VALUE = 103;
  /**
   * <code>ErrContractAddressCollision = 104;</code>
   */
  public static final int ErrContractAddressCollision_VALUE = 104;
  /**
   * <code>ErrNoCompatibleInterpreter = 105;</code>
   */
  public static final int ErrNoCompatibleInterpreter_VALUE = 105;
  /**
   * <code>ErrExecutionReverted = 106;</code>
   */
  public static final int ErrExecutionReverted_VALUE = 106;
  /**
   * <code>ErrMaxCodeSizeExceeded = 107;</code>
   */
  public static final int ErrMaxCodeSizeExceeded_VALUE = 107;
  /**
   * <code>ErrWriteProtection = 108;</code>
   */
  public static final int ErrWriteProtection_VALUE = 108;
  /**
   * <code>ErrInvalidSubroutineEntry = 109;</code>
   */
  public static final int ErrInvalidSubroutineEntry_VALUE = 109;
  /**
   * <code>ErrInsufficientBalance = 110;</code>
   */
  public static final int ErrInsufficientBalance_VALUE = 110;
  /**
   * <code>ErrInvalidJump = 111;</code>
   */
  public static final int ErrInvalidJump_VALUE = 111;
  /**
   * <code>ErrReturnDataOutOfBounds = 112;</code>
   */
  public static final int ErrReturnDataOutOfBounds_VALUE = 112;
  /**
   * <code>ErrGasUintOverflow = 113;</code>
   */
  public static final int ErrGasUintOverflow_VALUE = 113;
  /**
   * <code>ErrInvalidRetsub = 114;</code>
   */
  public static final int ErrInvalidRetsub_VALUE = 114;
  /**
   * <code>ErrReturnStackExceeded = 115;</code>
   */
  public static final int ErrReturnStackExceeded_VALUE = 115;
  /**
   * <code>ErrInvalidCode = 116;</code>
   */
  public static final int ErrInvalidCode_VALUE = 116;
  /**
   * <pre>
   * 2xx for Staking ErrorCode
   * </pre>
   *
   * <code>ErrLoadAccount = 200;</code>
   */
  public static final int ErrLoadAccount_VALUE = 200;
  /**
   * <code>ErrNotEnoughBalance = 201;</code>
   */
  public static final int ErrNotEnoughBalance_VALUE = 201;
  /**
   * <code>ErrInvalidBucketIndex = 202;</code>
   */
  public static final int ErrInvalidBucketIndex_VALUE = 202;
  /**
   * <code>ErrUnauthorizedOperator = 203;</code>
   */
  public static final int ErrUnauthorizedOperator_VALUE = 203;
  /**
   * <code>ErrInvalidBucketType = 204;</code>
   */
  public static final int ErrInvalidBucketType_VALUE = 204;
  /**
   * <code>ErrCandidateNotExist = 205;</code>
   */
  public static final int ErrCandidateNotExist_VALUE = 205;
  /**
   * <code>ErrReduceDurationBeforeMaturity = 206;</code>
   */
  public static final int ErrReduceDurationBeforeMaturity_VALUE = 206;
  /**
   * <code>ErrUnstakeBeforeMaturity = 207;</code>
   */
  public static final int ErrUnstakeBeforeMaturity_VALUE = 207;
  /**
   * <code>ErrWithdrawBeforeUnstake = 208;</code>
   */
  public static final int ErrWithdrawBeforeUnstake_VALUE = 208;
  /**
   * <code>ErrWithdrawBeforeMaturity = 209;</code>
   */
  public static final int ErrWithdrawBeforeMaturity_VALUE = 209;
  /**
   * <code>ErrCandidateAlreadyExist = 210;</code>
   */
  public static final int ErrCandidateAlreadyExist_VALUE = 210;
  /**
   * <code>ErrCandidateConflict = 211;</code>
   */
  public static final int ErrCandidateConflict_VALUE = 211;
  /**
   * <code>ErrInvalidBucketAmount = 212;</code>
   */
  public static final int ErrInvalidBucketAmount_VALUE = 212;
  /**
   * <code>ErrWriteAccount = 213;</code>
   */
  public static final int ErrWriteAccount_VALUE = 213;
  /**
   * <code>ErrWriteBucket = 214;</code>
   */
  public static final int ErrWriteBucket_VALUE = 214;
  /**
   * <code>ErrWriteCandidate = 215;</code>
   */
  public static final int ErrWriteCandidate_VALUE = 215;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReceiptStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReceiptStatus forNumber(int value) {
    switch (value) {
      case 0: return Failure;
      case 1: return Success;
      case 100: return ErrUnknown;
      case 101: return ErrOutOfGas;
      case 102: return ErrCodeStoreOutOfGas;
      case 103: return ErrDepth;
      case 104: return ErrContractAddressCollision;
      case 105: return ErrNoCompatibleInterpreter;
      case 106: return ErrExecutionReverted;
      case 107: return ErrMaxCodeSizeExceeded;
      case 108: return ErrWriteProtection;
      case 109: return ErrInvalidSubroutineEntry;
      case 110: return ErrInsufficientBalance;
      case 111: return ErrInvalidJump;
      case 112: return ErrReturnDataOutOfBounds;
      case 113: return ErrGasUintOverflow;
      case 114: return ErrInvalidRetsub;
      case 115: return ErrReturnStackExceeded;
      case 116: return ErrInvalidCode;
      case 200: return ErrLoadAccount;
      case 201: return ErrNotEnoughBalance;
      case 202: return ErrInvalidBucketIndex;
      case 203: return ErrUnauthorizedOperator;
      case 204: return ErrInvalidBucketType;
      case 205: return ErrCandidateNotExist;
      case 206: return ErrReduceDurationBeforeMaturity;
      case 207: return ErrUnstakeBeforeMaturity;
      case 208: return ErrWithdrawBeforeUnstake;
      case 209: return ErrWithdrawBeforeMaturity;
      case 210: return ErrCandidateAlreadyExist;
      case 211: return ErrCandidateConflict;
      case 212: return ErrInvalidBucketAmount;
      case 213: return ErrWriteAccount;
      case 214: return ErrWriteBucket;
      case 215: return ErrWriteCandidate;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReceiptStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReceiptStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReceiptStatus>() {
          public ReceiptStatus findValueByNumber(int number) {
            return ReceiptStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ReceiptStatusOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReceiptStatus[] VALUES = values();

  public static ReceiptStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReceiptStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:iotextypes.ReceiptStatus)
}

