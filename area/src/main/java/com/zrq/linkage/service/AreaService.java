package com.zrq.linkage.service;

import com.zrq.linkage.entity.Area;
import java.util.Set;

public interface AreaService {
	Set<Area> getByPid(String pid);

	Set<Area> findByLevelOrderById(String level);
}