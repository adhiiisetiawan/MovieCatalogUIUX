package com.example.moviecatalogueuiux;

import android.os.Parcel;
import android.os.Parcelable;

public class Televisi implements Parcelable {
    private String titleTV, genreTV, coverTV, runtimeTV, languageTV, crewTV, scoreTV, overviewTV;

    public String getTitleTV() {
        return titleTV;
    }

    public void setTitleTV(String titleTV) {
        this.titleTV = titleTV;
    }

    public String getGenreTV() {
        return genreTV;
    }

    public void setGenreTV(String genreTV) {
        this.genreTV = genreTV;
    }

    public String getCoverTV() {
        return coverTV;
    }

    public void setCoverTV(String coverTV) {
        this.coverTV = coverTV;
    }

    public String getRuntimeTV() {
        return runtimeTV;
    }

    public void setRuntimeTV(String runtimeTV) {
        this.runtimeTV = runtimeTV;
    }

    public String getLanguageTV() {
        return languageTV;
    }

    public void setLanguageTV(String languageTV) {
        this.languageTV = languageTV;
    }

    public String getCrewTV() {
        return crewTV;
    }

    public void setCrewTV(String crewTV) {
        this.crewTV = crewTV;
    }

    public String getScoreTV() {
        return scoreTV;
    }

    public void setScoreTV(String scoreTV) {
        this.scoreTV = scoreTV;
    }

    public String getOverviewTV() {
        return overviewTV;
    }

    public void setOverviewTV(String overviewTV) {
        this.overviewTV = overviewTV;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.titleTV);
        dest.writeString(this.genreTV);
        dest.writeString(this.coverTV);
        dest.writeString(this.runtimeTV);
        dest.writeString(this.languageTV);
        dest.writeString(this.crewTV);
        dest.writeString(this.scoreTV);
        dest.writeString(this.overviewTV);
    }

    public Televisi() {
    }

    protected Televisi(Parcel in) {
        this.titleTV = in.readString();
        this.genreTV = in.readString();
        this.coverTV = in.readString();
        this.runtimeTV = in.readString();
        this.languageTV = in.readString();
        this.crewTV = in.readString();
        this.scoreTV = in.readString();
        this.overviewTV = in.readString();
    }

    public static final Parcelable.Creator<Televisi> CREATOR = new Parcelable.Creator<Televisi>() {
        @Override
        public Televisi createFromParcel(Parcel source) {
            return new Televisi(source);
        }

        @Override
        public Televisi[] newArray(int size) {
            return new Televisi[size];
        }
    };
}
