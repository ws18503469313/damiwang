package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmArea implements Serializable{

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
        *区域名称
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
        *父级区域
        *
        **/
        private String parent;
        public void setParent(String parent ){
            this.parent = parent;
        }
        public String getParent(){
            return this.parent;
        }
        /**
        *分类级别;select;(0:全国,1:1级,2:2级)
        *
        **/
        private Integer level;
        public void setLevel(Integer level ){
            this.level = level;
        }
        public Integer getLevel(){
            return this.level;
        }
        /**
        *是否是热门城市(0:不是,1:是)
        *
        **/
        private Integer ishot;
        public void setIshot(Integer ishot ){
            this.ishot = ishot;
        }
        public Integer getIshot(){
            return this.ishot;
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
        *更新时间
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
