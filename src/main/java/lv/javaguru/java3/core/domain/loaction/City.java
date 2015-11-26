package lv.javaguru.java3.core.domain.loaction;

import javax.persistence.*;

/**
 * Created by Vladislav on 11/9/2015.
 */
@Entity
@Table(name="cities")
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
