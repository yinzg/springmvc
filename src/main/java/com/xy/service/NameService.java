package com.xy.service;

import com.xy.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xy.dao.User1Mapper;
import com.xy.model.User2;
import com.xy.daodev.User2Mapper;

/**
 * Created by helloworld on 2015/1/30.
 */
@Service("nameService")
public class NameService {

    @Autowired
    User1Mapper user1Mapper;
    @Autowired
    User2Mapper user2Mapper;

    public void addQa(User1 user1) {
        user1Mapper.insert(user1);
    }

    public void addDev(User2 user2) {
        user2Mapper.insert(user2);
    }

    public Long getName(String name1, String name2) {
        User1 user1 = user1Mapper.select(name1);
        User2 user2 = user2Mapper.select(name2);
        Long count = user1.getId() + user2.getId();
        return count;
    }

}
