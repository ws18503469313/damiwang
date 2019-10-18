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
public class TStudent implements Serializable{

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
        *年级
        *
        **/
        private Integer gid;
        public void setGid(Integer gid ){
            this.gid = gid;
        }
        public Integer getGid(){
            return this.gid;
        }
        /**
        *分数
        *
        **/
        private Integer score;
        public void setScore(Integer score ){
            this.score = score;
        }
        public Integer getScore(){
            return this.score;
        }

}
