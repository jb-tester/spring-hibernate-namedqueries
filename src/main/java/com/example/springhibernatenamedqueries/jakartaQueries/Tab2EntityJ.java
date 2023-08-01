package com.example.springhibernatenamedqueries.jakartaQueries;

import jakarta.persistence.*;

/**
 * *
 * <p>Created by irina on 8/1/2023.</p>
 * <p>Project: spring-hibernate-namedqueries</p>
 * *
 */
@Entity
@Table(name = "tab_2", schema = "jbtests")
@NamedQueries({
        @NamedQuery(name = "NestedJakartaNamedQuery.first", query = "SELECT tab2 FROM Tab2EntityJ tab2"),
        @NamedQuery(name = "NestedJakartaNamedQuery.second", query = "SELECT tab2 FROM Tab2EntityJ tab2")
})
public class Tab2EntityJ {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "age")
    private int age;
    @Basic
    @Column(name = "leavingaddress")
    private String leavingAddress;
    @Basic
    @Column(name = "mobilephonenumber")
    private String mobilePhoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tab2EntityJ that = (Tab2EntityJ) o;

        if (id != that.id) return false;
        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (leavingAddress != null ? !leavingAddress.equals(that.leavingAddress) : that.leavingAddress != null)
            return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (leavingAddress != null ? leavingAddress.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tab2EntityJ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", leavingAddress='" + leavingAddress + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                '}';
    }
}
