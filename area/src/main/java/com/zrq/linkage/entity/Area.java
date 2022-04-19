package com.zrq.linkage.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "sys_area")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String pid;
	private String provinceCode;
	private String cityCode;
	private String areaCode;
	private String streetCode;
	private String committeeCode;
	private String committeeType;
	private String sort;
	private String level;
	@Transient
	private Set<Area> areas = new HashSet<Area>();

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPid() {
		return this.pid;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
	}

	public String getStreetCode() {
		return this.streetCode;
	}

	public void setCommitteeCode(String committeeCode) {
		this.committeeCode = committeeCode;
	}

	public String getCommitteeCode() {
		return this.committeeCode;
	}

	public void setCommitteeType(String committeeType) {
		this.committeeType = committeeType;
	}

	public String getCommitteeType() {
		return this.committeeType;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSort() {
		return this.sort;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return this.level;
	}

	public Set<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}
}