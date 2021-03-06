package com.video.domain.entity;

import java.util.Arrays;

public class User {
    private String userId;

    private String userLoginName;

    private String userPassword;

    private String userPhone;

    private String userEmail;

    private String userStatus;

    private String userLevel;

    private Integer userIntegral;

    private String lastLoginTime;

    private String lastLoginIp;

    private String userRegisterTime;

    private String userRegisterIp;

    private String isVip;

    private String vipEffectiveTime;

    private String deleteFlag;

    private String userRealName;

    private String userNickName;

    private String userEducationStatus;

    private String userAddressDivisions;

    private String userAddressDetail;

    private String userSex;

    private Integer userAge;

    private String updateTime;

    private String userSignature;

    private byte[] userPhoto;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime == null ? null : userRegisterTime.trim();
    }

    public String getUserRegisterIp() {
        return userRegisterIp;
    }

    public void setUserRegisterIp(String userRegisterIp) {
        this.userRegisterIp = userRegisterIp == null ? null : userRegisterIp.trim();
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip == null ? null : isVip.trim();
    }

    public String getVipEffectiveTime() {
        return vipEffectiveTime;
    }

    public void setVipEffectiveTime(String vipEffectiveTime) {
        this.vipEffectiveTime = vipEffectiveTime == null ? null : vipEffectiveTime.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserEducationStatus() {
        return userEducationStatus;
    }

    public void setUserEducationStatus(String userEducationStatus) {
        this.userEducationStatus = userEducationStatus == null ? null : userEducationStatus.trim();
    }

    public String getUserAddressDivisions() {
        return userAddressDivisions;
    }

    public void setUserAddressDivisions(String userAddressDivisions) {
        this.userAddressDivisions = userAddressDivisions == null ? null : userAddressDivisions.trim();
    }

    public String getUserAddressDetail() {
        return userAddressDetail;
    }

    public void setUserAddressDetail(String userAddressDetail) {
        this.userAddressDetail = userAddressDetail == null ? null : userAddressDetail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }

	public User(String userId, String userLoginName, String userPassword, String userPhone, String userEmail,
			String userStatus, String userLevel, Integer userIntegral, String lastLoginTime, String lastLoginIp,
			String userRegisterTime, String userRegisterIp, String isVip, String vipEffectiveTime, String deleteFlag,
			String userRealName, String userNickName, String userEducationStatus, String userAddressDivisions,
			String userAddressDetail, String userSex, Integer userAge, String updateTime, String userSignature,
			byte[] userPhoto) {
		super();
		this.userId = userId;
		this.userLoginName = userLoginName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userStatus = userStatus;
		this.userLevel = userLevel;
		this.userIntegral = userIntegral;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.userRegisterTime = userRegisterTime;
		this.userRegisterIp = userRegisterIp;
		this.isVip = isVip;
		this.vipEffectiveTime = vipEffectiveTime;
		this.deleteFlag = deleteFlag;
		this.userRealName = userRealName;
		this.userNickName = userNickName;
		this.userEducationStatus = userEducationStatus;
		this.userAddressDivisions = userAddressDivisions;
		this.userAddressDetail = userAddressDetail;
		this.userSex = userSex;
		this.userAge = userAge;
		this.updateTime = updateTime;
		this.userSignature = userSignature;
		this.userPhoto = userPhoto;
	}

	public User(String userId, String userPassword, String userSex, Integer userAge) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "{\"userId\":\"" + userId + "\",\"userLoginName\":\"" + userLoginName + "\",\"userPassword\":\""
				+ userPassword + "\",\"userPhone\":\"" + userPhone + "\",\"userEmail\":\"" + userEmail
				+ "\",\"userStatus\":\"" + userStatus + "\",\"userLevel\":\"" + userLevel + "\",\"userIntegral\":\""
				+ userIntegral + "\",\"lastLoginTime\":\"" + lastLoginTime + "\",\"lastLoginIp\":\"" + lastLoginIp
				+ "\",\"userRegisterTime\":\"" + userRegisterTime + "\",\"userRegisterIp\":\"" + userRegisterIp
				+ "\",\"isVip\":\"" + isVip + "\",\"vipEffectiveTime\":\"" + vipEffectiveTime + "\",\"deleteFlag\":\""
				+ deleteFlag + "\",\"userRealName\":\"" + userRealName + "\",\"userNickName\":\"" + userNickName
				+ "\",\"userEducationStatus\":\"" + userEducationStatus + "\",\"userAddressDivisions\":\""
				+ userAddressDivisions + "\",\"userAddressDetail\":\"" + userAddressDetail + "\",\"userSex\":\""
				+ userSex + "\",\"userAge\":\"" + userAge + "\",\"updateTime\":\"" + updateTime
				+ "\",\"userSignature\":\"" + userSignature + "\",\"userPhoto\":\"" + Arrays.toString(userPhoto)
				+ "\"} ";
	}

}