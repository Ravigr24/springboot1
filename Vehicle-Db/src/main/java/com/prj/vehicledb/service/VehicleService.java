package com.prj.vehicledb.service;

import java.util.List;

import com.prj.vehicledb.model.Vehicle;

public interface VehicleService {
	

	Vehicle addVehicle(Vehicle vehicle);
	void deleteVehicleById(int vid);
	Vehicle getVehicleById(int vid);
	List<Vehicle> getAllVehicle();
	Vehicle updateVehicleById(Vehicle vehicle,int vid);
	Vehicle getVehicleByVcolor(String vcolor);
	List<Vehicle> getVehicleByVprice(long vprice);
	List<Vehicle> sortVehicleByVprice();
}
