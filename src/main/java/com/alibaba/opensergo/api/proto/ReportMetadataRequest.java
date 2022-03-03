// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: specification/proto/servicecontract.proto

package com.alibaba.opensergo.api.proto;

/**
 * Protobuf type {@code opensergo.api.ReportMetadataRequest}
 */
public final class ReportMetadataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opensergo.api.ReportMetadataRequest)
    ReportMetadataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportMetadataRequest.newBuilder() to construct.
  private ReportMetadataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportMetadataRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportMetadataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportMetadataRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.alibaba.opensergo.api.proto.ServiceContractProto.Builder subBuilder = null;
            if (serviceContract_ != null) {
              subBuilder = serviceContract_.toBuilder();
            }
            serviceContract_ = input.readMessage(com.alibaba.opensergo.api.proto.ServiceContractProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serviceContract_);
              serviceContract_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.opensergo.api.proto.Servicecontract.internal_static_opensergo_api_ReportMetadataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.opensergo.api.proto.Servicecontract.internal_static_opensergo_api_ReportMetadataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.opensergo.api.proto.ReportMetadataRequest.class, com.alibaba.opensergo.api.proto.ReportMetadataRequest.Builder.class);
  }

  public static final int SERVICECONTRACT_FIELD_NUMBER = 1;
  private com.alibaba.opensergo.api.proto.ServiceContractProto serviceContract_;
  /**
   * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
   * @return Whether the serviceContract field is set.
   */
  @java.lang.Override
  public boolean hasServiceContract() {
    return serviceContract_ != null;
  }
  /**
   * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
   * @return The serviceContract.
   */
  @java.lang.Override
  public com.alibaba.opensergo.api.proto.ServiceContractProto getServiceContract() {
    return serviceContract_ == null ? com.alibaba.opensergo.api.proto.ServiceContractProto.getDefaultInstance() : serviceContract_;
  }
  /**
   * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
   */
  @java.lang.Override
  public com.alibaba.opensergo.api.proto.ServiceContractProtoOrBuilder getServiceContractOrBuilder() {
    return getServiceContract();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (serviceContract_ != null) {
      output.writeMessage(1, getServiceContract());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceContract_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServiceContract());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.opensergo.api.proto.ReportMetadataRequest)) {
      return super.equals(obj);
    }
    com.alibaba.opensergo.api.proto.ReportMetadataRequest other = (com.alibaba.opensergo.api.proto.ReportMetadataRequest) obj;

    if (hasServiceContract() != other.hasServiceContract()) return false;
    if (hasServiceContract()) {
      if (!getServiceContract()
          .equals(other.getServiceContract())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasServiceContract()) {
      hash = (37 * hash) + SERVICECONTRACT_FIELD_NUMBER;
      hash = (53 * hash) + getServiceContract().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.opensergo.api.proto.ReportMetadataRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opensergo.api.ReportMetadataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opensergo.api.ReportMetadataRequest)
      com.alibaba.opensergo.api.proto.ReportMetadataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.opensergo.api.proto.Servicecontract.internal_static_opensergo_api_ReportMetadataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.opensergo.api.proto.Servicecontract.internal_static_opensergo_api_ReportMetadataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.opensergo.api.proto.ReportMetadataRequest.class, com.alibaba.opensergo.api.proto.ReportMetadataRequest.Builder.class);
    }

    // Construct using com.alibaba.opensergo.api.proto.ReportMetadataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serviceContractBuilder_ == null) {
        serviceContract_ = null;
      } else {
        serviceContract_ = null;
        serviceContractBuilder_ = null;
      }
      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.opensergo.api.proto.Servicecontract.internal_static_opensergo_api_ReportMetadataRequest_descriptor;
    }

    @java.lang.Override
    public com.alibaba.opensergo.api.proto.ReportMetadataRequest getDefaultInstanceForType() {
      return com.alibaba.opensergo.api.proto.ReportMetadataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.alibaba.opensergo.api.proto.ReportMetadataRequest build() {
      com.alibaba.opensergo.api.proto.ReportMetadataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alibaba.opensergo.api.proto.ReportMetadataRequest buildPartial() {
      com.alibaba.opensergo.api.proto.ReportMetadataRequest result = new com.alibaba.opensergo.api.proto.ReportMetadataRequest(this);
      if (serviceContractBuilder_ == null) {
        result.serviceContract_ = serviceContract_;
      } else {
        result.serviceContract_ = serviceContractBuilder_.build();
      }
      result.name_ = name_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.opensergo.api.proto.ReportMetadataRequest) {
        return mergeFrom((com.alibaba.opensergo.api.proto.ReportMetadataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.opensergo.api.proto.ReportMetadataRequest other) {
      if (other == com.alibaba.opensergo.api.proto.ReportMetadataRequest.getDefaultInstance()) return this;
      if (other.hasServiceContract()) {
        mergeServiceContract(other.getServiceContract());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.opensergo.api.proto.ReportMetadataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.opensergo.api.proto.ReportMetadataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.alibaba.opensergo.api.proto.ServiceContractProto serviceContract_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.opensergo.api.proto.ServiceContractProto, com.alibaba.opensergo.api.proto.ServiceContractProto.Builder, com.alibaba.opensergo.api.proto.ServiceContractProtoOrBuilder> serviceContractBuilder_;
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     * @return Whether the serviceContract field is set.
     */
    public boolean hasServiceContract() {
      return serviceContractBuilder_ != null || serviceContract_ != null;
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     * @return The serviceContract.
     */
    public com.alibaba.opensergo.api.proto.ServiceContractProto getServiceContract() {
      if (serviceContractBuilder_ == null) {
        return serviceContract_ == null ? com.alibaba.opensergo.api.proto.ServiceContractProto.getDefaultInstance() : serviceContract_;
      } else {
        return serviceContractBuilder_.getMessage();
      }
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public Builder setServiceContract(com.alibaba.opensergo.api.proto.ServiceContractProto value) {
      if (serviceContractBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceContract_ = value;
        onChanged();
      } else {
        serviceContractBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public Builder setServiceContract(
        com.alibaba.opensergo.api.proto.ServiceContractProto.Builder builderForValue) {
      if (serviceContractBuilder_ == null) {
        serviceContract_ = builderForValue.build();
        onChanged();
      } else {
        serviceContractBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public Builder mergeServiceContract(com.alibaba.opensergo.api.proto.ServiceContractProto value) {
      if (serviceContractBuilder_ == null) {
        if (serviceContract_ != null) {
          serviceContract_ =
            com.alibaba.opensergo.api.proto.ServiceContractProto.newBuilder(serviceContract_).mergeFrom(value).buildPartial();
        } else {
          serviceContract_ = value;
        }
        onChanged();
      } else {
        serviceContractBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public Builder clearServiceContract() {
      if (serviceContractBuilder_ == null) {
        serviceContract_ = null;
        onChanged();
      } else {
        serviceContract_ = null;
        serviceContractBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public com.alibaba.opensergo.api.proto.ServiceContractProto.Builder getServiceContractBuilder() {
      
      onChanged();
      return getServiceContractFieldBuilder().getBuilder();
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    public com.alibaba.opensergo.api.proto.ServiceContractProtoOrBuilder getServiceContractOrBuilder() {
      if (serviceContractBuilder_ != null) {
        return serviceContractBuilder_.getMessageOrBuilder();
      } else {
        return serviceContract_ == null ?
            com.alibaba.opensergo.api.proto.ServiceContractProto.getDefaultInstance() : serviceContract_;
      }
    }
    /**
     * <code>.opensergo.api.ServiceContractProto serviceContract = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.opensergo.api.proto.ServiceContractProto, com.alibaba.opensergo.api.proto.ServiceContractProto.Builder, com.alibaba.opensergo.api.proto.ServiceContractProtoOrBuilder> 
        getServiceContractFieldBuilder() {
      if (serviceContractBuilder_ == null) {
        serviceContractBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.opensergo.api.proto.ServiceContractProto, com.alibaba.opensergo.api.proto.ServiceContractProto.Builder, com.alibaba.opensergo.api.proto.ServiceContractProtoOrBuilder>(
                getServiceContract(),
                getParentForChildren(),
                isClean());
        serviceContract_ = null;
      }
      return serviceContractBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opensergo.api.ReportMetadataRequest)
  }

  // @@protoc_insertion_point(class_scope:opensergo.api.ReportMetadataRequest)
  private static final com.alibaba.opensergo.api.proto.ReportMetadataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.opensergo.api.proto.ReportMetadataRequest();
  }

  public static com.alibaba.opensergo.api.proto.ReportMetadataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportMetadataRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReportMetadataRequest>() {
    @java.lang.Override
    public ReportMetadataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportMetadataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportMetadataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportMetadataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alibaba.opensergo.api.proto.ReportMetadataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

