// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.systemdesign.grpcserver;

/**
 * Protobuf type {@code com.systemdesign.grpcserver.OrderPlacementRequest}
 */
public final class OrderPlacementRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.systemdesign.grpcserver.OrderPlacementRequest)
    OrderPlacementRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderPlacementRequest.newBuilder() to construct.
  private OrderPlacementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderPlacementRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderPlacementRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderPlacementRequest(
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
            com.systemdesign.grpcserver.ProductDTO.Builder subBuilder = null;
            if (productDTO_ != null) {
              subBuilder = productDTO_.toBuilder();
            }
            productDTO_ = input.readMessage(com.systemdesign.grpcserver.ProductDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(productDTO_);
              productDTO_ = subBuilder.buildPartial();
            }

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
    return com.systemdesign.grpcserver.OrderServiceOuterClass.internal_static_com_systemdesign_grpcserver_OrderPlacementRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.systemdesign.grpcserver.OrderServiceOuterClass.internal_static_com_systemdesign_grpcserver_OrderPlacementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.systemdesign.grpcserver.OrderPlacementRequest.class, com.systemdesign.grpcserver.OrderPlacementRequest.Builder.class);
  }

  public static final int PRODUCTDTO_FIELD_NUMBER = 1;
  private com.systemdesign.grpcserver.ProductDTO productDTO_;
  /**
   * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
   * @return Whether the productDTO field is set.
   */
  @java.lang.Override
  public boolean hasProductDTO() {
    return productDTO_ != null;
  }
  /**
   * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
   * @return The productDTO.
   */
  @java.lang.Override
  public com.systemdesign.grpcserver.ProductDTO getProductDTO() {
    return productDTO_ == null ? com.systemdesign.grpcserver.ProductDTO.getDefaultInstance() : productDTO_;
  }
  /**
   * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
   */
  @java.lang.Override
  public com.systemdesign.grpcserver.ProductDTOOrBuilder getProductDTOOrBuilder() {
    return getProductDTO();
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
    if (productDTO_ != null) {
      output.writeMessage(1, getProductDTO());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productDTO_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProductDTO());
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
    if (!(obj instanceof com.systemdesign.grpcserver.OrderPlacementRequest)) {
      return super.equals(obj);
    }
    com.systemdesign.grpcserver.OrderPlacementRequest other = (com.systemdesign.grpcserver.OrderPlacementRequest) obj;

    if (hasProductDTO() != other.hasProductDTO()) return false;
    if (hasProductDTO()) {
      if (!getProductDTO()
          .equals(other.getProductDTO())) return false;
    }
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
    if (hasProductDTO()) {
      hash = (37 * hash) + PRODUCTDTO_FIELD_NUMBER;
      hash = (53 * hash) + getProductDTO().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.systemdesign.grpcserver.OrderPlacementRequest parseFrom(
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
  public static Builder newBuilder(com.systemdesign.grpcserver.OrderPlacementRequest prototype) {
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
   * Protobuf type {@code com.systemdesign.grpcserver.OrderPlacementRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.systemdesign.grpcserver.OrderPlacementRequest)
      com.systemdesign.grpcserver.OrderPlacementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.systemdesign.grpcserver.OrderServiceOuterClass.internal_static_com_systemdesign_grpcserver_OrderPlacementRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.systemdesign.grpcserver.OrderServiceOuterClass.internal_static_com_systemdesign_grpcserver_OrderPlacementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.systemdesign.grpcserver.OrderPlacementRequest.class, com.systemdesign.grpcserver.OrderPlacementRequest.Builder.class);
    }

    // Construct using com.systemdesign.grpcserver.OrderPlacementRequest.newBuilder()
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
      if (productDTOBuilder_ == null) {
        productDTO_ = null;
      } else {
        productDTO_ = null;
        productDTOBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.systemdesign.grpcserver.OrderServiceOuterClass.internal_static_com_systemdesign_grpcserver_OrderPlacementRequest_descriptor;
    }

    @java.lang.Override
    public com.systemdesign.grpcserver.OrderPlacementRequest getDefaultInstanceForType() {
      return com.systemdesign.grpcserver.OrderPlacementRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.systemdesign.grpcserver.OrderPlacementRequest build() {
      com.systemdesign.grpcserver.OrderPlacementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.systemdesign.grpcserver.OrderPlacementRequest buildPartial() {
      com.systemdesign.grpcserver.OrderPlacementRequest result = new com.systemdesign.grpcserver.OrderPlacementRequest(this);
      if (productDTOBuilder_ == null) {
        result.productDTO_ = productDTO_;
      } else {
        result.productDTO_ = productDTOBuilder_.build();
      }
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
      if (other instanceof com.systemdesign.grpcserver.OrderPlacementRequest) {
        return mergeFrom((com.systemdesign.grpcserver.OrderPlacementRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.systemdesign.grpcserver.OrderPlacementRequest other) {
      if (other == com.systemdesign.grpcserver.OrderPlacementRequest.getDefaultInstance()) return this;
      if (other.hasProductDTO()) {
        mergeProductDTO(other.getProductDTO());
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
      com.systemdesign.grpcserver.OrderPlacementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.systemdesign.grpcserver.OrderPlacementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.systemdesign.grpcserver.ProductDTO productDTO_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.systemdesign.grpcserver.ProductDTO, com.systemdesign.grpcserver.ProductDTO.Builder, com.systemdesign.grpcserver.ProductDTOOrBuilder> productDTOBuilder_;
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     * @return Whether the productDTO field is set.
     */
    public boolean hasProductDTO() {
      return productDTOBuilder_ != null || productDTO_ != null;
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     * @return The productDTO.
     */
    public com.systemdesign.grpcserver.ProductDTO getProductDTO() {
      if (productDTOBuilder_ == null) {
        return productDTO_ == null ? com.systemdesign.grpcserver.ProductDTO.getDefaultInstance() : productDTO_;
      } else {
        return productDTOBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public Builder setProductDTO(com.systemdesign.grpcserver.ProductDTO value) {
      if (productDTOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productDTO_ = value;
        onChanged();
      } else {
        productDTOBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public Builder setProductDTO(
        com.systemdesign.grpcserver.ProductDTO.Builder builderForValue) {
      if (productDTOBuilder_ == null) {
        productDTO_ = builderForValue.build();
        onChanged();
      } else {
        productDTOBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public Builder mergeProductDTO(com.systemdesign.grpcserver.ProductDTO value) {
      if (productDTOBuilder_ == null) {
        if (productDTO_ != null) {
          productDTO_ =
            com.systemdesign.grpcserver.ProductDTO.newBuilder(productDTO_).mergeFrom(value).buildPartial();
        } else {
          productDTO_ = value;
        }
        onChanged();
      } else {
        productDTOBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public Builder clearProductDTO() {
      if (productDTOBuilder_ == null) {
        productDTO_ = null;
        onChanged();
      } else {
        productDTO_ = null;
        productDTOBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public com.systemdesign.grpcserver.ProductDTO.Builder getProductDTOBuilder() {
      
      onChanged();
      return getProductDTOFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    public com.systemdesign.grpcserver.ProductDTOOrBuilder getProductDTOOrBuilder() {
      if (productDTOBuilder_ != null) {
        return productDTOBuilder_.getMessageOrBuilder();
      } else {
        return productDTO_ == null ?
            com.systemdesign.grpcserver.ProductDTO.getDefaultInstance() : productDTO_;
      }
    }
    /**
     * <code>.com.systemdesign.grpcserver.ProductDTO productDTO = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.systemdesign.grpcserver.ProductDTO, com.systemdesign.grpcserver.ProductDTO.Builder, com.systemdesign.grpcserver.ProductDTOOrBuilder> 
        getProductDTOFieldBuilder() {
      if (productDTOBuilder_ == null) {
        productDTOBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.systemdesign.grpcserver.ProductDTO, com.systemdesign.grpcserver.ProductDTO.Builder, com.systemdesign.grpcserver.ProductDTOOrBuilder>(
                getProductDTO(),
                getParentForChildren(),
                isClean());
        productDTO_ = null;
      }
      return productDTOBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.systemdesign.grpcserver.OrderPlacementRequest)
  }

  // @@protoc_insertion_point(class_scope:com.systemdesign.grpcserver.OrderPlacementRequest)
  private static final com.systemdesign.grpcserver.OrderPlacementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.systemdesign.grpcserver.OrderPlacementRequest();
  }

  public static com.systemdesign.grpcserver.OrderPlacementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderPlacementRequest>
      PARSER = new com.google.protobuf.AbstractParser<OrderPlacementRequest>() {
    @java.lang.Override
    public OrderPlacementRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderPlacementRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderPlacementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderPlacementRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.systemdesign.grpcserver.OrderPlacementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

