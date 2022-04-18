// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetShopmallDataRsp.proto

package emu.grasscutter.net.proto;

public final class GetShopmallDataRspOuterClass {
  private GetShopmallDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetShopmallDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetShopmallDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @return A list containing the shopTypeList.
     */
    java.util.List<java.lang.Integer> getShopTypeListList();
    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @return The count of shopTypeList.
     */
    int getShopTypeListCount();
    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @param index The index of the element to return.
     * @return The shopTypeList at the given index.
     */
    int getShopTypeList(int index);
  }
  /**
   * Protobuf type {@code GetShopmallDataRsp}
   */
  public static final class GetShopmallDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetShopmallDataRsp)
      GetShopmallDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetShopmallDataRsp.newBuilder() to construct.
    private GetShopmallDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetShopmallDataRsp() {
      shopTypeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetShopmallDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetShopmallDataRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                shopTypeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              shopTypeList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                shopTypeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                shopTypeList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          shopTypeList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.class, emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOPTYPELIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList shopTypeList_;
    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @return A list containing the shopTypeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShopTypeListList() {
      return shopTypeList_;
    }
    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @return The count of shopTypeList.
     */
    public int getShopTypeListCount() {
      return shopTypeList_.size();
    }
    /**
     * <code>repeated uint32 shopTypeList = 2;</code>
     * @param index The index of the element to return.
     * @return The shopTypeList at the given index.
     */
    public int getShopTypeList(int index) {
      return shopTypeList_.getInt(index);
    }
    private int shopTypeListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (getShopTypeListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(shopTypeListMemoizedSerializedSize);
      }
      for (int i = 0; i < shopTypeList_.size(); i++) {
        output.writeUInt32NoTag(shopTypeList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < shopTypeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(shopTypeList_.getInt(i));
        }
        size += dataSize;
        if (!getShopTypeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        shopTypeListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp other = (emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getShopTypeListList()
          .equals(other.getShopTypeListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getShopTypeListCount() > 0) {
        hash = (37 * hash) + SHOPTYPELIST_FIELD_NUMBER;
        hash = (53 * hash) + getShopTypeListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp prototype) {
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
     * Protobuf type {@code GetShopmallDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetShopmallDataRsp)
        emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.class, emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.newBuilder()
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
        retcode_ = 0;

        shopTypeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp build() {
        emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp buildPartial() {
        emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp result = new emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          shopTypeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shopTypeList_ = shopTypeList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp other) {
        if (other == emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.shopTypeList_.isEmpty()) {
          if (shopTypeList_.isEmpty()) {
            shopTypeList_ = other.shopTypeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShopTypeListIsMutable();
            shopTypeList_.addAll(other.shopTypeList_);
          }
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
        emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList shopTypeList_ = emptyIntList();
      private void ensureShopTypeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          shopTypeList_ = mutableCopy(shopTypeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @return A list containing the shopTypeList.
       */
      public java.util.List<java.lang.Integer>
          getShopTypeListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(shopTypeList_) : shopTypeList_;
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @return The count of shopTypeList.
       */
      public int getShopTypeListCount() {
        return shopTypeList_.size();
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @param index The index of the element to return.
       * @return The shopTypeList at the given index.
       */
      public int getShopTypeList(int index) {
        return shopTypeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @param index The index to set the value at.
       * @param value The shopTypeList to set.
       * @return This builder for chaining.
       */
      public Builder setShopTypeList(
          int index, int value) {
        ensureShopTypeListIsMutable();
        shopTypeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @param value The shopTypeList to add.
       * @return This builder for chaining.
       */
      public Builder addShopTypeList(int value) {
        ensureShopTypeListIsMutable();
        shopTypeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @param values The shopTypeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShopTypeList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShopTypeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shopTypeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 shopTypeList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopTypeList() {
        shopTypeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GetShopmallDataRsp)
    }

    // @@protoc_insertion_point(class_scope:GetShopmallDataRsp)
    private static final emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp();
    }

    public static emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetShopmallDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetShopmallDataRsp>() {
      @java.lang.Override
      public GetShopmallDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetShopmallDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetShopmallDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetShopmallDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetShopmallDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetShopmallDataRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetShopmallDataRsp.proto\";\n\022GetShopmal" +
      "lDataRsp\022\017\n\007retcode\030\001 \001(\005\022\024\n\014shopTypeLis" +
      "t\030\002 \003(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetShopmallDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetShopmallDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetShopmallDataRsp_descriptor,
        new java.lang.String[] { "Retcode", "ShopTypeList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}