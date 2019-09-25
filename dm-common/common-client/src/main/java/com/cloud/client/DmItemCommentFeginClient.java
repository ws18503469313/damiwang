package com.cloud.client;

import com.cloud.model.DmItemComment;
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
@FeignClient(name = "item-provide",  fallbackFactory = DmItemCommentFactoryFallBack.class)
public interface DmItemCommentFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmItemCommentById",method = RequestMethod.POST)
    public DmItemComment getDmItemCommentById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmItemComment",method = RequestMethod.POST)
    public JSONResult addDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmItemComment",method = RequestMethod.POST)
    public List<DmItemComment> findDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmItemComment",method = RequestMethod.POST)
    public JSONResult updateDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;


}

@Component
class  DmItemCommentFactoryFallBack implements FallbackFactory<DmItemCommentFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmItemCommentFeginClient.class);
    @Override
    public DmItemCommentFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmItemCommentFeginClient() {

            @Override
            public DmItemComment getDmItemCommentById(@RequestParam("Id") Long Id)throws Exception{
                DmItemComment dmItemComment = new DmItemComment();
                return dmItemComment;
            }

            @Override
            public JSONResult addDmItemComment( DmItemComment dmItemComment)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmItemComment( DmItemComment dmItemComment)throws Exception{
                return null;
            }

            @Override
            public List<DmItemComment> findDmItemComment( DmItemComment dmItemComment)throws Exception{
                return new ArrayList<DmItemComment>();
            }


        };
    }
}