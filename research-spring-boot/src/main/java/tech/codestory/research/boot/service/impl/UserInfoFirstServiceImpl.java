package tech.codestory.research.boot.service.impl;

import org.springframework.stereotype.Service;
import tech.codestory.research.boot.model.UserInfo;
import tech.codestory.research.boot.service.UserInfoFirstService;

/**
 * 没有添加其他注解的实现类
 *
 * @author javacodestory@gmail.com
 */
@Service
public class UserInfoFirstServiceImpl implements UserInfoFirstService {
    /**
     * 获取一个用户信息
     *
     * @param account
     * @return
     */
    @Override
    public UserInfo getUserInfo(String account) {
        return null;
    }
}
