package com.cloud.provide.client;

import com.cloud.provide.model.Teacher;

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
@FeignClient(name = "",  fallbackFactory = TeacherFactoryFallBack.class)
public interface TeacherFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getTeacherById",method = RequestMethod.POST)
    public Teacher getTeacherById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public JSONResult addTeacher(@RequestBody Teacher teacher)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findTeacher",method = RequestMethod.POST)
    public List<Teacher> findTeacher(@RequestBody Teacher teacher)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateTeacher",method = RequestMethod.POST)
    public JSONResult updateTeacher(@RequestBody Teacher teacher)throws Exception;


}
@Component
class  TeacherFactoryFallBack implements FallbackFactory<TeacherFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(TeacherFeginClient.class);
    @Override
    public TeacherFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new TeacherFeginClient() {

            @Override
            public Teacher getTeacherById(@RequestParam("Id") Long Id)throws Exception{
                Teacher teacher = new Teacher();
                return teacher;
            }

            @Override
            public JSONResult addTeacher( Teacher teacher)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateTeacher( Teacher teacher)throws Exception{
                return null;
            }

            @Override
            public List<Teacher> findTeacher( Teacher teacher)throws Exception{
                return new ArrayList<Teacher>();
            }


        };
    }
}