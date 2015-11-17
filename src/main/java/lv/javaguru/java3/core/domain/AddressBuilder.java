package lv.javaguru.java3.core.domain;

/**
 * Created by Vladislav on 11/9/2015.
 */
public class AddressBuilder {
    private Long id;
    private Country country;
    private City city;
    private String street;
    private int buildingNumber;
    private int zipCode;
    
    public static AddressBuilder createAddress(){ return new AddressBuilder();}
    
    public Address build(){
        Address address = new Address();
        address.setCity(city);
        address.setBuildingNumber(buildingNumber);
        address.setCountry(country);
        address.setId(id);
        address.setStreet(street);
        address.setZipCode(zipCode);
        return address;
    }
    
    public AddressBuilder withCity(City city){
        this.city = city;
        return this;
    }

    public AddressBuilder withBuildingNumber(int buildingNumber){
        this.buildingNumber = buildingNumber;
        return this;
    }

    public AddressBuilder withCountry(Country country){
        this.country = country;
        return this;
    }

    public AddressBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public AddressBuilder withStreet(String street){
        this.street = street;
        return this;
    }

    public AddressBuilder withZipCode(int zipCode){
        this.zipCode = zipCode;
        return this;
    }
}
