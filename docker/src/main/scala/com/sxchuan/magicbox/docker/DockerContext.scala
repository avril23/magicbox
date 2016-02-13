package com.sxchuan.magicbox.docker

class DockerContext(endpoint: String, port: Int, isSSL: Boolean = false) {

  private val _endpoint: String = endpoint
  private val _port: Int = port

  def baseEndpoint: String = {
    "%s:%s".format(ensureProtocol, _port)
  }

  def ensureProtocol: String = {
    if (_endpoint.startsWith(Constants.HTTP_PROTOCOL)
      || _endpoint.startsWith(Constants.HTTPS_PROTOCOL))
      _endpoint
    else {
      if (isSSL)
        Constants.HTTPS_PROTOCOL + _endpoint
      else
        Constants.HTTP_PROTOCOL + _endpoint
    }
  }
}