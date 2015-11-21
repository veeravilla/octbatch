package com.test.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.test.carapp.Car;

public class ReferenceData {
	private List<String> stateList;
	private Set<Course> courseSet;
	private Map<String, String> countyMap;
	private List<Object> rawList;
	
	public List<Object> getRawList() {
		return rawList;
	}

	public void setRawList(List<Object> rawList) {
		this.rawList = rawList;
	}

	@Autowired
	@Qualifier("bmw")
	private Car car;

	public List<String> getStateList() {
		return stateList;
	}

	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}

	public Set<Course> getCourseSet() {
		return courseSet;
	}

	public void setCourseSet(Set<Course> courseSet) {
		this.courseSet = courseSet;
	}

	public Map<String, String> getCountyMap() {
		return countyMap;
	}

	public void setCountyMap(Map<String, String> countyMap) {
		this.countyMap = countyMap;
	}

	public Car getCar() {
		return car;
	}
}
