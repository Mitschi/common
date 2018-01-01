package at.aau.messaging;

import java.io.Serializable;

public class BuildRevision implements Serializable {
    private String cloneUrl;
    private String projectId;
    private String revision;
    private String buildLog;
    private String buildResult;

    public BuildRevision() {
    }

    public BuildRevision(String cloneUrl, String projectId, String revision, String buildLog, String buildResult) {
        this.cloneUrl = cloneUrl;
        this.projectId = projectId;
        this.revision = revision;
        this.buildLog = buildLog;
        this.buildResult = buildResult;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getBuildLog() {
        return buildLog;
    }

    public void setBuildLog(String buildLog) {
        this.buildLog = buildLog;
    }

    public String getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(String buildResult) {
        this.buildResult = buildResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildRevision that = (BuildRevision) o;

        if (cloneUrl != null ? !cloneUrl.equals(that.cloneUrl) : that.cloneUrl != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (revision != null ? !revision.equals(that.revision) : that.revision != null) return false;
        if (buildLog != null ? !buildLog.equals(that.buildLog) : that.buildLog != null) return false;
        return buildResult != null ? buildResult.equals(that.buildResult) : that.buildResult == null;
    }

    @Override
    public int hashCode() {
        int result = cloneUrl != null ? cloneUrl.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (revision != null ? revision.hashCode() : 0);
        result = 31 * result + (buildLog != null ? buildLog.hashCode() : 0);
        result = 31 * result + (buildResult != null ? buildResult.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BuildRevision{" +
                "cloneUrl='" + cloneUrl + '\'' +
                ", projectId='" + projectId + '\'' +
                ", revision='" + revision + '\'' +
                ", buildLog='" + buildLog + '\'' +
                ", buildResult='" + buildResult + '\'' +
                '}';
    }
}
