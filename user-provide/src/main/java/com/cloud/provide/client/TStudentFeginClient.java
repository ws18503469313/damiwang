package com.cloud.provide.client;

import com.cloud.provide.model.TStudent;

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
@FeignClient(name = "",  fallbackFactory = TStudentFactoryFallBack.class)
public interface TStudentFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getTStudentById",method = RequestMethod.POST)
    public TStudent getTStudentById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addTStudent",method = RequestMethod.POST)
    public JSONResult addTStudent(@RequestBody TStudent tStudent)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findTStudent",method = RequestMethod.POST)
    public List<TStudent> findTStudent(@RequestBody TStudent tStudent)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateTStudent",method = RequestMethod.POST)
    public JSONResult updateTStudent(@RequestBody TStudent tStudent)throws Exception;


}
@Component
class  TStudentFactoryFallBack implements FallbackFactory<TStudentFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(TStudentFeginClient.class);
    @Override
    public TStudentFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new TStudentFeginClient() {

            @Override
            public TStudent getTStudentById(@RequestParam("Id") Long Id)throws Exception{
                TStudent tStudent = new TStudent();
                return tStudent;
            }

            @Override
            public JSONResult addTStudent( TStudent tStudent)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateTStudent( TStudent tStudent)throws Exception{
                return null;
            }

            @Override
            public List<TStudent> findTStudent( TStudent tStudent)throws Exception{
                return new ArrayList<TStudent>();
            }


        };
    }
}