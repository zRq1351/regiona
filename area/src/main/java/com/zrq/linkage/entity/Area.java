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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getStreetCode() {
		return streetCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
	}

	public String getCommitteeCode() {
		return committeeCode;
	}

	public void setCommitteeCode(String committeeCode) {
		this.committeeCode = committeeCode;
	}

	public String getCommitteeType() {
		return committeeType;
	}

	public void setCommitteeType(String committeeType) {
		this.committeeType = committeeType;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}

}