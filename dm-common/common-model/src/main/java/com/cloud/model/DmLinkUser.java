package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmLinkUser implements Serializable{

        /**
        *
        *
        **/
        private Integer id;
        public void setId(Integer id ){
            this.id = id;
        }
        public Integer getId(){
            return this.id;
        }
        /**
        *对应用户表的主键
        *
        **/
        private Integer userid;
        public void setUserid(Integer userid ){
            this.userid = userid;
        }
        public Integer getUserid(){
            return this.userid;
        }
        /**
        *联系人姓名
        *
        **/
        private String name;
        public void setName(String name ){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        /**
        *身份证号
        *
        **/
        private String idcard;
        public void setIdcard(String idcard ){
            this.idcard = idcard;
        }
        public String getIdcard(){
            return this.idcard;
        }
        /**
        *证件类型(0:身份证 1:护照)
        *
        **/
        private Integer cardtype;
        public void setCardtype(Integer cardtype ){
            this.cardtype = cardtype;
        }
        public Integer getCardtype(){
            return this.cardtype;
        }
        /**
        *创建时间
        *
        **/
        private Date createdtime;
        public void setCreatedtime(Date createdtime ){
            this.createdtime = createdtime;
        }
        public Date getCreatedtime(){
            return this.createdtime;
        }
        /**
        *修改时间
        *
        **/
        private Date updatedtime;
        public void setUpdatedtime(Date updatedtime ){
            this.updatedtime = updatedtime;
        }
        public Date getUpdatedtime(){
            return this.updatedtime;
        }

}
