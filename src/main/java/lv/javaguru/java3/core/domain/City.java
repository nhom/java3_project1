package lv.javaguru.java3.core.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vladislav on 11/9/2015.
 */
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="city_id",unique = true, nullable = false)
    private Long id;

    @Column(name="title", nullable = true)
    private String title;

    public City(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
