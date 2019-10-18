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
public class Teacher implements Serializable{

        /**
        *
        *
        **/
        private Integer tid;
        public void setTid(Integer tid ){
            this.tid = tid;
        }
        public Integer getTid(){
            return this.tid;
        }
        /**
        *
        *
        **/
        private String tname;
        public void setTname(String tname ){
            this.tname = tname;
        }
        public String getTname(){
            return this.tname;
        }

}
