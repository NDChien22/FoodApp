package com.example.foodapp_project.Domain;

import android.hardware.camera2.CameraExtensionSession;

public class Location {
    private int Id;
    private String Loc;

    public Location() {
    }

    @Override
    public String toString() {
        return Loc ;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }
}
