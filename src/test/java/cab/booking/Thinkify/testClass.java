package cab.booking.Thinkify;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cab.booking.Thinkify.controller.BookingController;
import cab.booking.Thinkify.controller.DriverController;
import cab.booking.Thinkify.controller.UserController;
import cab.booking.Thinkify.service.DriverService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testClass {
    @Autowired
    UserController userController;
    @Autowired
    DriverController driverController;
    @Autowired
    BookingController bookingController;
    @Autowired
    DriverService driverService;
    @Test
    public void testForUser1() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("userName", "Abhishek");
        map1.put("userAge", "20");
        map1.put("userPhoneNo", "1");
        map1.put("userEmail", "abc@abc.com");
        map1.put("userGender", "Male");
        Map resultMap1 = userController.createUserProfile(map1);
        System.out.println(resultMap1);


        Map<String,Object> map2 = new HashMap<>();
        map2.put("userName","Rahul");
        map2.put("userAge","20");
        map2.put("userPhoneNo","2");
        map2.put("userEmail","abc@abc.com");
        map2.put("userGender","Male");
        Map resultMap2 = userController.createUserProfile(map2);
        System.out.println(resultMap2);


        Map<String,Object> map3 = new HashMap<>();
        map3.put("userName","Nandini");
        map3.put("userAge","20");
        map3.put("userPhoneNo","3");
        map3.put("userEmail","abc@abc.com");
        map3.put("userGender","Female");
        Map resultMap3 = userController.createUserProfile(map3);
        System.out.println(resultMap3);


        Map<String,Object> map4 = new HashMap<>();
        map4.put("driverName","Driver1");
        map4.put("driverAge","20");
        map4.put("driverPhoneNo","1");
        map4.put("driverGender","Male");
        map4.put("driverEmail","abc@abc.gmail.com");
        map4.put("vehicleName","Swift");
        map4.put("vehicleNo","1234");
        map4.put("available",true);
        map4.put("sourceX",10);
        map4.put("sourceY",1);
        Map resultMap4 = driverController.createDriverProfile(map4);
        System.out.println(resultMap4);


        Map<String,Object> map5 = new HashMap<>();
        map5.put("driverName","Driver2");
        map5.put("driverAge","20");
        map5.put("driverPhoneNo","2");
        map5.put("driverGender","Male");
        map5.put("driverEmail","abc@abc.gmail.com");
        map5.put("vehicleName","Swift");
        map5.put("vehicleNo","1234");
        map5.put("available",true);
        map5.put("sourceX",10);
        map5.put("sourceY",11);
        Map resultMap5 = driverController.createDriverProfile(map5);
        System.out.println(resultMap5);


        Map<String,Object> map6 = new HashMap<>();
        map6.put("driverName","Driver3");
        map6.put("driverAge","20");
        map6.put("driverPhoneNo","3");
        map6.put("driverGender","Male");
        map6.put("driverEmail","abc@abc.gmail.com");
        map6.put("vehicleName","Swift");
        map6.put("vehicleNo","1234");
        map6.put("available",true);
        map6.put("sourceX",5);
        map6.put("sourceY",3);
        Map resultMap6 = driverController.createDriverProfile(map6);
        System.out.println(driverService.driverHashMap);
        System.out.println(resultMap6);


//        Map<String,Object> map7 = new HashMap<>();
//        map7.put("driverPhoneNo","1");
//        map7.put("available",false);
//        Map resultMap = driverController.setAvailable(map7);
//        System.out.println(resultMap);


        Map<String,Object> map8 = new HashMap<>();
        map8.put("userPhoneNo","1");
        map8.put("sourceX",0);
        map8.put("sourceY",0);
        map8.put("destX",20);
        map8.put("destY",1);
        Map resultMap8 = bookingController.bookRide(map8);
        System.out.println(resultMap8);


        Map<String,Object> map9 = new HashMap<>();
        map9.put("userPhoneNo","2");
        map9.put("sourceX",10);
        map9.put("sourceY",0);
        map9.put("destX",15);
        map9.put("destY",3);
        Map resultMap9 = bookingController.bookRide(map9);
        System.out.println(resultMap9);


        Map<String,Object> map12 = new HashMap<>();
        map12.put("driverPhoneNo","1");
        map12.put("available",false);
        Map result = driverController.setAvailable(map12);
        System.out.println(result);


        Map<String,Object> map10 = new HashMap<>();
        map10.put("userPhoneNo","3");
        map10.put("sourceX",15);
        map10.put("sourceY",1);
        map10.put("destX",20);
        map10.put("destY",4);
        Map resultMap10 = bookingController.bookRide(map10);
        System.out.println(resultMap10);


        Map<String,Object> map = new HashMap<>();
        map.put("userPhoneNo","2");
        map.put("sourceX",0);
        map.put("sourceY",0);
        map.put("destX",20);
        map.put("destY",1);
        map.put("driverPhoneNo","1");
        Map map11 = bookingController.confirmRide(map);
        System.out.println(map11);
    }
}
