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
public class Course implements Serializable{

        /**
        *
        *
        **/
        private Integer cid;
        public void setCid(Integer cid ){
            this.cid = cid;
        }
        public Integer getCid(){
            return this.cid;
        }
        /**
        *
        *
        **/
        private String cname;
        public void setCname(String cname ){
            this.cname = cname;
        }
        public String getCname(){
            return this.cname;
        }
        /**
        *
        *
        **/
        private Integer teacherId;
        public void setTeacherId(Integer teacherId ){
            this.teacherId = teacherId;
        }
        public Integer getTeacherId(){
            return this.teacherId;
        }

}
