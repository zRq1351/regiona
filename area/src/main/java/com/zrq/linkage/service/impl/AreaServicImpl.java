package com.zrq.linkage.service.impl;

import com.zrq.linkage.entity.Area;
import com.zrq.linkage.repository.AreaRepository;
import com.zrq.linkage.service.AreaService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"area"})
public class AreaServicImpl implements AreaService {
	@Autowired
	AreaRepository areaRepository;

	@Cacheable(key = "#p0")
	public Set<Area> getByPid(String pid) {
		Set<Area> zet = this.areaRepository.findByPid(pid);
		return zet;
	}

	@Cacheable(key = "#p0")
	public Set<Area> findByLevelOrderById(String level) {
		return this.areaRepository.findByLevel(level);
	}
}