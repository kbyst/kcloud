package com.github.kbyst.kcloudregistryconsul.domain;

import java.util.Date;

public class TagData {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     * 标签id
     */
    private Long tagId;
    /**
     * 标签分类id
     */
    private Long tagCategoryId;
    /**
     * 人员id
     */
    private Long personId;
    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagCategoryId() {
        return tagCategoryId;
    }

    public void setTagCategoryId(Long tagCategoryId) {
        this.tagCategoryId = tagCategoryId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
