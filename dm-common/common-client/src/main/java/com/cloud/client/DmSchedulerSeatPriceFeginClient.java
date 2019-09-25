package com.cloud.client;

import com.cloud.model.DmSchedulerSeatPrice;
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
@FeignClient(name = "scheduler-provide",  fallbackFactory = DmSchedulerSeatPriceFactoryFallBack.class)
public interface DmSchedulerSeatPriceFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmSchedulerSeatPriceById",method = RequestMethod.POST)
    public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmSchedulerSeatPrice",method = RequestMethod.POST)
    public JSONResult addDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmSchedulerSeatPrice",method = RequestMethod.POST)
    public List<DmSchedulerSeatPrice> findDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmSchedulerSeatPrice",method = RequestMethod.POST)
    public JSONResult updateDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;


}

@Component
class  DmSchedulerSeatPriceFactoryFallBack implements FallbackFactory<DmSchedulerSeatPriceFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmSchedulerSeatPriceFeginClient.class);
    @Override
    public DmSchedulerSeatPriceFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmSchedulerSeatPriceFeginClient() {

            @Override
            public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(@RequestParam("Id") Long Id)throws Exception{
                DmSchedulerSeatPrice dmSchedulerSeatPrice = new DmSchedulerSeatPrice();
                return dmSchedulerSeatPrice;
            }

            @Override
            public JSONResult addDmSchedulerSeatPrice( DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmSchedulerSeatPrice( DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
                return null;
            }

            @Override
            public List<DmSchedulerSeatPrice> findDmSchedulerSeatPrice( DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
                return new ArrayList<DmSchedulerSeatPrice>();
            }


        };
    }
}