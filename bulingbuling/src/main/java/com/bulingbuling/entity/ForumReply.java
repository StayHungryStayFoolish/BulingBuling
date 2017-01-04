package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 下午11:40 on 17/1/4.
 *
 * 论坛回复
 */
public class ForumReply {

    // 回复 ID
    private String replyId;

    // 回复内容
    private String replyContent;

    // 回复时间
    private String replyTime;

    // 回复用户头像
    private String replyAvatar;

    // 回复帖子 ID
    private String replyForumId;

    // 回复人名字
    private String replyName;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyAvatar() {
        return replyAvatar;
    }

    public void setReplyAvatar(String replyAvatar) {
        this.replyAvatar = replyAvatar;
    }

    public String getReplyForumId() {
        return replyForumId;
    }

    public void setReplyForumId(String replyForumId) {
        this.replyForumId = replyForumId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }
}
