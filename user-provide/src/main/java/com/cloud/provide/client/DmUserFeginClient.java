package com.cloud.provide.client;

import com.cloud.provide.model.DmUser;

import java.util.ArrayList;
import java.util.List;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import com.cloud.util.JSONResult;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-10-18
*/
@FeignClient(name = "",  fallbackFactory = DmUserFactoryFallBack.class)
public interface DmUserFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getDmUserById",method = RequestMethod.POST)
    public DmUser getDmUserById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addDmUser",method = RequestMethod.POST)
    public JSONResult addDmUser(@RequestBody DmUser dmUser)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findDmUser",method = RequestMethod.POST)
    public List<DmUser> findDmUser(@RequestBody DmUser dmUser)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateDmUser",method = RequestMethod.POST)
    public JSONResult updateDmUser(@RequestBody DmUser dmUser)throws Exception;


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


        };
    }
}