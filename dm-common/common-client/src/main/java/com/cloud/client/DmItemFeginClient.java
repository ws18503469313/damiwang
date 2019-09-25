package com.cloud.client;

import com.cloud.model.DmItem;
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
@FeignClient(name = "item-provide",  fallbackFactory = DmItemFactoryFallBack.class)
public interface DmItemFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmItemById",method = RequestMethod.POST)
    public DmItem getDmItemById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmItem",method = RequestMethod.POST)
    public JSONResult addDmItem(@RequestBody DmItem dmItem)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmItem",method = RequestMethod.POST)
    public List<DmItem> findDmItem(@RequestBody DmItem dmItem)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmItem",method = RequestMethod.POST)
    public JSONResult updateDmItem(@RequestBody DmItem dmItem)throws Exception;


}

@Component
class  DmItemFactoryFallBack implements FallbackFactory<DmItemFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmItemFeginClient.class);
    @Override
    public DmItemFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmItemFeginClient() {

            @Override
            public DmItem getDmItemById(@RequestParam("Id") Long Id)throws Exception{
                DmItem dmItem = new DmItem();
                return dmItem;
            }

            @Override
            public JSONResult addDmItem( DmItem dmItem)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmItem( DmItem dmItem)throws Exception{
                return null;
            }

            @Override
            public List<DmItem> findDmItem( DmItem dmItem)throws Exception{
                return new ArrayList<DmItem>();
            }


        };
    }
}