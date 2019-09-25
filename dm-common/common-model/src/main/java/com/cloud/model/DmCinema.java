package com.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
*  auto genetated
* @author polunzi
* @Date: 2019-09-25
*/
public class DmCinema implements Serializable{

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
        *剧场名称
        *
        **/
        private String name;
        public void setName(String name ){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        /**
        *剧场地址
        *
        **/
        private String address;
        public void setAddress(String address ){
            this.address = address;
        }
        public String getAddress(){
            return this.address;
        }
        /**
        *区域ID
        *
        **/
        private Integer areaid;
        public void setAreaid(Integer areaid ){
            this.areaid = areaid;
        }
        public Integer getAreaid(){
            return this.areaid;
        }
        /**
        *区域名称
        *
        **/
        private String areaname;
        public void setAreaname(String areaname ){
            this.areaname = areaname;
        }
        public String getAreaname(){
            return this.areaname;
        }
        /**
        *X轴座位长度
        *
        **/
        private Integer xlength;
        public void setXlength(Integer xlength ){
            this.xlength = xlength;
        }
        public Integer getXlength(){
            return this.xlength;
        }
        /**
        *Y轴座位长度
        *
        **/
        private Integer ylength;
        public void setYlength(Integer ylength ){
            this.ylength = ylength;
        }
        public Integer getYlength(){
            return this.ylength;
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
