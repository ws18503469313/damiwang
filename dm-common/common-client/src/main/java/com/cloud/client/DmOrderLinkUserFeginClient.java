package com.cloud.client;

import com.cloud.model.DmOrderLinkUser;
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
@FeignClient(name = "order-provide",  fallbackFactory = DmOrderLinkUserFactoryFallBack.class)
public interface DmOrderLinkUserFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmOrderLinkUserById",method = RequestMethod.POST)
    public DmOrderLinkUser getDmOrderLinkUserById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmOrderLinkUser",method = RequestMethod.POST)
    public JSONResult addDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmOrderLinkUser",method = RequestMethod.POST)
    public List<DmOrderLinkUser> findDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmOrderLinkUser",method = RequestMethod.POST)
    public JSONResult updateDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception;


}

@Component
class  DmOrderLinkUserFactoryFallBack implements FallbackFactory<DmOrderLinkUserFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmOrderLinkUserFeginClient.class);
    @Override
    public DmOrderLinkUserFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmOrderLinkUserFeginClient() {

            @Override
            public DmOrderLinkUser getDmOrderLinkUserById(@RequestParam("Id") Long Id)throws Exception{
                DmOrderLinkUser dmOrderLinkUser = new DmOrderLinkUser();
                return dmOrderLinkUser;
            }

            @Override
            public JSONResult addDmOrderLinkUser( DmOrderLinkUser dmOrderLinkUser)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmOrderLinkUser( DmOrderLinkUser dmOrderLinkUser)throws Exception{
                return null;
            }

            @Override
            public List<DmOrderLinkUser> findDmOrderLinkUser( DmOrderLinkUser dmOrderLinkUser)throws Exception{
                return new ArrayList<DmOrderLinkUser>();
            }


        };
    }
}