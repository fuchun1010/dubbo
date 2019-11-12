package com.pagoda.order.center.entity;

import com.pagoda.order.center.annotation.Comment;
import lombok.Data;

import java.io.Serializable;

/**
 * @author tank198435163.com
 */
@Data
@Comment("用户")
public class User implements Serializable {

  private String username;

}
