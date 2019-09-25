package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmUser implements Serializable{

        /**
        *主键
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
        *手机号
        *
        **/
        private String phone;
        public void setPhone(String phone ){
            this.phone = phone;
        }
        public String getPhone(){
            return this.phone;
        }
        /**
        *密码
        *
        **/
        private String password;
        public void setPassword(String password ){
            this.password = password;
        }
        public String getPassword(){
            return this.password;
        }
        /**
        *
        *
        **/
        private String wxuserid;
        public void setWxuserid(String wxuserid ){
            this.wxuserid = wxuserid;
        }
        public String getWxuserid(){
            return this.wxuserid;
        }
        /**
        *真实姓名
        *
        **/
        private String realname;
        public void setRealname(String realname ){
            this.realname = realname;
        }
        public String getRealname(){
            return this.realname;
        }
        /**
        *昵称
        *
        **/
        private String nickname;
        public void setNickname(String nickname ){
            this.nickname = nickname;
        }
        public String getNickname(){
            return this.nickname;
        }
        /**
        *性别(0:男,1:女)
        *
        **/
        private Integer sex;
        public void setSex(Integer sex ){
            this.sex = sex;
        }
        public Integer getSex(){
            return this.sex;
        }
        /**
        *兴趣爱好
        *
        **/
        private String hobby;
        public void setHobby(String hobby ){
            this.hobby = hobby;
        }
        public String getHobby(){
            return this.hobby;
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
        *生日
        *
        **/
        private Date birthday;
        public void setBirthday(Date birthday ){
            this.birthday = birthday;
        }
        public Date getBirthday(){
            return this.birthday;
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
