package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmSchedulerSeatPrice implements Serializable{

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
        *价格
        *
        **/
        private BigDecimal price;
        public void setPrice(BigDecimal price ){
            this.price = price;
        }
        public BigDecimal getPrice(){
            return this.price;
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
        *座位存量
        *
        **/
        private Integer seatnum;
        public void setSeatnum(Integer seatnum ){
            this.seatnum = seatnum;
        }
        public Integer getSeatnum(){
            return this.seatnum;
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
