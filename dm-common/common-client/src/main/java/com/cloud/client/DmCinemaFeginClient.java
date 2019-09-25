package com.cloud.client;

import com.cloud.model.DmCinema;
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
@FeignClient(name = "item-provide",  fallbackFactory = DmCinemaFactoryFallBack.class)
public interface DmCinemaFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmCinemaById",method = RequestMethod.POST)
    public DmCinema getDmCinemaById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmCinema",method = RequestMethod.POST)
    public JSONResult addDmCinema(@RequestBody DmCinema dmCinema)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmCinema",method = RequestMethod.POST)
    public List<DmCinema> findDmCinema(@RequestBody DmCinema dmCinema)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmCinema",method = RequestMethod.POST)
    public JSONResult updateDmCinema(@RequestBody DmCinema dmCinema)throws Exception;


}

@Component
class  DmCinemaFactoryFallBack implements FallbackFactory<DmCinemaFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmCinemaFeginClient.class);
    @Override
    public DmCinemaFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmCinemaFeginClient() {

            @Override
            public DmCinema getDmCinemaById(@RequestParam("Id") Long Id)throws Exception{
                DmCinema dmCinema = new DmCinema();
                return dmCinema;
            }

            @Override
            public JSONResult addDmCinema( DmCinema dmCinema)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmCinema( DmCinema dmCinema)throws Exception{
                return null;
            }

            @Override
            public List<DmCinema> findDmCinema( DmCinema dmCinema)throws Exception{
                return new ArrayList<DmCinema>();
            }


        };
    }
}