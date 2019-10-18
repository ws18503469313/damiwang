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
public class TGrade implements Serializable{

        /**
        *
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
        *
        *
        **/
        private String gname;
        public void setGname(String gname ){
            this.gname = gname;
        }
        public String getGname(){
            return this.gname;
        }

}
