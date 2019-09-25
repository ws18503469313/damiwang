package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmItemType implements Serializable{

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
        *类型名称
        *
        **/
        private String itemtype;
        public void setItemtype(String itemtype ){
            this.itemtype = itemtype;
        }
        public String getItemtype(){
            return this.itemtype;
        }
        /**
        *分类级别;select;(1:1级,2:2级)
        *
        **/
        private String level;
        public void setLevel(String level ){
            this.level = level;
        }
        public String getLevel(){
            return this.level;
        }
        /**
        *父级类型
        *
        **/
        private Integer parent;
        public void setParent(Integer parent ){
            this.parent = parent;
        }
        public Integer getParent(){
            return this.parent;
        }
        /**
        *类别别名
        *
        **/
        private String aliasname;
        public void setAliasname(String aliasname ){
            this.aliasname = aliasname;
        }
        public String getAliasname(){
            return this.aliasname;
        }
        /**
        *页面模板类型
        *
        **/
        private String key;
        public void setKey(String key ){
            this.key = key;
        }
        public String getKey(){
            return this.key;
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
