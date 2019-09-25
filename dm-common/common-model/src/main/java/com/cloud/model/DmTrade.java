package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmTrade implements Serializable{

        /**
        *
        *
        **/
        private String id;
        public void setId(String id ){
            this.id = id;
        }
        public String getId(){
            return this.id;
        }
        /**
        *业务订单号
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
        *交易订单号
        *
        **/
        private String tradeno;
        public void setTradeno(String tradeno ){
            this.tradeno = tradeno;
        }
        public String getTradeno(){
            return this.tradeno;
        }
        /**
        *(1:支付宝 2:微信)
        *
        **/
        private Integer paymethod;
        public void setPaymethod(Integer paymethod ){
            this.paymethod = paymethod;
        }
        public Integer getPaymethod(){
            return this.paymethod;
        }
        /**
        *交易金额
        *
        **/
        private BigDecimal amount;
        public void setAmount(BigDecimal amount ){
            this.amount = amount;
        }
        public BigDecimal getAmount(){
            return this.amount;
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
