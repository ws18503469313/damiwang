package com.cloud.client;

import com.cloud.model.DmScheduler;
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
@FeignClient(name = "scheduler-provide",  fallbackFactory = DmSchedulerFactoryFallBack.class)
public interface DmSchedulerFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmSchedulerById",method = RequestMethod.POST)
    public DmScheduler getDmSchedulerById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmScheduler",method = RequestMethod.POST)
    public JSONResult addDmScheduler(@RequestBody DmScheduler dmScheduler)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmScheduler",method = RequestMethod.POST)
    public List<DmScheduler> findDmScheduler(@RequestBody DmScheduler dmScheduler)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmScheduler",method = RequestMethod.POST)
    public JSONResult updateDmScheduler(@RequestBody DmScheduler dmScheduler)throws Exception;


}

@Component
class  DmSchedulerFactoryFallBack implements FallbackFactory<DmSchedulerFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmSchedulerFeginClient.class);
    @Override
    public DmSchedulerFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmSchedulerFeginClient() {

            @Override
            public DmScheduler getDmSchedulerById(@RequestParam("Id") Long Id)throws Exception{
                DmScheduler dmScheduler = new DmScheduler();
                return dmScheduler;
            }

            @Override
            public JSONResult addDmScheduler( DmScheduler dmScheduler)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmScheduler( DmScheduler dmScheduler)throws Exception{
                return null;
            }

            @Override
            public List<DmScheduler> findDmScheduler( DmScheduler dmScheduler)throws Exception{
                return new ArrayList<DmScheduler>();
            }


        };
    }
}