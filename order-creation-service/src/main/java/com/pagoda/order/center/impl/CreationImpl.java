package com.pagoda.order.center.impl;

import com.pagoda.order.center.entity.User;
import com.pagoda.order.center.service.ICreate;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author tank198435163.com
 */
@Component
@Service(interfaceClass = ICreate.class, timeout = 500)
public class CreationImpl implements ICreate {

  @Override
  public void createOrder(User user) {
    System.out.println(String.format("user name is:[%s]", user.getUsername()));
  }

}
