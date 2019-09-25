package com.cloud.client;

import com.cloud.model.DmSchedulerSeat;
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
@FeignClient(name = "scheduler-provide",  fallbackFactory = DmSchedulerSeatFactoryFallBack.class)
public interface DmSchedulerSeatFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmSchedulerSeatById",method = RequestMethod.POST)
    public DmSchedulerSeat getDmSchedulerSeatById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmSchedulerSeat",method = RequestMethod.POST)
    public JSONResult addDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmSchedulerSeat",method = RequestMethod.POST)
    public List<DmSchedulerSeat> findDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmSchedulerSeat",method = RequestMethod.POST)
    public JSONResult updateDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;


}

@Component
class  DmSchedulerSeatFactoryFallBack implements FallbackFactory<DmSchedulerSeatFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmSchedulerSeatFeginClient.class);
    @Override
    public DmSchedulerSeatFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmSchedulerSeatFeginClient() {

            @Override
            public DmSchedulerSeat getDmSchedulerSeatById(@RequestParam("Id") Long Id)throws Exception{
                DmSchedulerSeat dmSchedulerSeat = new DmSchedulerSeat();
                return dmSchedulerSeat;
            }

            @Override
            public JSONResult addDmSchedulerSeat( DmSchedulerSeat dmSchedulerSeat)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmSchedulerSeat( DmSchedulerSeat dmSchedulerSeat)throws Exception{
                return null;
            }

            @Override
            public List<DmSchedulerSeat> findDmSchedulerSeat( DmSchedulerSeat dmSchedulerSeat)throws Exception{
                return new ArrayList<DmSchedulerSeat>();
            }


        };
    }
}