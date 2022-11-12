package cab.booking.Thinkify.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cab.booking.Thinkify.service.DriverService;
import cab.booking.Thinkify.util.Driver;

@RestController
public class DriverController {
    @Autowired
    DriverService driverService;
    @PostMapping(path = "/createDriver")
    public Map createDriverProfile(@RequestBody Map<String,Object> request){
        Map<String,Object> resultMap =new HashMap<>();
        String driverName = (String) request.get("driverName");
        String driverAge = (String) request.get("driverAge");
        String driverPhoneNo = (String) request.get("driverPhoneNo");
        String driverEmail = (String) request.get("driverEmail");
        String driverGender = (String) request.get("driverGender");
        String vehicleName = (String) request.get("vehicleName");
        String vehicleNo = (String) request.get("vehicleNo");
        boolean isAvailable = (boolean) request.get("available");
        int sourceX = (int) request.get("sourceX");
        int sourceY = (int) request.get("sourceY");
        if(StringUtils.isEmpty(driverName) && StringUtils.isEmpty(driverAge) && StringUtils.isEmpty(driverPhoneNo)
                && StringUtils.isEmpty(driverEmail) && StringUtils.isEmpty(driverGender) && StringUtils.isEmpty(vehicleName) && StringUtils.isEmpty(vehicleName)){
            resultMap.put("statue",400);
            resultMap.put("message","mandatory parameter are missing");
        }
        return driverService.setDriverProfile(driverName,driverAge,driverPhoneNo,driverEmail,driverGender,vehicleName,vehicleNo,isAvailable,sourceX,sourceY);
    }
    @PostMapping(path = "/setAvailable")
    public Map setAvailable(@RequestBody Map<String,Object> requestJson){
        Map<String,Object> resultMap =new HashMap<>();
        String driverPhoneNo = (String) requestJson.get("driverPhoneNo");
        Driver driver=null;
        boolean isAvailable = (boolean) requestJson.get("available");
        if(driverService.driverHashMap.get(driverPhoneNo)!=null){
            driver = driverService.driverHashMap.get(driverPhoneNo);
            driver.setAvailable(isAvailable);
        }
        resultMap.put("status",200);
        resultMap.put("message",driver.getDriverName()+" availability set successfully to "+ isAvailable);
        return resultMap;
    }
}
