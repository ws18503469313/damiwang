package com.cloud.client;

import com.cloud.model.DmImage;
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
@FeignClient(name = "base-provide",  fallbackFactory = DmImageFactoryFallBack.class)
public interface DmImageFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmImageById",method = RequestMethod.POST)
    public DmImage getDmImageById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmImage",method = RequestMethod.POST)
    public JSONResult addDmImage(@RequestBody DmImage dmImage)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmImage",method = RequestMethod.POST)
    public List<DmImage> findDmImage(@RequestBody DmImage dmImage)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmImage",method = RequestMethod.POST)
    public JSONResult updateDmImage(@RequestBody DmImage dmImage)throws Exception;


}

@Component
class  DmImageFactoryFallBack implements FallbackFactory<DmImageFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmImageFeginClient.class);
    @Override
    public DmImageFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmImageFeginClient() {

            @Override
            public DmImage getDmImageById(@RequestParam("Id") Long Id)throws Exception{
                DmImage dmImage = new DmImage();
                return dmImage;
            }

            @Override
            public JSONResult addDmImage( DmImage dmImage)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmImage( DmImage dmImage)throws Exception{
                return null;
            }

            @Override
            public List<DmImage> findDmImage( DmImage dmImage)throws Exception{
                return new ArrayList<DmImage>();
            }


        };
    }
}