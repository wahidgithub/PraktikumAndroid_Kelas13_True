package com.rafiq.praktikumandroidkelas13;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentJava implements Parcelable {
    private String npm;
    private String name;
    private Double ipk;
    private String phoneNumber;

    public StudentJava(String npm, String name, Double ipk, String phoneNumber) {
        this.npm = npm;
        this.name = name;
        this.ipk = ipk;
        this.phoneNumber = phoneNumber;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIpk() {
        return ipk;
    }

    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
