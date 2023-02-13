package com.prj.vehicledb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prj.vehicledb.model.Vehicle;

public interface VechileRepo extends JpaRepository<Vehicle, Integer> {
	
	@Query(value = "select * from vehicle where vcolor=?",nativeQuery = true)
	public Vehicle getVehicleByVcolor(String vcolor);
	
	@Query(value = "select * from vehicle where vprice>?",nativeQuery = true)
	public List<Vehicle> getVehicleByVprice(long vprice);
	
	@Query(value = "select * from vehicle order by vprice",nativeQuery = true)
	public List<Vehicle> sortVehicleByVprice();
	
	
}
