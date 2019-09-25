package com.cloud.client;

import com.cloud.model.DmUser;
import com.cloud.utils.JSONResult;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
@FeignClient(name = "user-provide",  fallbackFactory = DmUserFactoryFallBack.class)
public interface DmUserFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmUserById",method = RequestMethod.POST)
    public DmUser getDmUserById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmUser",method = RequestMethod.POST)
    public JSONResult addDmUser(@RequestBody DmUser dmUser)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmUser",method = RequestMethod.POST)
    public List<DmUser> findDmUser(@RequestBody DmUser dmUser)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmUser",method = RequestMethod.POST)
    public JSONResult updateDmUser(@RequestBody DmUser dmUser)throws Exception;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONResult login(@RequestBody DmUser dmUser)throws Exception;

}

@Component
class  DmUserFactoryFallBack implements FallbackFactory<DmUserFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmUserFeginClient.class);
    @Override
    public DmUserFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmUserFeginClient() {

            @Override
            public DmUser getDmUserById(@RequestParam("Id") Long Id)throws Exception{
                DmUser dmUser = new DmUser();
                return dmUser;
            }

            @Override
            public JSONResult addDmUser( DmUser dmUser)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmUser( DmUser dmUser)throws Exception{
                return null;
            }

            @Override
            public List<DmUser> findDmUser( DmUser dmUser)throws Exception{
                return new ArrayList<DmUser>();
            }
            @Override
            public JSONResult login(@RequestBody DmUser dmUser)throws Exception{
                return JSONResult.errorMsg("login failed");
            }
        };
    }
}