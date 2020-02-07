package com.cloud.provide.client;

import com.cloud.provide.model.Course;

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
@FeignClient(name = "",  fallbackFactory = CourseFactoryFallBack.class)
public interface CourseFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getCourseById",method = RequestMethod.POST)
    public Course getCourseById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addCourse",method = RequestMethod.POST)
    public JSONResult addCourse(@RequestBody Course course)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findCourse",method = RequestMethod.POST)
    public List<Course> findCourse(@RequestBody Course course)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateCourse",method = RequestMethod.POST)
    public JSONResult updateCourse(@RequestBody Course course)throws Exception;


}
@Component
class  CourseFactoryFallBack implements FallbackFactory<CourseFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(CourseFeginClient.class);
    @Override
    public CourseFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new CourseFeginClient() {

            @Override
            public Course getCourseById(@RequestParam("Id") Long Id)throws Exception{
                Course course = new Course();
                return course;
            }

            @Override
            public JSONResult addCourse( Course course)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateCourse( Course course)throws Exception{
                return null;
            }

            @Override
            public List<Course> findCourse( Course course)throws Exception{
                return new ArrayList<Course>();
            }


        };
    }
}