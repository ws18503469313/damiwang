package com.cloud.provide.client;

import com.cloud.provide.model.Class;

import java.util.ArrayList;
import java.util.List;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import com.cloud.util.JSONResult;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-10-18
*/
@FeignClient(name = "",  fallbackFactory = ClassFactoryFallBack.class)
public interface ClassFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getClassById",method = RequestMethod.POST)
    public Class getClassById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addClass",method = RequestMethod.POST)
    public JSONResult addClass(@RequestBody Class class)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findClass",method = RequestMethod.POST)
    public List<Class> findClass(@RequestBody Class class)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateClass",method = RequestMethod.POST)
    public JSONResult updateClass(@RequestBody Class class)throws Exception;


}
@Component
class  ClassFactoryFallBack implements FallbackFactory<ClassFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(ClassFeginClient.class);
    @Override
    public ClassFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new ClassFeginClient() {

            @Override
            public Class getClassById(@RequestParam("Id") Long Id)throws Exception{
                Class class = new Class();
                return class;
            }

            @Override
            public JSONResult addClass( Class class)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateClass( Class class)throws Exception{
                return null;
            }

            @Override
            public List<Class> findClass( Class class)throws Exception{
                return new ArrayList<Class>();
            }


        };
    }
}