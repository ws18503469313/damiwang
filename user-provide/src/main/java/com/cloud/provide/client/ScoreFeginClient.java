package com.cloud.provide.client;

import com.cloud.provide.model.Score;

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
@FeignClient(name = "",  fallbackFactory = ScoreFactoryFallBack.class)
public interface ScoreFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getScoreById",method = RequestMethod.POST)
    public Score getScoreById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addScore",method = RequestMethod.POST)
    public JSONResult addScore(@RequestBody Score score)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findScore",method = RequestMethod.POST)
    public List<Score> findScore(@RequestBody Score score)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateScore",method = RequestMethod.POST)
    public JSONResult updateScore(@RequestBody Score score)throws Exception;


}
@Component
class  ScoreFactoryFallBack implements FallbackFactory<ScoreFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(ScoreFeginClient.class);
    @Override
    public ScoreFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new ScoreFeginClient() {

            @Override
            public Score getScoreById(@RequestParam("Id") Long Id)throws Exception{
                Score score = new Score();
                return score;
            }

            @Override
            public JSONResult addScore( Score score)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateScore( Score score)throws Exception{
                return null;
            }

            @Override
            public List<Score> findScore( Score score)throws Exception{
                return new ArrayList<Score>();
            }


        };
    }
}