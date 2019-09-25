package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmSchedulerSeat implements Serializable{

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
        private Integer scheduleid;
        public void setScheduleid(Integer scheduleid ){
            this.scheduleid = scheduleid;
        }
        public Integer getScheduleid(){
            return this.scheduleid;
        }
        /**
        *订单编号
        *
        **/
        private String orderno;
        public void setOrderno(String orderno ){
            this.orderno = orderno;
        }
        public String getOrderno(){
            return this.orderno;
        }
        /**
        *如果已经售出记录购买用户id
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
        *座位状态(0:没座位 1:有座位 2:锁定待付款 3:已售出 )
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
