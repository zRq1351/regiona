package com.zrq.linkage.repository;

import com.zrq.linkage.entity.Area;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area, String> {
	Set<Area> findByPid(String pid);

	Set<Area> findByLevel(String level);
}