// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: specification/proto/servicecontract.proto

package com.alibaba.opensergo.api.proto;

public interface UninterpretedOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.api.UninterpretedOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opensergo.api.UninterpretedOption.NamePart name = 2;</code>
   */
  java.util.List<com.alibaba.opensergo.api.proto.UninterpretedOption.NamePart> 
      getNameList();
  /**
   * <code>repeated .opensergo.api.UninterpretedOption.NamePart name = 2;</code>
   */
  com.alibaba.opensergo.api.proto.UninterpretedOption.NamePart getName(int index);
  /**
   * <code>repeated .opensergo.api.UninterpretedOption.NamePart name = 2;</code>
   */
  int getNameCount();
  /**
   * <code>repeated .opensergo.api.UninterpretedOption.NamePart name = 2;</code>
   */
  java.util.List<? extends com.alibaba.opensergo.api.proto.UninterpretedOption.NamePartOrBuilder> 
      getNameOrBuilderList();
  /**
   * <code>repeated .opensergo.api.UninterpretedOption.NamePart name = 2;</code>
   */
  com.alibaba.opensergo.api.proto.UninterpretedOption.NamePartOrBuilder getNameOrBuilder(
      int index);

  /**
   * <pre>
   * The value of the uninterpreted option, in whatever type the tokenizer
   * identified it as during parsing. Exactly one of these should be set.
   * </pre>
   *
   * <code>optional string identifier_value = 3;</code>
   * @return Whether the identifierValue field is set.
   */
  boolean hasIdentifierValue();
  /**
   * <pre>
   * The value of the uninterpreted option, in whatever type the tokenizer
   * identified it as during parsing. Exactly one of these should be set.
   * </pre>
   *
   * <code>optional string identifier_value = 3;</code>
   * @return The identifierValue.
   */
  java.lang.String getIdentifierValue();
  /**
   * <pre>
   * The value of the uninterpreted option, in whatever type the tokenizer
   * identified it as during parsing. Exactly one of these should be set.
   * </pre>
   *
   * <code>optional string identifier_value = 3;</code>
   * @return The bytes for identifierValue.
   */
  com.google.protobuf.ByteString
      getIdentifierValueBytes();

  /**
   * <code>optional uint64 positive_int_value = 4;</code>
   * @return Whether the positiveIntValue field is set.
   */
  boolean hasPositiveIntValue();
  /**
   * <code>optional uint64 positive_int_value = 4;</code>
   * @return The positiveIntValue.
   */
  long getPositiveIntValue();

  /**
   * <code>optional int64 negative_int_value = 5;</code>
   * @return Whether the negativeIntValue field is set.
   */
  boolean hasNegativeIntValue();
  /**
   * <code>optional int64 negative_int_value = 5;</code>
   * @return The negativeIntValue.
   */
  long getNegativeIntValue();

  /**
   * <code>optional double double_value = 6;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <code>optional double double_value = 6;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>optional bytes string_value = 7;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <code>optional bytes string_value = 7;</code>
   * @return The stringValue.
   */
  com.google.protobuf.ByteString getStringValue();

  /**
   * <code>optional string aggregate_value = 8;</code>
   * @return Whether the aggregateValue field is set.
   */
  boolean hasAggregateValue();
  /**
   * <code>optional string aggregate_value = 8;</code>
   * @return The aggregateValue.
   */
  java.lang.String getAggregateValue();
  /**
   * <code>optional string aggregate_value = 8;</code>
   * @return The bytes for aggregateValue.
   */
  com.google.protobuf.ByteString
      getAggregateValueBytes();
}
