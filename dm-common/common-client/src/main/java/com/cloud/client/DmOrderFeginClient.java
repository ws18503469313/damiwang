package com.cloud.client;

import com.cloud.model.DmOrder;
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
@FeignClient(name = "order-provide",  fallbackFactory = DmOrderFactoryFallBack.class)
public interface DmOrderFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmOrderById",method = RequestMethod.POST)
    public DmOrder getDmOrderById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmOrder",method = RequestMethod.POST)
    public JSONResult addDmOrder(@RequestBody DmOrder dmOrder)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmOrder",method = RequestMethod.POST)
    public List<DmOrder> findDmOrder(@RequestBody DmOrder dmOrder)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmOrder",method = RequestMethod.POST)
    public JSONResult updateDmOrder(@RequestBody DmOrder dmOrder)throws Exception;


}

@Component
class  DmOrderFactoryFallBack implements FallbackFactory<DmOrderFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmOrderFeginClient.class);
    @Override
    public DmOrderFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmOrderFeginClient() {

            @Override
            public DmOrder getDmOrderById(@RequestParam("Id") Long Id)throws Exception{
                DmOrder dmOrder = new DmOrder();
                return dmOrder;
            }

            @Override
            public JSONResult addDmOrder( DmOrder dmOrder)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmOrder( DmOrder dmOrder)throws Exception{
                return null;
            }

            @Override
            public List<DmOrder> findDmOrder( DmOrder dmOrder)throws Exception{
                return new ArrayList<DmOrder>();
            }


        };
    }
}