package com.tassta.test.chat;

/**
 * Created by MANKHAIR on 2016-04-30.
 */
public class UserImpl implements User {

    private int id;
    private String userName;
    private boolean status;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isOnline() {
        return this.status;
    }

    @Override
    public String getName() {
        return this.userName;
    }




    public void setId(int id) {
        this.id=id;
    }


    public void setSatus(boolean status) {
        this.status = status;
    }


    public void setName(String name) {
        this.userName=name;
    }
}
