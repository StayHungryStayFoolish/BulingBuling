package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 下午11:25 on 17/1/8.
 * <p>
 * 视频上传
 */
public class VideoUpload {

    // 文件名字
    private String fileName;

    // 文件大小
    private long fileSize;

    // 长传剩余
    private long fileRemainder;

    // 上传标记 ,大于0 是上传成功
    private int tag = 0;

    // 百分比
    private int percent = 0;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getFileRemainder() {
        return fileRemainder;
    }

    public void setFileRemainder(long fileRemainder) {
        this.fileRemainder = fileRemainder;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
