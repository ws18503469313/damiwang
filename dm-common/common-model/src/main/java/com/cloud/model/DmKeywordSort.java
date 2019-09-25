package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmKeywordSort implements Serializable{

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
        *搜索关键词
        *
        **/
        private String keyword;
        public void setKeyword(String keyword ){
            this.keyword = keyword;
        }
        public String getKeyword(){
            return this.keyword;
        }
        /**
        *搜索数目
        *
        **/
        private Integer count;
        public void setCount(Integer count ){
            this.count = count;
        }
        public Integer getCount(){
            return this.count;
        }
        /**
        *
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
        *
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
