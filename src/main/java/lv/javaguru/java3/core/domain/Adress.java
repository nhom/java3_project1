package lv.javaguru.java3.core.domain;

import javax.persistence.*;

/**
 * Created by Vladislav on 11/9/2015.
 */
@Entity
@Table(name="adresses")
public class Adress {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="adress_id",unique = true, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;


    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name="street", nullable = true)
    private String street;

    @Column(name="building_number", nullable = true)
    private int buildingNumber;

    @Column(name="zip_code", nullable = true)
    private int zipCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

