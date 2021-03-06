package com.lsfly.bas.model.video;

import java.io.Serializable;
import java.util.Date;

public class TVideo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.uid_
     *
     * @mbg.generated
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_path_
     *
     * @mbg.generated
     */
    private String videoPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_name_
     *
     * @mbg.generated
     */
    private String videoName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_size_
     *
     * @mbg.generated
     */
    private String videoSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.total_time_
     *
     * @mbg.generated
     */
    private String totalTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_time_
     *
     * @mbg.generated
     */
    private String videoTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_format_
     *
     * @mbg.generated
     */
    private String videoFormat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.video_cover_
     *
     * @mbg.generated
     */
    private String videoCover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.timestamp_
     *
     * @mbg.generated
     */
    private Long timestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.version_
     *
     * @mbg.generated
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.create_by_
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.create_time_
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.update_by_
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.update_time_
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video_.is_delete_
     *
     * @mbg.generated
     */
    private String isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_video_
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.uid_
     *
     * @return the value of t_video_.uid_
     *
     * @mbg.generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.uid_
     *
     * @param uid the value for t_video_.uid_
     *
     * @mbg.generated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_path_
     *
     * @return the value of t_video_.video_path_
     *
     * @mbg.generated
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_path_
     *
     * @param videoPath the value for t_video_.video_path_
     *
     * @mbg.generated
     */
    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_name_
     *
     * @return the value of t_video_.video_name_
     *
     * @mbg.generated
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_name_
     *
     * @param videoName the value for t_video_.video_name_
     *
     * @mbg.generated
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_size_
     *
     * @return the value of t_video_.video_size_
     *
     * @mbg.generated
     */
    public String getVideoSize() {
        return videoSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_size_
     *
     * @param videoSize the value for t_video_.video_size_
     *
     * @mbg.generated
     */
    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize == null ? null : videoSize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.total_time_
     *
     * @return the value of t_video_.total_time_
     *
     * @mbg.generated
     */
    public String getTotalTime() {
        return totalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.total_time_
     *
     * @param totalTime the value for t_video_.total_time_
     *
     * @mbg.generated
     */
    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime == null ? null : totalTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_time_
     *
     * @return the value of t_video_.video_time_
     *
     * @mbg.generated
     */
    public String getVideoTime() {
        return videoTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_time_
     *
     * @param videoTime the value for t_video_.video_time_
     *
     * @mbg.generated
     */
    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime == null ? null : videoTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_format_
     *
     * @return the value of t_video_.video_format_
     *
     * @mbg.generated
     */
    public String getVideoFormat() {
        return videoFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_format_
     *
     * @param videoFormat the value for t_video_.video_format_
     *
     * @mbg.generated
     */
    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat == null ? null : videoFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.video_cover_
     *
     * @return the value of t_video_.video_cover_
     *
     * @mbg.generated
     */
    public String getVideoCover() {
        return videoCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.video_cover_
     *
     * @param videoCover the value for t_video_.video_cover_
     *
     * @mbg.generated
     */
    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover == null ? null : videoCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.timestamp_
     *
     * @return the value of t_video_.timestamp_
     *
     * @mbg.generated
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.timestamp_
     *
     * @param timestamp the value for t_video_.timestamp_
     *
     * @mbg.generated
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.version_
     *
     * @return the value of t_video_.version_
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.version_
     *
     * @param version the value for t_video_.version_
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.create_by_
     *
     * @return the value of t_video_.create_by_
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.create_by_
     *
     * @param createBy the value for t_video_.create_by_
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.create_time_
     *
     * @return the value of t_video_.create_time_
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.create_time_
     *
     * @param createTime the value for t_video_.create_time_
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.update_by_
     *
     * @return the value of t_video_.update_by_
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.update_by_
     *
     * @param updateBy the value for t_video_.update_by_
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.update_time_
     *
     * @return the value of t_video_.update_time_
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.update_time_
     *
     * @param updateTime the value for t_video_.update_time_
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video_.is_delete_
     *
     * @return the value of t_video_.is_delete_
     *
     * @mbg.generated
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video_.is_delete_
     *
     * @param isDelete the value for t_video_.is_delete_
     *
     * @mbg.generated
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_video_
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", videoPath=").append(videoPath);
        sb.append(", videoName=").append(videoName);
        sb.append(", videoSize=").append(videoSize);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", videoTime=").append(videoTime);
        sb.append(", videoFormat=").append(videoFormat);
        sb.append(", videoCover=").append(videoCover);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", version=").append(version);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_video_
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TVideo other = (TVideo) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getVideoPath() == null ? other.getVideoPath() == null : this.getVideoPath().equals(other.getVideoPath()))
            && (this.getVideoName() == null ? other.getVideoName() == null : this.getVideoName().equals(other.getVideoName()))
            && (this.getVideoSize() == null ? other.getVideoSize() == null : this.getVideoSize().equals(other.getVideoSize()))
            && (this.getTotalTime() == null ? other.getTotalTime() == null : this.getTotalTime().equals(other.getTotalTime()))
            && (this.getVideoTime() == null ? other.getVideoTime() == null : this.getVideoTime().equals(other.getVideoTime()))
            && (this.getVideoFormat() == null ? other.getVideoFormat() == null : this.getVideoFormat().equals(other.getVideoFormat()))
            && (this.getVideoCover() == null ? other.getVideoCover() == null : this.getVideoCover().equals(other.getVideoCover()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_video_
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getVideoPath() == null) ? 0 : getVideoPath().hashCode());
        result = prime * result + ((getVideoName() == null) ? 0 : getVideoName().hashCode());
        result = prime * result + ((getVideoSize() == null) ? 0 : getVideoSize().hashCode());
        result = prime * result + ((getTotalTime() == null) ? 0 : getTotalTime().hashCode());
        result = prime * result + ((getVideoTime() == null) ? 0 : getVideoTime().hashCode());
        result = prime * result + ((getVideoFormat() == null) ? 0 : getVideoFormat().hashCode());
        result = prime * result + ((getVideoCover() == null) ? 0 : getVideoCover().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}