package com.sxchuan.magicbox.docker.enums

object ContainerPortType extends Enumeration  {
  type ContainerPortTypeDataType = Value
  val Tcp = Value(0, "tcp")
  val Udp = Value(1, "udp")
}