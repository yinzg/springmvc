package com.xy.daodev;

import com.xy.model.User2;

/**
 * Created by helloworld on 2015/1/30.
 */
public interface User2Mapper {

    int insert(User2 user2);

    User2 select(String name);
}
