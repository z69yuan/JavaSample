package org.example.user;


import com.google.auto.service.AutoService;

@AutoService(IUserInfo.class)
public class UserInfoImpl implements IUserInfo{
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
