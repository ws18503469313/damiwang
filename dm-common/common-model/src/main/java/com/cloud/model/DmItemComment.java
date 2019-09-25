package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmItemComment implements Serializable{

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
        *剧目Id
        *
        **/
        private Integer itemid;
        public void setItemid(Integer itemid ){
            this.itemid = itemid;
        }
        public Integer getItemid(){
            return this.itemid;
        }
        /**
        *评论用户ID
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
        *评分(1-10)
        *
        **/
        private Integer score;
        public void setScore(Integer score ){
            this.score = score;
        }
        public Integer getScore(){
            return this.score;
        }
        /**
        *剧评
        *
        **/
        private String content;
        public void setContent(String content ){
            this.content = content;
        }
        public String getContent(){
            return this.content;
        }
        /**
        *更新时间
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
