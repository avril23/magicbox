package com.sxchuan.magicbox.docker.enums

object ContainerPortType extends Enumeration {
  type ContainerPortTypeDataType = Value
  val Tcp = new ValueSet(0, "tcp")
  val Udp = new ValueSet(1, "udp")
}