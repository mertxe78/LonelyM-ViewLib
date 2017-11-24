package com.czcg.viewlib.utils;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class ViewConvertListener implements Parcelable {

    public abstract void convertView(ViewHolder holder, BaseNiceDialog dialog);

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public ViewConvertListener() {
    }

    protected ViewConvertListener(Parcel in) {
    }

    public static final Creator<ViewConvertListener> CREATOR = new Creator<ViewConvertListener>() {
        @Override
        public ViewConvertListener createFromParcel(Parcel source) {
            return new ViewConvertListener(source){
                @Override
                public void convertView(ViewHolder holder, BaseNiceDialog dialog) {

                }
            };
        }

        @Override
        public ViewConvertListener[] newArray(int size) {
            return new ViewConvertListener[size];
        }
    };
}