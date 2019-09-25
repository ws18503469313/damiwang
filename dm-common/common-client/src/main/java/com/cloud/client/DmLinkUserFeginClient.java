package com.cloud.client;

import com.cloud.model.DmLinkUser;
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
@FeignClient(name = "user-provide",  fallbackFactory = DmLinkUserFactoryFallBack.class)
public interface DmLinkUserFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmLinkUserById",method = RequestMethod.POST)
    public DmLinkUser getDmLinkUserById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmLinkUser",method = RequestMethod.POST)
    public JSONResult addDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmLinkUser",method = RequestMethod.POST)
    public List<DmLinkUser> findDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
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