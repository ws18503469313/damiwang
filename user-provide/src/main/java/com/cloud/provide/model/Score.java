package com.cloud.provide.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
*  auto genetated
* @author polunzi
* @Date: 2019-10-18
*/
public class Score implements Serializable{

        /**
        *
        *
        **/
        private Integer sid;
        public void setSid(Integer sid ){
            this.sid = sid;
        }
        public Integer getSid(){
            return this.sid;
        }
        /**
        *
        *
        **/
        private Integer studentId;
        public void setStudentId(Integer studentId ){
            this.studentId = studentId;
        }
        public Integer getStudentId(){
            return this.studentId;
        }
        /**
        *
        *
        **/
        private Integer courseId;
        public void setCourseId(Integer courseId ){
            this.courseId = courseId;
        }
        public Integer getCourseId(){
            return this.courseId;
        }
        /**
        *
        *
        **/
        private Integer number;
        public void setNumber(Integer number ){
            this.number = number;
        }
        public Integer getNumber(){
            return this.number;
        }

}
