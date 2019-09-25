package com.cloud.client;

import com.cloud.model.DmCinemaSeat;
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
@FeignClient(name = "item-provide",  fallbackFactory = DmCinemaSeatFactoryFallBack.class)
public interface DmCinemaSeatFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmCinemaSeatById",method = RequestMethod.POST)
    public DmCinemaSeat getDmCinemaSeatById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmCinemaSeat",method = RequestMethod.POST)
    public JSONResult addDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmCinemaSeat",method = RequestMethod.POST)
    public List<DmCinemaSeat> findDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmCinemaSeat",method = RequestMethod.POST)
    public JSONResult updateDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception;


}

@Component
class  DmCinemaSeatFactoryFallBack implements FallbackFactory<DmCinemaSeatFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmCinemaSeatFeginClient.class);
    @Override
    public DmCinemaSeatFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmCinemaSeatFeginClient() {

            @Override
            public DmCinemaSeat getDmCinemaSeatById(@RequestParam("Id") Long Id)throws Exception{
                DmCinemaSeat dmCinemaSeat = new DmCinemaSeat();
                return dmCinemaSeat;
            }

            @Override
            public JSONResult addDmCinemaSeat( DmCinemaSeat dmCinemaSeat)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmCinemaSeat( DmCinemaSeat dmCinemaSeat)throws Exception{
                return null;
            }

            @Override
            public List<DmCinemaSeat> findDmCinemaSeat( DmCinemaSeat dmCinemaSeat)throws Exception{
                return new ArrayList<DmCinemaSeat>();
            }


        };
    }
}