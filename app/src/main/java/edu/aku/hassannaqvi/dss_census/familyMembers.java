package edu.aku.hassannaqvi.dss_census;

/**
 * Created by Ali on 04-Feb-17.
 */

public class familyMembers {
    String memberName;
    String cStatus;
    String mStatus;
    String dob;

    public familyMembers(String memberName, String mStatus, String cStatus, String dob) {
        this.memberName = memberName;
        this.cStatus = cStatus;
        this.mStatus = mStatus;
        this.dob = dob;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
