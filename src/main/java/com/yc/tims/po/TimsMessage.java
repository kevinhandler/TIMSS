package com.yc.tims.po;

import java.util.Date;

public class TimsMessage {
    private Integer mId;

    private Integer uId;

    private String mMsginfo;

    private String mReply;

    private Date mMsgtime;

    private Date mReplytime;

    
    
    @Override
	public String toString() {
		return "TimsMessage [mId=" + mId + ", uId=" + uId + ", mMsginfo=" + mMsginfo + ", mReply=" + mReply
				+ ", mMsgtime=" + mMsgtime + ", mReplytime=" + mReplytime + "]";
	}

	public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getmMsginfo() {
        return mMsginfo;
    }

    public void setmMsginfo(String mMsginfo) {
        this.mMsginfo = mMsginfo == null ? null : mMsginfo.trim();
    }

    public String getmReply() {
        return mReply;
    }

    public void setmReply(String mReply) {
        this.mReply = mReply == null ? null : mReply.trim();
    }

    public Date getmMsgtime() {
        return mMsgtime;
    }

    public void setmMsgtime(Date mMsgtime) {
        this.mMsgtime = mMsgtime;
    }

    public Date getmReplytime() {
        return mReplytime;
    }

    public void setmReplytime(Date mReplytime) {
        this.mReplytime = mReplytime;
    }
}