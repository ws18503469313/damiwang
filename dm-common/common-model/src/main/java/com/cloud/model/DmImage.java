package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmImage implements Serializable{

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
        *图片URL
        *
        **/
        private String imgurl;
        public void setImgurl(String imgurl ){
            this.imgurl = imgurl;
        }
        public String getImgurl(){
            return this.imgurl;
        }
        /**
        *关联表ID
        *
        **/
        private Integer targetid;
        public void setTargetid(Integer targetid ){
            this.targetid = targetid;
        }
        public Integer getTargetid(){
            return this.targetid;
        }
        /**
        *顺序
        *
        **/
        private Integer sort;
        public void setSort(Integer sort ){
            this.sort = sort;
        }
        public Integer getSort(){
            return this.sort;
        }
        /**
        *图片类型（0:无类型 1:轮播图 2:海报图）
        *
        **/
        private Integer type;
        public void setType(Integer type ){
            this.type = type;
        }
        public Integer getType(){
            return this.type;
        }
        /**
        *图片分类（0：用户头像 1：商品图片）
        *
        **/
        private Integer category;
        public void setCategory(Integer category ){
            this.category = category;
        }
        public Integer getCategory(){
            return this.category;
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
