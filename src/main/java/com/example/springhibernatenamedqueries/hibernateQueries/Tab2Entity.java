package com.example.springhibernatenamedqueries.hibernateQueries;

import jakarta.persistence.*;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

/**
 * *
 * <p>Created by irina on 8/1/2023.</p>
 * <p>Project: spring-hibernate-namedqueries</p>
 * *
 */
@Entity
@Table(name = "tab_2", schema = "jbtests")
@NamedQueries({
        @NamedQuery(name = "NestedHibernateNamedQuery.first", query = "SELECT tab2 FROM Tab2EntityJ tab2"),
        @NamedQuery(name = "NestedHibernateNamedQuery.second", query = "SELECT tab2 FROM Tab2EntityJ tab2")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "NestedHibernateNativeNamedQuery.first", query = "SELECT * FROM tab_2", resultClass = Tab2Entity.class),
        @NamedNativeQuery(name = "NestedHibernateNativeNamedQuery.second", query = "SELECT * FROM tab_2" , resultClass = Tab2Entity.class)

})
public class Tab2Entity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String tab2name;
    @Basic
    @Column(name = "age")
    private int age;
    @Basic
    @Column(name = "LeavingAddress")
    private String leavingAddress;
    @Basic
    @Column(name = "MobilePhoneNumber")
    private String mobilePhoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTab2name() {
        return tab2name;
    }

    public void setTab2name(String tab2name) {
        this.tab2name = tab2name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLeavingAddress() {
        return leavingAddress;
    }

    public void setLeavingAddress(String leavingAddress) {
        this.leavingAddress = leavingAddress;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Override
    public String toString() {
        return "Tab2EntityJ{" +
                "id=" + id +
                ", tab2name='" + tab2name + '\'' +
                ", age=" + age +
                ", leavingAddress='" + leavingAddress + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                '}';
    }
}
