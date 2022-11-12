package cab.booking.Thinkify.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cab.booking.Thinkify.controller.DriverController;
import cab.booking.Thinkify.util.Driver;
import cab.booking.Thinkify.util.Place;

@Service
public class BookingService {
    @Autowired
    DriverService driverService;
    public Map getDriverList(Place place){
        List<Driver> driversList = new ArrayList<>();
        List<Driver> driversList1 = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<>();
        HashMap<String, Driver> driverHashMap = driverService.driverHashMap;
        List<Driver> completeList = new ArrayList<>(driverHashMap.values());
        for (Driver driver:completeList){
            Place place1 = driver.getPlace();
            double distance = Math.sqrt(Math.pow(place.getSourceX()-place1.getSourceX(),2)+Math.pow(place.getSourceY()-place1.getSourceY(),2));
            if(distance <= 5){
                driversList.add(driver);
            }
        }
        if(driversList.size()==0){
            resultMap.put("status",200);
            resultMap.put("message","no driver is available at this place(all the driver are more than 5 units away)");
            return resultMap;
        }
        for (Driver driver:driversList){
            Place place1 = driver.getPlace();
            if(driver.isAvailable()){
                driversList1.add(driver);
            }
        }
        if(driversList1.size()==0){
            resultMap.put("status",200);
            resultMap.put("message","no driver is available");
            return resultMap;
        }
        resultMap.put("status",200);
        resultMap.put("message"," successfully fetch the List of Driver");
        resultMap.put("List of Drivers Available",driversList1);
        return resultMap;
    }
}
