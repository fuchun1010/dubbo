package com.pagoda.order.center;

import com.pagoda.order.center.annotation.Comment;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tank198435163.com
 */
@Comment("订单管理中心入口")
@DubboComponentScan
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
