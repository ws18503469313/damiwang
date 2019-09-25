package com.cloud.client;

import com.cloud.model.DmTrade;
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
@FeignClient(name = "pay-provide",  fallbackFactory = DmTradeFactoryFallBack.class)
public interface DmTradeFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmTradeById",method = RequestMethod.POST)
    public DmTrade getDmTradeById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmTrade",method = RequestMethod.POST)
    public JSONResult addDmTrade(@RequestBody DmTrade dmTrade)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmTrade",method = RequestMethod.POST)
    public List<DmTrade> findDmTrade(@RequestBody DmTrade dmTrade)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmTrade",method = RequestMethod.POST)
    public JSONResult updateDmTrade(@RequestBody DmTrade dmTrade)throws Exception;


}

@Component
class  DmTradeFactoryFallBack implements FallbackFactory<DmTradeFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmTradeFeginClient.class);
    @Override
    public DmTradeFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmTradeFeginClient() {

            @Override
            public DmTrade getDmTradeById(@RequestParam("Id") Long Id)throws Exception{
                DmTrade dmTrade = new DmTrade();
                return dmTrade;
            }

            @Override
            public JSONResult addDmTrade( DmTrade dmTrade)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmTrade( DmTrade dmTrade)throws Exception{
                return null;
            }

            @Override
            public List<DmTrade> findDmTrade( DmTrade dmTrade)throws Exception{
                return new ArrayList<DmTrade>();
            }


        };
    }
}