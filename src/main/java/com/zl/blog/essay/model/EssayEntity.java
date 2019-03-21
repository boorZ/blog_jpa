package com.zl.blog.essay.model;

import com.zl.common.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章(essay)
 *
 * @author zhoulin
 * @version 1.0.0 2019-03-20
 */
@Entity
@Table(name = "essay")
public class EssayEntity extends BaseEntity implements Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5718532179248032501L;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "label", length = 100)
    private String label;

    @Column(name = "browse_number", length = 10)
    private Integer browseNumber;

    @Column(name = "create_nm", length = 100)
    private String createNm;

    @Column(name = "create_at", length = 26)
    private Date createAt;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getBrowseNumber() {
        return this.browseNumber;
    }

    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }

    public String getCreateNm() {
        return createNm;
    }

    public void setCreateNm(String createNm) {
        this.createNm = createNm;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}