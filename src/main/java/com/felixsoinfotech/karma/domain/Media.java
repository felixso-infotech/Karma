package com.felixsoinfotech.karma.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * Media entity.
 * @author Sanil Kumar p
 */
@ApiModel(description = "Media entity. @author Sanil Kumar p")
@Entity
@Table(name = "media")
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Lob
    @Column(name = "jhi_file")
    private byte[] file;

    @Column(name = "jhi_file_content_type")
    private String fileContentType;

    @ManyToOne
    @JsonIgnoreProperties("activityProofs")
    private CommittedActivity committedActivity;

    @ManyToOne
    @JsonIgnoreProperties("proofs")
    private CompletedChallenge completedChallenge;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public Media fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public Media file(byte[] file) {
        this.file = file;
        return this;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public Media fileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
        return this;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public CommittedActivity getCommittedActivity() {
        return committedActivity;
    }

    public Media committedActivity(CommittedActivity committedActivity) {
        this.committedActivity = committedActivity;
        return this;
    }

    public void setCommittedActivity(CommittedActivity committedActivity) {
        this.committedActivity = committedActivity;
    }

    public CompletedChallenge getCompletedChallenge() {
        return completedChallenge;
    }

    public Media completedChallenge(CompletedChallenge completedChallenge) {
        this.completedChallenge = completedChallenge;
        return this;
    }

    public void setCompletedChallenge(CompletedChallenge completedChallenge) {
        this.completedChallenge = completedChallenge;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Media media = (Media) o;
        if (media.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), media.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Media{" +
            "id=" + getId() +
            ", fileName='" + getFileName() + "'" +
            ", file='" + getFile() + "'" +
            ", fileContentType='" + getFileContentType() + "'" +
            "}";
    }
}
