package com.example.springhibernatenamedqueries.jakartaQueries;

import jakarta.persistence.*;

/**
 * *
 * <p>Created by irina on 8/1/2023.</p>
 * <p>Project: spring-hibernate-namedqueries</p>
 * *
 */
// https://youtrack.jetbrains.com/issue/IDEA-256570
@Entity
@Table(name = "tab3", schema = "jbtests")
@NamedQuery(name = "RepeatedJakartaNamedQuery.first", query = "SELECT tab3 FROM Tab3EntityJ tab3")  // Ctrl-Click navigation works
@NamedQuery(name = "RepeatedJakartaNamedQuery.second", query = "SELECT tab3 FROM Tab3EntityJ tab3") // no navigation
@NamedQuery(name = "RepeatedJakartaNamedQuery.third", query = "SELECT tab3 FROM Tab3EntityJ tab3")  // no navigation
@NamedNativeQuery(name = "RepeatedJakartaNativeNamedQuery.first", query = "SELECT * FROM tab3", resultClass = Tab3EntityJ.class) // Ctrl-Click navigation works
@NamedNativeQuery(name = "RepeatedJakartaNativeNamedQuery.second", query = "SELECT * FROM tab3", resultClass = Tab3EntityJ.class) // no navigation
public class Tab3EntityJ {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "userId")
    private Integer userId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "car_id")
    private String carId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tab3EntityJ that = (Tab3EntityJ) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tab3EntityJ{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", carId='" + carId + '\'' +
                '}';
    }
}
