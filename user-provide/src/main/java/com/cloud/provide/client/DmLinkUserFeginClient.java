package com.cloud.provide.client;

import com.cloud.provide.model.DmLinkUser;

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
@FeignClient(name = "",  fallbackFactory = DmLinkUserFactoryFallBack.class)
public interface DmLinkUserFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getDmLinkUserById",method = RequestMethod.POST)
    public DmLinkUser getDmLinkUserById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addDmLinkUser",method = RequestMethod.POST)
    public JSONResult addDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findDmLinkUser",method = RequestMethod.POST)
    public List<DmLinkUser> findDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateDmLinkUser",method = RequestMethod.POST)
    public JSONResult updateDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception;


}
@Component
class  DmLinkUserFactoryFallBack implements FallbackFactory<DmLinkUserFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmLinkUserFeginClient.class);
    @Override
    public DmLinkUserFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmLinkUserFeginClient() {

            @Override
            public DmLinkUser getDmLinkUserById(@RequestParam("Id") Long Id)throws Exception{
                DmLinkUser dmLinkUser = new DmLinkUser();
                return dmLinkUser;
            }

            @Override
            public JSONResult addDmLinkUser( DmLinkUser dmLinkUser)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmLinkUser( DmLinkUser dmLinkUser)throws Exception{
                return null;
            }

            @Override
            public List<DmLinkUser> findDmLinkUser( DmLinkUser dmLinkUser)throws Exception{
                return new ArrayList<DmLinkUser>();
            }


        };
    }
}