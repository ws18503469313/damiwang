package com.cloud.consumer.service;

import com.cloud.consumer.service.impl.UserFeginClientFallback;
import com.cloud.model.User;
import com.cloud.util.JSONResult;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-provide", /*fallback = UserFeginClientFallback.class*/ fallbackFactory = HystrixFactoryFallBack.class)
public interface UserFeginClient {

    @RequestMapping(value = "test/findById/{id}")
    public User getById(@PathVariable(value = "id")String id);

    @RequestMapping(value = "/main/ajaxLogin", method = RequestMethod.POST)
    public JSONResult ajaxLogin(@RequestBody User user);
}
@Component
class  HystrixFactoryFallBack implements FallbackFactory<UserFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(UserFeginClientFallback.class);
    @Override
    public UserFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new UserFeginClient() {

            @Override
            public User getById(String id) {
                User user = new User();
                user.setId("failed");
                return user;
            }

            @Override
            public JSONResult ajaxLogin(User user) {
                return null;
            }
        };
    }

}