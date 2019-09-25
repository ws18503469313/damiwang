package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmCinemaSeat implements Serializable{

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
        *x坐标
        *
        **/
        private Integer x;
        public void setX(Integer x ){
            this.x = x;
        }
        public Integer getX(){
            return this.x;
        }
        /**
        *y坐标
        *
        **/
        private Integer y;
        public void setY(Integer y ){
            this.y = y;
        }
        public Integer getY(){
            return this.y;
        }
        /**
        *区域级别(1:A;2:B;3:C)
        *
        **/
        private Integer arealevel;
        public void setArealevel(Integer arealevel ){
            this.arealevel = arealevel;
        }
        public Integer getArealevel(){
            return this.arealevel;
        }
        /**
        *排期Id
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
        *排序
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
        *座位状态(1:有座位 0:没座位)
        *
        **/
        private Integer status;
        public void setStatus(Integer status ){
            this.status = status;
        }
        public Integer getStatus(){
            return this.status;
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
