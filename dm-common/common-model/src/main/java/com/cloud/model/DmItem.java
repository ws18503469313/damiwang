package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmItem implements Serializable{

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
        *节目名称
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
        *摘要信息
        *
        **/
        private String abstractmessage;
        public void setAbstractmessage(String abstractmessage ){
            this.abstractmessage = abstractmessage;
        }
        public String getAbstractmessage(){
            return this.abstractmessage;
        }
        /**
        *节目类型管理ID
        *
        **/
        private Integer itemtype1id;
        public void setItemtype1id(Integer itemtype1id ){
            this.itemtype1id = itemtype1id;
        }
        public Integer getItemtype1id(){
            return this.itemtype1id;
        }
        /**
        *节目名称
        *
        **/
        private String itemtype1name;
        public void setItemtype1name(String itemtype1name ){
            this.itemtype1name = itemtype1name;
        }
        public String getItemtype1name(){
            return this.itemtype1name;
        }
        /**
        *节目类型管理ID
        *
        **/
        private Integer itemtype2id;
        public void setItemtype2id(Integer itemtype2id ){
            this.itemtype2id = itemtype2id;
        }
        public Integer getItemtype2id(){
            return this.itemtype2id;
        }
        /**
        *节目名称
        *
        **/
        private String itemtype2name;
        public void setItemtype2name(String itemtype2name ){
            this.itemtype2name = itemtype2name;
        }
        public String getItemtype2name(){
            return this.itemtype2name;
        }
        /**
        *状态(1:项目待定2:预售/预订3:开始售票4:演出开始)
        *
        **/
        private Integer state;
        public void setState(Integer state ){
            this.state = state;
        }
        public Integer getState(){
            return this.state;
        }
        /**
        *基础描述
        *
        **/
        private String basicdescription;
        public void setBasicdescription(String basicdescription ){
            this.basicdescription = basicdescription;
        }
        public String getBasicdescription(){
            return this.basicdescription;
        }
        /**
        *项目描述
        *
        **/
        private String projectdescription;
        public void setProjectdescription(String projectdescription ){
            this.projectdescription = projectdescription;
        }
        public String getProjectdescription(){
            return this.projectdescription;
        }
        /**
        *温馨提示
        *
        **/
        private String reminderdescription;
        public void setReminderdescription(String reminderdescription ){
            this.reminderdescription = reminderdescription;
        }
        public String getReminderdescription(){
            return this.reminderdescription;
        }
        /**
        *经度
        *
        **/
        private String longitude;
        public void setLongitude(String longitude ){
            this.longitude = longitude;
        }
        public String getLongitude(){
            return this.longitude;
        }
        /**
        *纬度
        *
        **/
        private String latitude;
        public void setLatitude(String latitude ){
            this.latitude = latitude;
        }
        public String getLatitude(){
            return this.latitude;
        }
        /**
        *是否推荐(0:默认 1:热推)
        *
        **/
        private Integer isbanner;
        public void setIsbanner(Integer isbanner ){
            this.isbanner = isbanner;
        }
        public Integer getIsbanner(){
            return this.isbanner;
        }
        /**
        *是否推荐(0:不推荐 1:推荐)
        *
        **/
        private Integer isrecommend;
        public void setIsrecommend(Integer isrecommend ){
            this.isrecommend = isrecommend;
        }
        public Integer getIsrecommend(){
            return this.isrecommend;
        }
        /**
        *平均分
        *
        **/
        private BigDecimal avgscore;
        public void setAvgscore(BigDecimal avgscore ){
            this.avgscore = avgscore;
        }
        public BigDecimal getAvgscore(){
            return this.avgscore;
        }
        /**
        *评论数目
        *
        **/
        private Integer commentcount;
        public void setCommentcount(Integer commentcount ){
            this.commentcount = commentcount;
        }
        public Integer getCommentcount(){
            return this.commentcount;
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
        *开始演出时间
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
        *最低价格
        *
        **/
        private BigDecimal minprice;
        public void setMinprice(BigDecimal minprice ){
            this.minprice = minprice;
        }
        public BigDecimal getMinprice(){
            return this.minprice;
        }
        /**
        *最高价格
        *
        **/
        private BigDecimal maxprice;
        public void setMaxprice(BigDecimal maxprice ){
            this.maxprice = maxprice;
        }
        public BigDecimal getMaxprice(){
            return this.maxprice;
        }
        /**
        *年龄段（0:全年龄段,1:0-3岁,2:3-6岁,3:6-12岁）
        *
        **/
        private Integer agegroup;
        public void setAgegroup(Integer agegroup ){
            this.agegroup = agegroup;
        }
        public Integer getAgegroup(){
            return this.agegroup;
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
