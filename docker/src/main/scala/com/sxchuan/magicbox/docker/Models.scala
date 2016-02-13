package com.sxchuan.magicbox.docker

import com.sxchuan.magicbox.docker.enums.ContainerPortType.ContainerPortTypeDataType

case class ContainerPort(privatePort: Int, publicPort: Int, portType: ContainerPortTypeDataType)

case class ContainerLabel(vendor: String, license: String, version: String)

case class Container(id: String,
                     name: List[String],
                     image: String,
                     imageId: String,
                     command: String,
                     created: Long,
                     status: Int,
                     ports: List[ContainerPort],
                     label: ContainerLabel,
                     sizeRw: Long,
                     sizeRootFs: Long,
                     NetWorkSettings: String)