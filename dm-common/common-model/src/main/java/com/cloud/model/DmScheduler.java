package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmScheduler implements Serializable{

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
        *排期名称
        *
        **/
        private String title;
        public void setTitle(String title ){
            this.title = title;
        }
        public String getTitle(){
            return this.title;
        }
        /**
        *开始时间
        *
        **/
        private Date starttime;
        public void setStarttime(Date starttime ){
            this.starttime = starttime;
        }
        public Date getStarttime(){
            return this.starttime;
        }
        /**
        *结束时间
        *
        **/
        private Date endtime;
        public void setEndtime(Date endtime ){
            this.endtime = endtime;
        }
        public Date getEndtime(){
            return this.endtime;
        }
        /**
        *剧集Id
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
        *剧场Id
        *
        **/
        private Integer cinemaid;
        public void setCinemaid(Integer cinemaid ){
            this.cinemaid = cinemaid;
        }
        public Integer getCinemaid(){
            return this.cinemaid;
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
