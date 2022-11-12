# cab-booking-application

This is a Cap booking application where you can book cab from list of available cabs.

These are endpoints:-
1-createUser
   {
    "userName":"Suresh",
    "userAge":"20",
    "userPhoneNo":"123",
    "userEmail":"gmail",
    "userGender":"Male"
  }
2-createDriver
  {
    "driverName": "Suresh",
    "driverAge":"20",
    "driverPhoneNo": "123",
    "driverEmail": "abc@abc.com",
    "driverGender": "Male",
    "vehicleName": "Swift",
    "vehicleNo": "123",
    "available": true,
    "sourceX": 10,
    "sourceY": 10
 }
3-setAvailable(driver can set his availiblety)
  {
    "driverPhoneNo":"123",
    "available":false
  }
4-bookRide(return the list of cabs available near your place)
 {
    "userPhoneNo":"123",
    "sourceX": 10,
    "sourceY": 10,
    "destX": 20,
    "destY": 20
 }
5-confirmRide(confirm the ride with any one from the list of cabs)
 {
    "driverPhoneNo":"123",
    "userPhoneNo":"123",
    "sourceX": 10,
    "sourceY": 10,
    "destX": 20,
    "destY": 20
 }

