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
public class Student implements Serializable{

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
        private String sname;
        public void setSname(String sname ){
            this.sname = sname;
        }
        public String getSname(){
            return this.sname;
        }
        /**
        *
        *
        **/
        private String gender;
        public void setGender(String gender ){
            this.gender = gender;
        }
        public String getGender(){
            return this.gender;
        }
        /**
        *
        *
        **/
        private Integer classId;
        public void setClassId(Integer classId ){
            this.classId = classId;
        }
        public Integer getClassId(){
            return this.classId;
        }

}
