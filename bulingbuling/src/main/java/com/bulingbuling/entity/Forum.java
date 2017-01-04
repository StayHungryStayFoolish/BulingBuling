package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 下午11:23 on 17/1/4.
 * <p>
 * 论坛帖子
 */
public class Forum {

    // 文章ID
    private String forumId;

    // 文章标题
    private String forumTitle;

    // 文章内容
    private String forumContent;

    // 发布人名字
    private String forumUserName;

    // 发布时间
    private String forumTime;

    // 发布类别
    private String forumCategory;

    // 帖子浏览量
    private String forumAmount;

    // 头像
    private String forumAvatar;

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public String getForumContent() {
        return forumContent;
    }

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent;
    }

    public String getForumUserName() {
        return forumUserName;
    }

    public void setForumUserName(String forumUserName) {
        this.forumUserName = forumUserName;
    }

    public String getForumTime() {
        return forumTime;
    }

    public void setForumTime(String forumTime) {
        this.forumTime = forumTime;
    }

    public String getForumCategory() {
        return forumCategory;
    }

    public void setForumCategory(String forumCategory) {
        this.forumCategory = forumCategory;
    }

    public String getForumAmount() {
        return forumAmount;
    }

    public void setForumAmount(String forumAmount) {
        this.forumAmount = forumAmount;
    }

    public String getForumAvatar() {
        return forumAvatar;
    }

    public void setForumAvatar(String forumAvatar) {
        this.forumAvatar = forumAvatar;
    }
}
