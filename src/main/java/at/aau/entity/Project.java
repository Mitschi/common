package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/*
 * ALWAYS REGENERATE EQUALS AND HASHCODE AND TOSTRING METHODS WHEN CHANGING ENTITIES
 */
@Entity
@SequenceGenerator(name = "projectIdSequence", initialValue = 1, allocationSize = 1, sequenceName="projectIdSequence")
public class Project implements Serializable {
	private static final long serialVersionUID = 1659997442136157776L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectIdSequence")
	private Long id;

	private String name;
	
	@OneToMany(mappedBy="projectId")
	private List<Commit> commits;
	
	@OneToMany(mappedBy="projectId")
	private List<WorkItem> workItems;

	private String repoFolderName;
	
	private IssueTracker issueTracker;
	
	private String issueTrackingSystemUrl;

	private String buildResultsFolder;

	private String repoFolderRemoteName;
	
	public Project() {
	}

	public Project(Long id, String name, List<Commit> commits,
			List<WorkItem> workItems, String repoFolderName,
			IssueTracker issueTracker, String issueTrackingSystemUrl, String buildResultsFolder, String repoFolderRemoteName) {
		super();
		this.id = id;
		this.name = name;
		this.commits = commits;
		this.workItems = workItems;
		this.repoFolderName = repoFolderName;
		this.issueTracker = issueTracker;
		this.issueTrackingSystemUrl = issueTrackingSystemUrl;
		this.buildResultsFolder = buildResultsFolder;
		this.repoFolderRemoteName = repoFolderRemoteName;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Commit> getCommits() {
		return commits;
	}

	public void setCommits(List<Commit> commits) {
		this.commits = commits;
	}

	public List<WorkItem> getWorkItems() {
		return workItems;
	}

	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}

	public String getRepoFolderName() {
		return repoFolderName;
	}

	public void setRepoFolderName(String repoFolderName) {
		this.repoFolderName = repoFolderName;
	}

	public IssueTracker getIssueTracker() {
		return issueTracker;
	}

	public void setIssueTracker(IssueTracker issueTracker) {
		this.issueTracker = issueTracker;
	}

	public String getIssueTrackingSystemUrl() {
		return issueTrackingSystemUrl;
	}

	public void setIssueTrackingSystemUrl(String issueTrackingSystemUrl) {
		this.issueTrackingSystemUrl = issueTrackingSystemUrl;
	}

	public String getBuildResultsFolder() {
		return buildResultsFolder;
	}

	public void setBuildResultsFolder(String buildResultsFolder) {
		this.buildResultsFolder = buildResultsFolder;
	}
	
	public String getRepoFolderRemoteName() {
		return repoFolderRemoteName;
	}

	public void setRepoFolderRemoteName(String repoFolderRemoteName) {
		this.repoFolderRemoteName = repoFolderRemoteName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((buildResultsFolder == null) ? 0 : buildResultsFolder
						.hashCode());
		result = prime * result + ((commits == null) ? 0 : commits.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((issueTracker == null) ? 0 : issueTracker.hashCode());
		result = prime
				* result
				+ ((issueTrackingSystemUrl == null) ? 0
						: issueTrackingSystemUrl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((repoFolderName == null) ? 0 : repoFolderName.hashCode());
		result = prime
				* result
				+ ((repoFolderRemoteName == null) ? 0 : repoFolderRemoteName
						.hashCode());
		result = prime * result
				+ ((workItems == null) ? 0 : workItems.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (buildResultsFolder == null) {
			if (other.buildResultsFolder != null)
				return false;
		} else if (!buildResultsFolder.equals(other.buildResultsFolder))
			return false;
		if (commits == null) {
			if (other.commits != null)
				return false;
		} else if (!commits.equals(other.commits))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (issueTracker != other.issueTracker)
			return false;
		if (issueTrackingSystemUrl == null) {
			if (other.issueTrackingSystemUrl != null)
				return false;
		} else if (!issueTrackingSystemUrl.equals(other.issueTrackingSystemUrl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (repoFolderName == null) {
			if (other.repoFolderName != null)
				return false;
		} else if (!repoFolderName.equals(other.repoFolderName))
			return false;
		if (repoFolderRemoteName == null) {
			if (other.repoFolderRemoteName != null)
				return false;
		} else if (!repoFolderRemoteName.equals(other.repoFolderRemoteName))
			return false;
		if (workItems == null) {
			if (other.workItems != null)
				return false;
		} else if (!workItems.equals(other.workItems))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", repoFolderName="
				+ repoFolderName + ", issueTracker=" + issueTracker
				+ ", issueTrackingSystemUrl=" + issueTrackingSystemUrl
				+ ", buildResultsFolder=" + buildResultsFolder
				+ ", repoFolderRemoteName=" + repoFolderRemoteName + "]";
	}

	
}
