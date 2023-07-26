package com.example.tiktokcloone.Models;

public class User {
    private String userName, profilePicture,age,Bio,videoUploads,
    likedVideos,sharedVideos,comments,language,region,privacySettings,email,phoneNo,authToken;

    public User(){

    }

    public User(String userName, String profilePicture, String age, String bio, String videoUploads,
                String likedVideos, String sharedVideos, String comments, String language, String region,
                String privacySettings, String email, String phoneNo, String authToken) {
        this.userName = userName;
        this.profilePicture = profilePicture;
        this.age = age;
        Bio = bio;
        this.videoUploads = videoUploads;
        this.likedVideos = likedVideos;
        this.sharedVideos = sharedVideos;
        this.comments = comments;
        this.language = language;
        this.region = region;
        this.privacySettings = privacySettings;
        this.email = email;
        this.phoneNo = phoneNo;
        this.authToken = authToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getVideoUploads() {
        return videoUploads;
    }

    public void setVideoUploads(String videoUploads) {
        this.videoUploads = videoUploads;
    }

    public String getLikedVideos() {
        return likedVideos;
    }

    public void setLikedVideos(String likedVideos) {
        this.likedVideos = likedVideos;
    }

    public String getSharedVideos() {
        return sharedVideos;
    }

    public void setSharedVideos(String sharedVideos) {
        this.sharedVideos = sharedVideos;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPrivacySettings() {
        return privacySettings;
    }

    public void setPrivacySettings(String privacySettings) {
        this.privacySettings = privacySettings;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", age='" + age + '\'' +
                ", Bio='" + Bio + '\'' +
                ", videoUploads='" + videoUploads + '\'' +
                ", likedVideos='" + likedVideos + '\'' +
                ", sharedVideos='" + sharedVideos + '\'' +
                ", comments='" + comments + '\'' +
                ", language='" + language + '\'' +
                ", region='" + region + '\'' +
                ", privacySettings='" + privacySettings + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", authToken='" + authToken + '\'' +
                '}';
    }
}

