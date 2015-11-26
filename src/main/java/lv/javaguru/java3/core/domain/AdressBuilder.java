package lv.javaguru.java3.core.domain;

/**
 * Created by Vladislav on 11/9/2015.
 */
public class AdressBuilder {
    private Long id;
    private Country country;
    private City city;
    private String street;
    private int buildingNumber;
    private int zipCode;
    
    public static AdressBuilder createAdress(){ return new AdressBuilder();}
    
    public Adress build(){
        Adress adress = new Adress();
        adress.setCity(city);
        adress.setBuildingNumber(buildingNumber);
        adress.setCountry(country);
        adress.setId(id);
        adress.setStreet(street);
        adress.setZipCode(zipCode);
        return adress;
    }
    
    public AdressBuilder withCity(City city){
        this.city = city;
        return this;
    }

    public AdressBuilder withBuildingNumber(int buildingNumber){
        this.buildingNumber = buildingNumber;
        return this;
    }

    public AdressBuilder withCountry(Country country){
        this.country = country;
        return this;
    }

    public AdressBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public AdressBuilder withStreet(String street){
        this.street = street;
        return this;
    }

    public AdressBuilder withZipCode(int zipCode){
        this.zipCode = zipCode;
        return this;
    }
}
