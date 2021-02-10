package com.upgrad.hirewheels.entities;
 import javax.persistence.*;
 import java.time.LocalDateTime;


@Entity
@Table(name = "users")
public class entity {

    @Column(name = "first_name", length = 50, nullable = false)
    private final String firstName;

    @Column(length = 50)
    private final String lastName;

    @Column(length = 50, nullable = false)
    private final String password;

    @Column(length = 50, nullable = false, unique = true)
    private final String Email;
    
    @Column(length = 10, nullable = false, unique = true)
    private final String MobileNo;


    public entity(int userid, int userid1, String firstName, String lastName, String password, String email, String mobileNo, int roleid, int walletMoney, int roleid1, int walletMoney1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        Email = email;
        MobileNo = mobileNo;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public String getMobileNo() {
        return MobileNo;
    }
}

@Entity
@Table(name = "role")
class role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleid;

    @Column(name = "role_name", length = 50, nullable = false, unique = true)
    private final String roleName;

    role(int roleid, String roleName) {
        this.roleid = roleid;
        this.roleName = roleName;
    }
}

@Entity
@Table(name = "vehicle")
class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int vehicleid;

    @Column(name = "Vehicle_Model", length = 50, nullable = false)
    private final String VehicleModel;

    @Column(name = "Vehicle_Number", length = 10, nullable = false)
    private final String VehicleNumber;

    private int vehiclesubcategoryid;

    @Column(name = "color",length = 50, nullable = false)
    private final String Color;

    private int locationid;
    private int fueltypeid;
    private int availablitystatus;

    @Column(name = "vehicle_image_url", length = 500,nullable = false)
    private final String VehicleImageUrl;


    Vehicle(int vehicleid, String vehicleModel, String vehicleNumber, int vehiclesubcategoryid, String color, int locationid, int fueltypeid, int availablitystatus, String vehicleImageUrl) {
        this.vehicleid = vehicleid;
        VehicleModel = vehicleModel;
        VehicleNumber = vehicleNumber;
        this.vehiclesubcategoryid = vehiclesubcategoryid;
        Color = color;
        this.locationid = locationid;
        this.fueltypeid = fueltypeid;
        this.availablitystatus = availablitystatus;
        VehicleImageUrl = vehicleImageUrl;
    }
}

@Entity
@Table(name = "vehiclesubcategory")
class vehiclesubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int vehiclesubcategoryid;

    @Column(name = "vehicle_subcategory_name", length = 50, nullable = false )
    private final String VehicleSubcategoryName;

    @Column(name = "price_per_day", length = 10, nullable = false)
    private final int PricePerDay;

    private int vehiclecategoryid;

    vehiclesubcategory(int vehiclesubcategoryid, String vehicleSubcategoryName, int pricePerDay, int vehiclecategoryid) {
        this.vehiclesubcategoryid = vehiclesubcategoryid;
        VehicleSubcategoryName = vehicleSubcategoryName;
        PricePerDay = pricePerDay;
        this.vehiclecategoryid = vehiclecategoryid;
    }

    public int getPricePerDay() {
        return PricePerDay;
    }
}

@Entity
@Table(name = "vehiclecategory")
class vehiclecategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int vehiclecategoryid;

    @Column(name = "vehicle_category_name", length = 50, nullable = false, unique = true)
    private final String VehicleCategoryName;

    vehiclecategory(int vehiclecategoryid, String vehicleCategoryName) {
        this.vehiclecategoryid = vehiclecategoryid;
        VehicleCategoryName = vehicleCategoryName;
    }
}

@Entity
@Table(name = "location")
class location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationid;

    @Column(name = "location_name", length = 50, nullable = false)
    private final String LocationName;

    @Column(name = "address", length = 100, nullable = false)
    private final String Address;

    @Column(name = "city_id", length = 10, nullable = false)
    private final int CityId;

    @Column(name = "pincode", length = 6, nullable = false)
    private final String Pincode;

    location(int locationid, String locationName, String address, int cityId, String pincode) {
        this.locationid = locationid;
        LocationName = locationName;
        Address = address;
        CityId = cityId;
        Pincode = pincode;
    }
}

@Entity
@Table(name = "fueltype")
class fueltype {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fueltypeid;

    @Column(name = "fuel_type", length = 50, nullable = false, unique = true)
    private final String FuelType;

    fueltype(int fueltypeid, String fuelType) {
        this.fueltypeid = fueltypeid;
        FuelType = fuelType;
    }
}

@Entity
@Table(name = "city")
class city {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityid;

    @Column(name = "city_name", length = 50, nullable = false)
    private final String CityName;

    city(int cityid, String cityName) {
        this.cityid = cityid;
        CityName = cityName;
    }
}

@Entity
@Table(name = "booking")
class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingid;

    @Column(name = "pickup_date", nullable  = false)
    private LocalDateTime PickupDate;

    @Column(name = "dropoff_date", nullable = false)
    private LocalDateTime DropoffDate;

    @Column(name = "booking_date", nullable = false)
    private LocalDateTime BookingDate;

    @Column(name = "amount", nullable = false)
    private int Amount;

    @Column(name = "location_id", length = 10, nullable = false)
    private int LocationId;

    @Column(name = "vehicle_id", length = 10, nullable = false)
    private int VehicleId;

    @Column(name = "user_id", length = 10, nullable = false)
    private int UserId;
}