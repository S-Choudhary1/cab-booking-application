package cab.booking.Thinkify.util;

public class Driver {
    private String driverName;
    private String vehicleName;
    private String vehicleNo;
    private boolean available;
    private String driverGender;

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", available=" + available +
                ", driverGender='" + driverGender + '\'' +
                ", place=" + place +
                ", driverAge='" + driverAge + '\'' +
                ", driverPhoneNo='" + driverPhoneNo + '\'' +
                ", driverEmail='" + driverEmail + '\'' +
                '}';
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    private Place place;

    public String getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(String driverAge) {
        this.driverAge = driverAge;
    }

    private String driverAge;

    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDriverPhoneNo() {
        return driverPhoneNo;
    }

    public void setDriverPhoneNo(String driverPhoneNo) {
        this.driverPhoneNo = driverPhoneNo;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String driverPhoneNo;
    public String driverEmail;
}
