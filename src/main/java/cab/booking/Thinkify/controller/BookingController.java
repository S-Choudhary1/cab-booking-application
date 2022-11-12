package cab.booking.Thinkify.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cab.booking.Thinkify.service.BookingService;
import cab.booking.Thinkify.service.DriverService;
import cab.booking.Thinkify.util.Driver;
import cab.booking.Thinkify.util.Place;

@RestController
public class BookingController {
    @Autowired
    UserController userController;
    @Autowired
    BookingService bookingService;
    @Autowired
    DriverService driverService;
    @PostMapping(path = "/bookRide")
    public Map bookRide(@RequestBody Map<String,Object> request){
        Map<String,Object> resultMap = new HashMap<>();
        List<Driver> driversList =new ArrayList<>();
        String userPhoneNo = (String) request.get("userPhoneNo");
        int sourceX = (int) request.get("sourceX");
        int sourceY = (int) request.get("sourceY");
        int destX = (int) request.get("destX");
        int destY = (int) request.get("destY");
        Place place = new Place(sourceX,sourceY,destX,destY);
        if(userController.userHashMap.get(userPhoneNo)==null){
            resultMap.put("status",200);
            resultMap.put("message","please first create user profile");
            return resultMap;
        }
        return bookingService.getDriverList(place);
    }
    @PostMapping(path = "/confirmRide")
    public Map confirmRide(@RequestBody Map<String,Object> request){
        Map<String,Object> resultMap = new HashMap<>();
        String userPhoneNo = (String) request.get("userPhoneNo");
        String driverPhoneNo = (String) request.get("driverPhoneNo");
        int sourceX = (int) request.get("sourceX");
        int sourceY = (int) request.get("sourceY");
        int destX = (int) request.get("destX");
        int destY = (int) request.get("destY");
        String userName = userController.userHashMap.get(userPhoneNo).getUserName();
        Driver driver = null;
        if(driverService.driverHashMap.get(driverPhoneNo)!=null){
            driver = driverService.driverHashMap.get(driverPhoneNo);
            driver.setAvailable(false);
        }
        resultMap.put("status",200);
        resultMap.put("message"," successfully booked for "+userName+" ride from (" +sourceX+","+sourceY+") to (" +destX+","+destY+") with "+driver.getDriverName());
        return resultMap;
    }
}
