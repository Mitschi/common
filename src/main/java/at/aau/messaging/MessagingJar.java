package at.aau.messaging;

import at.aau.entity.Clazz;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagingJar implements Serializable {
    private Long id;

    private List<MessagingClazz> jarClazzes=new ArrayList<MessagingClazz>();

    private String groupId;
    private String artifactId;
    private String version;

    private String fileName;
    private String downloadUrl;

    private Date publishDate;

    public MessagingJar() {
    }

    public MessagingJar(Long id, List<MessagingClazz> jarClazzes, String groupId, String artifactId, String version, String fileName, String downloadUrl, Date publishDate) {
        this.id = id;
        this.jarClazzes = jarClazzes;
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.fileName = fileName;
        this.downloadUrl = downloadUrl;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MessagingClazz> getJarClazzes() {
        return jarClazzes;
    }

    public void setJarClazzes(List<MessagingClazz> jarClazzes) {
        this.jarClazzes = jarClazzes;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagingJar that = (MessagingJar) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (jarClazzes != null ? !jarClazzes.equals(that.jarClazzes) : that.jarClazzes != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (artifactId != null ? !artifactId.equals(that.artifactId) : that.artifactId != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (downloadUrl != null ? !downloadUrl.equals(that.downloadUrl) : that.downloadUrl != null) return false;
        return publishDate != null ? publishDate.equals(that.publishDate) : that.publishDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (jarClazzes != null ? jarClazzes.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (artifactId != null ? artifactId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (downloadUrl != null ? downloadUrl.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessagingJar{" +
                "id=" + id +
                ", jarClazzes=" + jarClazzes +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                ", fileName='" + fileName + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
