package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@SequenceGenerator(name = "commitIdSequence", initialValue = 1, allocationSize = 1, sequenceName="commitIdSequence")
public class Commit  implements Serializable {
	private static final long serialVersionUID = 8372114489024883221L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commitIdSequence")
	private Long id;
	private String commitId;
	private long projectId;
	@OneToMany(mappedBy="commitId")
	private List<Change> changes;
	@Column(columnDefinition = "TEXT")
	private String commitMessage;
	private Long workItemId;
	@OneToMany(mappedBy="commitId")
	private List<Build> builds;

    @OneToMany(mappedBy="commitId")
    private List<CommitParent> parentCommits;
	
	private String committerName;
	private String committerEMail;
	private String authorName;
	private String authorEMail;
	
	private Date commitDate;
	
	private BuildResult buildResult;

	private Boolean changeExtractionPerformed;
	
	public Commit(){}

	public Commit(Long id, String commitId, long projectId,
                  List<Change> changes, String commitMessage, Long workItemId,
                  List<Build> builds, String committerName,
                  String committerEMail, String authorName, String authorEMail,
                  Date commitDate, BuildResult buildResult, Boolean changeExtractionPerformed, List<CommitParent> parentCommits) {
		super();
		this.id = id;
		this.commitId = commitId;
		this.projectId = projectId;
		this.changes = changes;
		this.commitMessage = commitMessage;
		this.workItemId = workItemId;
		this.builds = builds;
		this.committerName = committerName;
		this.committerEMail = committerEMail;
		this.authorName = authorName;
		this.authorEMail = authorEMail;
		this.commitDate = commitDate;
        this.changeExtractionPerformed = changeExtractionPerformed;
        this.buildResult = buildResult;
        this.parentCommits = parentCommits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public List<Change> getChanges() {
		return changes;
	}

	public void setChanges(List<Change> changes) {
		this.changes = changes;
	}

	public String getCommitMessage() {
		return commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	public Long getWorkItemId() {
		return workItemId;
	}

	public void setWorkItemId(Long workItemId) {
		this.workItemId = workItemId;
	}

	public List<Build> getBuilds() {
		return builds;
	}

	public void setBuilds(List<Build> builds) {
		this.builds = builds;
	}

	public String getCommitterName() {
		return committerName;
	}

	public void setCommitterName(String committerName) {
		this.committerName = committerName;
	}

	public String getCommitterEMail() {
		return committerEMail;
	}

	public void setCommitterEMail(String committerEMail) {
		this.committerEMail = committerEMail;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorEMail() {
		return authorEMail;
	}

	public void setAuthorEMail(String authorEMail) {
		this.authorEMail = authorEMail;
	}

	public Date getCommitDate() {
		return commitDate;
	}

	public void setCommitDate(Date commitDate) {
		this.commitDate = commitDate;
	}

	public BuildResult getBuildResult() {
		return buildResult;
	}

	public void setBuildResult(BuildResult buildResult) {
		this.buildResult = buildResult;
	}

    public Boolean getChangeExtractionPerformed() {
        return changeExtractionPerformed;
    }

    public void setChangeExtractionPerformed(Boolean changeExtractionPerformed) {
        this.changeExtractionPerformed = changeExtractionPerformed;
    }

    public List<CommitParent> getParentCommits() {
        return parentCommits;
    }

    public void setParentCommits(List<CommitParent> parentCommits) {
        this.parentCommits = parentCommits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commit commit = (Commit) o;

        if (projectId != commit.projectId) return false;
        if (id != null ? !id.equals(commit.id) : commit.id != null) return false;
        if (commitId != null ? !commitId.equals(commit.commitId) : commit.commitId != null) return false;
        if (changes != null ? !changes.equals(commit.changes) : commit.changes != null) return false;
        if (commitMessage != null ? !commitMessage.equals(commit.commitMessage) : commit.commitMessage != null)
            return false;
        if (workItemId != null ? !workItemId.equals(commit.workItemId) : commit.workItemId != null) return false;
        if (builds != null ? !builds.equals(commit.builds) : commit.builds != null) return false;
        if (parentCommits != null ? !parentCommits.equals(commit.parentCommits) : commit.parentCommits != null)
            return false;
        if (committerName != null ? !committerName.equals(commit.committerName) : commit.committerName != null)
            return false;
        if (committerEMail != null ? !committerEMail.equals(commit.committerEMail) : commit.committerEMail != null)
            return false;
        if (authorName != null ? !authorName.equals(commit.authorName) : commit.authorName != null) return false;
        if (authorEMail != null ? !authorEMail.equals(commit.authorEMail) : commit.authorEMail != null) return false;
        if (commitDate != null ? !commitDate.equals(commit.commitDate) : commit.commitDate != null) return false;
        if (buildResult != commit.buildResult) return false;
        return changeExtractionPerformed != null ? changeExtractionPerformed.equals(commit.changeExtractionPerformed) : commit.changeExtractionPerformed == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commitId != null ? commitId.hashCode() : 0);
        result = 31 * result + (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (changes != null ? changes.hashCode() : 0);
        result = 31 * result + (commitMessage != null ? commitMessage.hashCode() : 0);
        result = 31 * result + (workItemId != null ? workItemId.hashCode() : 0);
        result = 31 * result + (builds != null ? builds.hashCode() : 0);
        result = 31 * result + (parentCommits != null ? parentCommits.hashCode() : 0);
        result = 31 * result + (committerName != null ? committerName.hashCode() : 0);
        result = 31 * result + (committerEMail != null ? committerEMail.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (authorEMail != null ? authorEMail.hashCode() : 0);
        result = 31 * result + (commitDate != null ? commitDate.hashCode() : 0);
        result = 31 * result + (buildResult != null ? buildResult.hashCode() : 0);
        result = 31 * result + (changeExtractionPerformed != null ? changeExtractionPerformed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "id=" + id +
                ", commitId='" + commitId + '\'' +
                ", projectId=" + projectId +
                ", changes=" + changes +
                ", commitMessage='" + commitMessage + '\'' +
                ", workItemId=" + workItemId +
                ", builds=" + builds +
                ", parentCommits=" + parentCommits +
                ", committerName='" + committerName + '\'' +
                ", committerEMail='" + committerEMail + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorEMail='" + authorEMail + '\'' +
                ", commitDate=" + commitDate +
                ", buildResult=" + buildResult +
                ", changeExtractionPerformed=" + changeExtractionPerformed +
                '}';
    }
}
