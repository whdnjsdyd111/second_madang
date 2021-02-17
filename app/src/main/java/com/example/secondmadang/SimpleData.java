package com.example.secondmadang;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {
    int number;
    String message;

    public SimpleData(int num, String msg) {
        number = num;
        message = msg;
    }

    public SimpleData(Parcel src) { // Parcel 객체 읽기
        number = src.readInt();
        message = src.readString();
    }

    public static final Parcelable.Creator<SimpleData> CREATOR = new Parcelable.Creator<SimpleData>() {   // CREATOR 상수
        @Override
        public SimpleData createFromParcel(Parcel source) {
            return new SimpleData(source);  // SimpleData 생성자를 호출해 Parcel 객체 읽기
        }

        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
