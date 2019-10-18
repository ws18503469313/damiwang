package com.cloud.provide.client;

import com.cloud.provide.model.Student;

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
@FeignClient(name = "",  fallbackFactory = StudentFactoryFallBack.class)
public interface StudentFeginClient {
    /**
    *   findById
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/getStudentById",method = RequestMethod.POST)
    public Student getStudentById(@RequestParam("Id") Long Id)throws Exception;
    /**
    *   添加
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public JSONResult addStudent(@RequestBody Student student)throws Exception;
    /**
    *   通过条件查找,
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/findStudent",method = RequestMethod.POST)
    public List<Student> findStudent(@RequestBody Student student)throws Exception;
    /**
    *   更新
    * @author polunzi
    * @Date: 2019-10-18
    */
    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public JSONResult updateStudent(@RequestBody Student student)throws Exception;


}
@Component
class  StudentFactoryFallBack implements FallbackFactory<StudentFeginClient> {

    private static final Logger log = LoggerFactory.getLogger(StudentFeginClient.class);
    @Override
    public StudentFeginClient create(Throwable cause) {
        log.info("=====================fallback cause is {}", cause.getMessage());
        return new StudentFeginClient() {

            @Override
            public Student getStudentById(@RequestParam("Id") Long Id)throws Exception{
                Student student = new Student();
                return student;
            }

            @Override
            public JSONResult addStudent( Student student)throws Exception{
                return null;
            }

            @Override
            public JSONResult updateStudent( Student student)throws Exception{
                return null;
            }

            @Override
            public List<Student> findStudent( Student student)throws Exception{
                return new ArrayList<Student>();
            }


        };
    }
}