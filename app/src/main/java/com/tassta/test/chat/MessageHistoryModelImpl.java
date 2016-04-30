package com.tassta.test.chat;

import java.util.HashMap;

/**
 * Created by MANKHAIR on 2016-04-30.
 */
public class  MessageHistoryModelImpl implements MessageHistoryModel {

    private static HashMap<User,MessageHistory> map = new HashMap<User,MessageHistory>();



    @Override
    public MessageHistory getMessageHistory(User user) {
        return map.get(user);
    }
}
