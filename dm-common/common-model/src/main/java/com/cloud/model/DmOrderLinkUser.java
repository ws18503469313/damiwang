package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmOrderLinkUser implements Serializable{

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
        *订单id
        *
        **/
        private Integer orderid;
        public void setOrderid(Integer orderid ){
            this.orderid = orderid;
        }
        public Integer getOrderid(){
            return this.orderid;
        }
        /**
        *联系人id
        *
        **/
        private Integer linkuserid;
        public void setLinkuserid(Integer linkuserid ){
            this.linkuserid = linkuserid;
        }
        public Integer getLinkuserid(){
            return this.linkuserid;
        }
        /**
        *入住人姓名逗号分隔
        *
        **/
        private String linkusername;
        public void setLinkusername(String linkusername ){
            this.linkusername = linkusername;
        }
        public String getLinkusername(){
            return this.linkusername;
        }
        /**
        *
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
        *
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
        private Integer updatedtime;
        public void setUpdatedtime(Integer updatedtime ){
            this.updatedtime = updatedtime;
        }
        public Integer getUpdatedtime(){
            return this.updatedtime;
        }

}
