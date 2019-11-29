package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysOrg<M extends BaseSysOrg<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setOrgCode(java.lang.String orgCode) {
		set("org_code", orgCode);
		return (M)this;
	}
	
	public java.lang.String getOrgCode() {
		return getStr("org_code");
	}

	public M setParentid(java.lang.String parentid) {
		set("parentid", parentid);
		return (M)this;
	}
	
	public java.lang.String getParentid() {
		return getStr("parentid");
	}

	public M setParentidName(java.lang.String parentidName) {
		set("parentid_name", parentidName);
		return (M)this;
	}
	
	public java.lang.String getParentidName() {
		return getStr("parentid_name");
	}

	public M setOrgName(java.lang.String orgName) {
		set("org_name", orgName);
		return (M)this;
	}
	
	public java.lang.String getOrgName() {
		return getStr("org_name");
	}

	public M setChief(java.lang.String chief) {
		set("chief", chief);
		return (M)this;
	}
	
	public java.lang.String getChief() {
		return getStr("chief");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public M setDescript(java.lang.String descript) {
		set("descript", descript);
		return (M)this;
	}
	
	public java.lang.String getDescript() {
		return getStr("descript");
	}

	public M setLev(java.lang.Integer lev) {
		set("lev", lev);
		return (M)this;
	}
	
	public java.lang.Integer getLev() {
		return getInt("lev");
	}

	public M setIsstop(java.lang.Integer isstop) {
		set("isstop", isstop);
		return (M)this;
	}
	
	public java.lang.Integer getIsstop() {
		return getInt("isstop");
	}

}
