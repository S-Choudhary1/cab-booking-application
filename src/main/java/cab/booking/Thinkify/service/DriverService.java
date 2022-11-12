package cab.booking.Thinkify.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import cab.booking.Thinkify.util.Driver;
import cab.booking.Thinkify.util.Place;

@Service
public class DriverService {
    public HashMap<String, Driver> driverHashMap = new HashMap<>();
    public Map setDriverProfile(String driverName,String driverAge,String driverPhoneNo,String driverEmail,String driverGender,String vehicleName,String vehicleNo,boolean isAvailable,int sourceX,int sourceY){
        Map<String,Object> resultMap =new HashMap<>();
        if(driverHashMap.get(driverPhoneNo)!=null){
            resultMap.put("status",200);
            resultMap.put("message","driver profile is already created");
            resultMap.put("userDetails",driverHashMap.get(driverPhoneNo));
            return resultMap;
        }
        Driver driver = new Driver();
        driver.setDriverName(driverName);
        driver.setDriverAge(driverAge);
        driver.setDriverPhoneNo(driverPhoneNo);
        driver.setDriverEmail(driverEmail);
        driver.setDriverGender(driverGender);
        driver.setVehicleName(vehicleName);
        driver.setVehicleNo(vehicleNo);
        driver.setAvailable(isAvailable);
        driver.setPlace(new Place(sourceX,sourceY));
        driverHashMap.put(driverPhoneNo,driver);
        resultMap.put("status",200);
        resultMap.put("message","driver profile is created successfully");
        resultMap.put("userDetails",driver);
        return resultMap;
    }

}
