package com.cloud.client;

import com.cloud.model.DmKeywordSort;
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
@FeignClient(name = "base-provide",  fallbackFactory = DmKeywordSortFactoryFallBack.class)
public interface DmKeywordSortFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/getDmKeywordSortById",method = RequestMethod.POST)
    public DmKeywordSort getDmKeywordSortById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/addDmKeywordSort",method = RequestMethod.POST)
    public JSONResult addDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/findDmKeywordSort",method = RequestMethod.POST)
    public List<DmKeywordSort> findDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-09-25
    */
    @RequestMapping(value = "/updateDmKeywordSort",method = RequestMethod.POST)
    public JSONResult updateDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception;


}

@Component
class  DmKeywordSortFactoryFallBack implements FallbackFactory<DmKeywordSortFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(DmKeywordSortFeginClient.class);
    @Override
    public DmKeywordSortFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new DmKeywordSortFeginClient() {

            @Override
            public DmKeywordSort getDmKeywordSortById(@RequestParam("Id") Long Id)throws Exception{
                DmKeywordSort dmKeywordSort = new DmKeywordSort();
                return dmKeywordSort;
            }

            @Override
            public JSONResult addDmKeywordSort( DmKeywordSort dmKeywordSort)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateDmKeywordSort( DmKeywordSort dmKeywordSort)throws Exception{
                return null;
            }

            @Override
            public List<DmKeywordSort> findDmKeywordSort( DmKeywordSort dmKeywordSort)throws Exception{
                return new ArrayList<DmKeywordSort>();
            }


        };
    }
}