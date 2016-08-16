package com.xy.dao;

import com.xy.model.User1;

/**
 * Created by helloworld on 2015/1/30.
 */
public interface User1Mapper {

    int insert(User1 user1);

    User1 select(String name);

}
