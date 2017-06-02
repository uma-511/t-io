// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

public interface AuthReqBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AuthReqBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *鉴权token
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   *鉴权token
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * device id(手机设备id)
   * </pre>
   *
   * <code>string deviceId = 2;</code>
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * device id(手机设备id)
   * </pre>
   *
   * <code>string deviceId = 2;</code>
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   *序列号
   * </pre>
   *
   * <code>int64 seq = 3;</code>
   */
  long getSeq();

  /**
   * <pre>
   *clienttype客户端类型1-pc 2-android 3-ios
   * </pre>
   *
   * <code>.DeviceType deviceType = 4;</code>
   */
  int getDeviceTypeValue();
  /**
   * <pre>
   *clienttype客户端类型1-pc 2-android 3-ios
   * </pre>
   *
   * <code>.DeviceType deviceType = 4;</code>
   */
  org.tio.examples.im.common.packets.DeviceType getDeviceType();

  /**
   * <pre>
   *渠道号
   * </pre>
   *
   * <code>string cid = 5;</code>
   */
  java.lang.String getCid();
  /**
   * <pre>
   *渠道号
   * </pre>
   *
   * <code>string cid = 5;</code>
   */
  com.google.protobuf.ByteString
      getCidBytes();

  /**
   * <pre>
   *app版本号
   * </pre>
   *
   * <code>string appVersion = 6;</code>
   */
  java.lang.String getAppVersion();
  /**
   * <pre>
   *app版本号
   * </pre>
   *
   * <code>string appVersion = 6;</code>
   */
  com.google.protobuf.ByteString
      getAppVersionBytes();

  /**
   * <pre>
   *手机型号信息，譬如华为某型号
   * </pre>
   *
   * <code>string deviceInfo = 7;</code>
   */
  java.lang.String getDeviceInfo();
  /**
   * <pre>
   *手机型号信息，譬如华为某型号
   * </pre>
   *
   * <code>string deviceInfo = 7;</code>
   */
  com.google.protobuf.ByteString
      getDeviceInfoBytes();

  /**
   * <pre>
   *签名
   * </pre>
   *
   * <code>string sign = 8;</code>
   */
  java.lang.String getSign();
  /**
   * <pre>
   *签名
   * </pre>
   *
   * <code>string sign = 8;</code>
   */
  com.google.protobuf.ByteString
      getSignBytes();
}
