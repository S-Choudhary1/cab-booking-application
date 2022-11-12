package cab.booking.Thinkify.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cab.booking.Thinkify.util.User;

@RestController
public class UserController {
    public HashMap<String,User> userHashMap = new HashMap<>();
    @PostMapping(path = "/createUser")
    public Map createUserProfile(@RequestBody Map<String,Object> request){
        Map<String,Object> resultMap =new HashMap<>();
        String userName = (String) request.get("userName");
        String userAge = (String) request.get("userAge");
        String userPhoneNo = (String) request.get("userPhoneNo");
        String userEmail = (String) request.get("userEmail");
        String userGender = (String) request.get("userGender");
        if(StringUtils.isEmpty(userName) && StringUtils.isEmpty(userAge) && StringUtils.isEmpty(userPhoneNo) && StringUtils.isEmpty(userEmail) && StringUtils.isEmpty(userGender)){
            resultMap.put("statue",400);
            resultMap.put("message","mandatory parameter are missing");
        }
        if(userHashMap.get(userPhoneNo)!=null){
            resultMap.put("status",200);
            resultMap.put("message","user profile is already created successfully");
            resultMap.put("userDetails",userHashMap.get(userPhoneNo));
            return resultMap;
        }
        User user = new User();
        user.setUserName(userName);
        user.setUserAge(userAge);
        user.setUserPhoneNo(userPhoneNo);
        user.setUserEmail(userEmail);
        user.setUserGender(userGender);
        userHashMap.put(userPhoneNo,user);
        resultMap.put("status",200);
        resultMap.put("message","user profile is created successfully");
        resultMap.put("userDetails",user.toString());
        return resultMap;
    }
}
