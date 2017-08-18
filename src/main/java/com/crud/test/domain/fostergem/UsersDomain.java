package com.crud.test.domain.fostergem;

import com.crud.test.domain.BaseDomain;

import javax.persistence.*;

@Entity
@Table(name="foster_users")

public class UsersDomain extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profile_id;
    private String fb_id;
    private String fb_long_live_token;
    private String twitter_token;
    private String last_tweet_id;
    private String fname;
    private String mname;
    private String lname;
    private String email;
    private String email2;
    private String quora_link;
    private String username;
    private String password;
    private String dob;
    private String date;
    private String activated;
    private String profile_pic;
    private Integer credit;
    private Integer fb_friend_count;
    private Integer city;
    private String country;
    private String signup_source;
    private String interested_in;
    private String about_me;
    private String school;
    private String school2;
    private String college;
    private String duration;
    private String concentration;
    private String college2;
    private String company;
    private Integer auto_post_on_voteup;
    private String Accesskey;
    private String Secretkey;
    private String api_access_token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Integer getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Integer profile_id) {
        this.profile_id = profile_id;
    }

    public String getFb_id() {
        return fb_id;
    }

    public void setFb_id(String fb_id) {
        this.fb_id = fb_id;
    }

    public String getFb_long_live_token() {
        return fb_long_live_token;
    }

    public void setFb_long_live_token(String fb_long_live_token) {
        this.fb_long_live_token = fb_long_live_token;
    }

    public String getTwitter_token() {
        return twitter_token;
    }

    public void setTwitter_token(String twitter_token) {
        this.twitter_token = twitter_token;
    }

    public String getLast_tweet_id() {
        return last_tweet_id;
    }

    public void setLast_tweet_id(String last_tweet_id) {
        this.last_tweet_id = last_tweet_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }




    public String getQuora_link() {
        return quora_link;
    }

    public void setQuora_link(String quora_link) {
        this.quora_link = quora_link;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getFb_friend_count() {
        return fb_friend_count;
    }

    public void setFb_friend_count(Integer fb_friend_count) {
        this.fb_friend_count = fb_friend_count;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSignup_source() {
        return signup_source;
    }

    public void setSignup_source(String signup_source) {
        this.signup_source = signup_source;
    }

    public String getInterested_in() {
        return interested_in;
    }

    public void setInterested_in(String interested_in) {
        this.interested_in = interested_in;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool2() {
        return school2;
    }

    public void setSchool2(String school2) {
        this.school2 = school2;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getCollege2() {
        return college2;
    }

    public void setCollege2(String college2) {
        this.college2 = college2;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getAuto_post_on_voteup() {
        return auto_post_on_voteup;
    }

    public void setAuto_post_on_voteup(Integer auto_post_on_voteup) {
        this.auto_post_on_voteup = auto_post_on_voteup;
    }

    public String getAccesskey() {
        return Accesskey;
    }

    public void setAccesskey(String accesskey) {
        Accesskey = accesskey;
    }

    public String getSecretkey() {
        return Secretkey;
    }

    public void setSecretkey(String secretkey) {
        Secretkey = secretkey;
    }

    public String getApi_access_token() {
        return api_access_token;
    }

    public void setApi_access_token(String api_access_token) {
        this.api_access_token = api_access_token;
    }
}
