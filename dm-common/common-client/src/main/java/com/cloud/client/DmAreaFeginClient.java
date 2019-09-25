package com.cloud.client;

import com.cloud.model.DmArea;
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
@FeignClient(name = "area-provide",  fallbackFactory = DmAreaFactoryFallBack.class)
public interface DmAreaFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmAreaById",method = RequestMethod.POST)
    public DmArea getDmAreaById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmArea",method = RequestMethod.POST)
    public JSONResult addDmArea(@RequestBody DmArea dmArea)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmArea",method = RequestMethod.POST)
    public List<DmArea> findDmArea(@RequestBody DmArea dmArea)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmArea",method = RequestMethod.POST)
    public JSONResult updateDmArea(@RequestBody DmArea dmArea)throws Exception;


}

@Component
class  DmAreaFactoryFallBack implements FallbackFactory<DmAreaFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmAreaFeginClient.class);
    @Override
    public DmAreaFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmAreaFeginClient() {

            @Override
            public DmArea getDmAreaById(@RequestParam("Id") Long Id)throws Exception{
                DmArea dmArea = new DmArea();
                return dmArea;
            }

            @Override
            public JSONResult addDmArea( DmArea dmArea)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmArea( DmArea dmArea)throws Exception{
                return null;
            }

            @Override
            public List<DmArea> findDmArea( DmArea dmArea)throws Exception{
                return new ArrayList<DmArea>();
            }


        };
    }
}