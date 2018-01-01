package at.aau.messaging;

import java.io.Serializable;

public class MessagingCommit implements Serializable{

    private String projectName;
    private final String cloneUrl;
    private Long id;
    private final String commitId;
    private final String parentCommitId;

    public MessagingCommit(String projectName, String cloneUrl, Long id, String commitId, String parentCommitId) {
        this.projectName = projectName;
        this.cloneUrl = cloneUrl;
        this.id = id;
        this.commitId = commitId;
        this.parentCommitId = parentCommitId;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getCommitId() {
        return commitId;
    }

    public String getParentCommitId() {
        return parentCommitId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagingCommit that = (MessagingCommit) o;

        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (cloneUrl != null ? !cloneUrl.equals(that.cloneUrl) : that.cloneUrl != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (commitId != null ? !commitId.equals(that.commitId) : that.commitId != null) return false;
        return parentCommitId != null ? parentCommitId.equals(that.parentCommitId) : that.parentCommitId == null;
    }

    @Override
    public int hashCode() {
        int result = projectName != null ? projectName.hashCode() : 0;
        result = 31 * result + (cloneUrl != null ? cloneUrl.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (commitId != null ? commitId.hashCode() : 0);
        result = 31 * result + (parentCommitId != null ? parentCommitId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessagingCommit{" +
                "projectName='" + projectName + '\'' +
                ", cloneUrl='" + cloneUrl + '\'' +
                ", id=" + id +
                ", commitId='" + commitId + '\'' +
                ", parentCommitId='" + parentCommitId + '\'' +
                '}';
    }
}
