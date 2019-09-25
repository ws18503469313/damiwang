package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmOrder implements Serializable{

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
        *下单用户Id
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
        *排期ID
        *
        **/
        private Integer schedulerid;
        public void setSchedulerid(Integer schedulerid ){
            this.schedulerid = schedulerid;
        }
        public Integer getSchedulerid(){
            return this.schedulerid;
        }
        /**
        *剧集Id(冗余)
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
        *
        *
        **/
        private String itemname;
        public void setItemname(String itemname ){
            this.itemname = itemname;
        }
        public String getItemname(){
            return this.itemname;
        }
        /**
        *微信交易号
        *
        **/
        private String wxtradeno;
        public void setWxtradeno(String wxtradeno ){
            this.wxtradeno = wxtradeno;
        }
        public String getWxtradeno(){
            return this.wxtradeno;
        }
        /**
        *支付宝交易号
        *
        **/
        private String alitradeno;
        public void setAlitradeno(String alitradeno ){
            this.alitradeno = alitradeno;
        }
        public String getAlitradeno(){
            return this.alitradeno;
        }
        /**
        *订单类型(0:未支付 -1:支付超时/支付取消 2:已支付)
        *
        **/
        private Integer ordertype;
        public void setOrdertype(Integer ordertype ){
            this.ordertype = ordertype;
        }
        public Integer getOrdertype(){
            return this.ordertype;
        }
        /**
        *支付类型(1:微信支付 2：支付宝支付)
        *
        **/
        private String paytype;
        public void setPaytype(String paytype ){
            this.paytype = paytype;
        }
        public String getPaytype(){
            return this.paytype;
        }
        /**
        *购买数目
        *
        **/
        private Integer totalcount;
        public void setTotalcount(Integer totalcount ){
            this.totalcount = totalcount;
        }
        public Integer getTotalcount(){
            return this.totalcount;
        }
        /**
        *
        *
        **/
        private Integer area;
        public void setArea(Integer area ){
            this.area = area;
        }
        public Integer getArea(){
            return this.area;
        }
        /**
        *0:WEB端 1:手机端 2:其他客户端
        *
        **/
        private Integer sourcetype;
        public void setSourcetype(Integer sourcetype ){
            this.sourcetype = sourcetype;
        }
        public Integer getSourcetype(){
            return this.sourcetype;
        }
        /**
        *是否需要发票（0：不需要 1：需要）
        *
        **/
        private Integer isneedinvoice;
        public void setIsneedinvoice(Integer isneedinvoice ){
            this.isneedinvoice = isneedinvoice;
        }
        public Integer getIsneedinvoice(){
            return this.isneedinvoice;
        }
        /**
        *发票类型（0：个人 1：公司）
        *
        **/
        private Integer invoicetype;
        public void setInvoicetype(Integer invoicetype ){
            this.invoicetype = invoicetype;
        }
        public Integer getInvoicetype(){
            return this.invoicetype;
        }
        /**
        *发票抬头
        *
        **/
        private String invoicehead;
        public void setInvoicehead(String invoicehead ){
            this.invoicehead = invoicehead;
        }
        public String getInvoicehead(){
            return this.invoicehead;
        }
        /**
        *发票号
        *
        **/
        private String invoiceno;
        public void setInvoiceno(String invoiceno ){
            this.invoiceno = invoiceno;
        }
        public String getInvoiceno(){
            return this.invoiceno;
        }
        /**
        *是否需要保险(0：不需要 1:需要)
        *
        **/
        private Integer isneedinsurance;
        public void setIsneedinsurance(Integer isneedinsurance ){
            this.isneedinsurance = isneedinsurance;
        }
        public Integer getIsneedinsurance(){
            return this.isneedinsurance;
        }
        /**
        *总价
        *
        **/
        private BigDecimal totalamount;
        public void setTotalamount(BigDecimal totalamount ){
            this.totalamount = totalamount;
        }
        public BigDecimal getTotalamount(){
            return this.totalamount;
        }
        /**
        *保险金额
        *
        **/
        private BigDecimal insuranceamount;
        public void setInsuranceamount(BigDecimal insuranceamount ){
            this.insuranceamount = insuranceamount;
        }
        public BigDecimal getInsuranceamount(){
            return this.insuranceamount;
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
