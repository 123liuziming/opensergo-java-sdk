// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: specification/proto/servicecontract.proto

package com.alibaba.opensergo.api.proto;

public interface MethodDescriptorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.api.MethodDescriptorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   * </pre>
   *
   * <code>optional string input_type = 2;</code>
   * @return Whether the inputType field is set.
   */
  boolean hasInputType();
  /**
   * <pre>
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   * </pre>
   *
   * <code>optional string input_type = 2;</code>
   * @return The inputType.
   */
  java.lang.String getInputType();
  /**
   * <pre>
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   * </pre>
   *
   * <code>optional string input_type = 2;</code>
   * @return The bytes for inputType.
   */
  com.google.protobuf.ByteString
      getInputTypeBytes();

  /**
   * <code>optional string output_type = 3;</code>
   * @return Whether the outputType field is set.
   */
  boolean hasOutputType();
  /**
   * <code>optional string output_type = 3;</code>
   * @return The outputType.
   */
  java.lang.String getOutputType();
  /**
   * <code>optional string output_type = 3;</code>
   * @return The bytes for outputType.
   */
  com.google.protobuf.ByteString
      getOutputTypeBytes();

  /**
   * <code>optional .opensergo.api.MethodOptions options = 4;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .opensergo.api.MethodOptions options = 4;</code>
   * @return The options.
   */
  com.alibaba.opensergo.api.proto.MethodOptions getOptions();
  /**
   * <code>optional .opensergo.api.MethodOptions options = 4;</code>
   */
  com.alibaba.opensergo.api.proto.MethodOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * Identifies if client streams multiple client messages
   * </pre>
   *
   * <code>optional bool client_streaming = 5;</code>
   * @return Whether the clientStreaming field is set.
   */
  boolean hasClientStreaming();
  /**
   * <pre>
   * Identifies if client streams multiple client messages
   * </pre>
   *
   * <code>optional bool client_streaming = 5;</code>
   * @return The clientStreaming.
   */
  boolean getClientStreaming();

  /**
   * <pre>
   * Identifies if server streams multiple server messages
   * </pre>
   *
   * <code>optional bool server_streaming = 6;</code>
   * @return Whether the serverStreaming field is set.
   */
  boolean hasServerStreaming();
  /**
   * <pre>
   * Identifies if server streams multiple server messages
   * </pre>
   *
   * <code>optional bool server_streaming = 6;</code>
   * @return The serverStreaming.
   */
  boolean getServerStreaming();

  /**
   * <pre>
   * 注释/注解
   * </pre>
   *
   * <code>optional string description = 7;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * 注释/注解
   * </pre>
   *
   * <code>optional string description = 7;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * 注释/注解
   * </pre>
   *
   * <code>optional string description = 7;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string httpPath = 8;</code>
   * @return A list containing the httpPath.
   */
  java.util.List<java.lang.String>
      getHttpPathList();
  /**
   * <code>repeated string httpPath = 8;</code>
   * @return The count of httpPath.
   */
  int getHttpPathCount();
  /**
   * <code>repeated string httpPath = 8;</code>
   * @param index The index of the element to return.
   * @return The httpPath at the given index.
   */
  java.lang.String getHttpPath(int index);
  /**
   * <code>repeated string httpPath = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the httpPath at the given index.
   */
  com.google.protobuf.ByteString
      getHttpPathBytes(int index);

  /**
   * <code>repeated string httpMethod = 9;</code>
   * @return A list containing the httpMethod.
   */
  java.util.List<java.lang.String>
      getHttpMethodList();
  /**
   * <code>repeated string httpMethod = 9;</code>
   * @return The count of httpMethod.
   */
  int getHttpMethodCount();
  /**
   * <code>repeated string httpMethod = 9;</code>
   * @param index The index of the element to return.
   * @return The httpMethod at the given index.
   */
  java.lang.String getHttpMethod(int index);
  /**
   * <code>repeated string httpMethod = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the httpMethod at the given index.
   */
  com.google.protobuf.ByteString
      getHttpMethodBytes(int index);
}
