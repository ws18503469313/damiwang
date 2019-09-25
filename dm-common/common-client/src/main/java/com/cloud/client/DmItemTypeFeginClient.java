package com.cloud.client;

import com.cloud.model.DmItemType;
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
@FeignClient(name = "item-provide",  fallbackFactory = DmItemTypeFactoryFallBack.class)
public interface DmItemTypeFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmItemTypeById",method = RequestMethod.POST)
    public DmItemType getDmItemTypeById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmItemType",method = RequestMethod.POST)
    public JSONResult addDmItemType(@RequestBody DmItemType dmItemType)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmItemType",method = RequestMethod.POST)
    public List<DmItemType> findDmItemType(@RequestBody DmItemType dmItemType)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmItemType",method = RequestMethod.POST)
    public JSONResult updateDmItemType(@RequestBody DmItemType dmItemType)throws Exception;


}

@Component
class  DmItemTypeFactoryFallBack implements FallbackFactory<DmItemTypeFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmItemTypeFeginClient.class);
    @Override
    public DmItemTypeFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmItemTypeFeginClient() {

            @Override
            public DmItemType getDmItemTypeById(@RequestParam("Id") Long Id)throws Exception{
                DmItemType dmItemType = new DmItemType();
                return dmItemType;
            }

            @Override
            public JSONResult addDmItemType( DmItemType dmItemType)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmItemType( DmItemType dmItemType)throws Exception{
                return null;
            }

            @Override
            public List<DmItemType> findDmItemType( DmItemType dmItemType)throws Exception{
                return new ArrayList<DmItemType>();
            }


        };
    }
}