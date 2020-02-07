package com.cloud.provide.client;

import com.cloud.provide.model.TGrade;

import java.util.ArrayList;
import java.util.List;

import com.cloud.utils.JSONResult;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-10-18
*/
@FeignClient(name = "",  fallbackFactory = TGradeFactoryFallBack.class)
public interface TGradeFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getTGradeById",method = RequestMethod.POST)
    public TGrade getTGradeById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addTGrade",method = RequestMethod.POST)
    public JSONResult addTGrade(@RequestBody TGrade tGrade)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findTGrade",method = RequestMethod.POST)
    public List<TGrade> findTGrade(@RequestBody TGrade tGrade)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateTGrade",method = RequestMethod.POST)
    public JSONResult updateTGrade(@RequestBody TGrade tGrade)throws Exception;


}
@Component
class  TGradeFactoryFallBack implements FallbackFactory<TGradeFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(TGradeFeginClient.class);
    @Override
    public TGradeFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new TGradeFeginClient() {

            @Override
            public TGrade getTGradeById(@RequestParam("Id") Long Id)throws Exception{
                TGrade tGrade = new TGrade();
                return tGrade;
            }

            @Override
            public JSONResult addTGrade( TGrade tGrade)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateTGrade( TGrade tGrade)throws Exception{
                return null;
            }

            @Override
            public List<TGrade> findTGrade( TGrade tGrade)throws Exception{
                return new ArrayList<TGrade>();
            }


        };
    }
}