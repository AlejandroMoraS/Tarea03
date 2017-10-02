package com.iteso.is705419.sesion10.beans;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alejandromorasanchez on 21/09/17.
 */

public class ItemProduct implements Parcelable {

    int image;
    String store,location,phone,description;
    String title;

    public ItemProduct(int image, String store, String location, String phone, String description, String title) {
        image = 0;
        store = "";location="";phone="";description=""; title= "";
        this.title = title;
        this.image = image;
        this.store = store;
        this.location = location;
        this.phone = phone;
        this.description = description;
    }

    public ItemProduct() {
        image = 0;
        store = "";location="";phone="";description=""; title= "";
    }


    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(image);
        parcel.writeString(store);
        parcel.writeString(location);
        parcel.writeString(phone);
        parcel.writeString(description);
        parcel.writeString(title);
    }

    public ItemProduct(Parcel in) {
        image = in.readInt();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
        title = in.readString();
    }

    public static final Creator<ItemProduct> CREATOR = new Creator<ItemProduct>() {
        @Override
        public ItemProduct createFromParcel(Parcel in) {
            return new ItemProduct(in);
        }

        @Override
        public ItemProduct[] newArray(int size) {
            return new ItemProduct[size];
        }
    };

}
