package com.zrq.linkage.controller;

import com.zrq.linkage.entity.Area;
import com.zrq.linkage.service.AreaService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/area"})
public class AreaController {
	@Autowired
	private AreaService areaService;

	@RequestMapping({"/getAllProvince"})
	public Set<Area> getAllProvince() {
		return this.areaService.findByLevelOrderById("1");
	}

	@RequestMapping({"/get/{id}"})
	public Set<Area> get(@PathVariable("id") String id) {
		return this.areaService.getByPid(id);
	}
}