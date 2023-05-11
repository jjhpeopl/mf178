package com.tencent.wxcloudrun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 蜜蜂178处理的控制器
 */
@RestController
@Slf4j
public class MF178Controller {

  @Autowired
  private HttpServletRequest request;

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping(value = "/mf178/receive")
  public String index() {
    log.info("receive wx msg:{}", request.getQueryString());
    String signature = request.getParameter("signature");
    String timestamp = request.getParameter("timestamp");
    String nonce = request.getParameter("nonce");

    return request.getParameter("echostr");
  }

}
