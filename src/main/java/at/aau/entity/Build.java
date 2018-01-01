package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "buildIdSequence", initialValue = 1, allocationSize = 1, sequenceName="buildIdSequence")
public class Build implements Serializable{
	private static final long serialVersionUID = 9203277990885844803L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buildIdSequence")
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String output;
	
	private BuildResult buildResult;
	
	private Long duration;
	
	private String buildInformation; //can later be translated to "buildEnvironment" and hold the data in which the build was performed (e.g. with JDK7)
	
	private Date runDate;
	
	private Long commitId;

	public Build(){}
	
	public Build(Long id, String output, BuildResult buildResult,
			Long duration, String buildInformation, Date runDate, Long commitId) {
		super();
		this.id = id;
		this.output = output;
		this.buildResult = buildResult;
		this.duration = duration;
		this.buildInformation = buildInformation;
		this.runDate = runDate;
		this.commitId = commitId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public BuildResult getBuildResult() {
		return buildResult;
	}

	public void setBuildResult(BuildResult buildResult) {
		this.buildResult = buildResult;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getBuildInformation() {
		return buildInformation;
	}

	public void setBuildInformation(String buildInformation) {
		this.buildInformation = buildInformation;
	}

	public Date getRunDate() {
		return runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	public Long getCommitId() {
		return commitId;
	}

	public void setCommitId(Long commitId) {
		this.commitId = commitId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((buildInformation == null) ? 0 : buildInformation.hashCode());
		result = prime * result
				+ ((buildResult == null) ? 0 : buildResult.hashCode());
		result = prime * result
				+ ((commitId == null) ? 0 : commitId.hashCode());
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((output == null) ? 0 : output.hashCode());
		result = prime * result + ((runDate == null) ? 0 : runDate.hashCode());
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
		Build other = (Build) obj;
		if (buildInformation == null) {
			if (other.buildInformation != null)
				return false;
		} else if (!buildInformation.equals(other.buildInformation))
			return false;
		if (buildResult != other.buildResult)
			return false;
		if (commitId == null) {
			if (other.commitId != null)
				return false;
		} else if (!commitId.equals(other.commitId))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (output == null) {
			if (other.output != null)
				return false;
		} else if (!output.equals(other.output))
			return false;
		if (runDate == null) {
			if (other.runDate != null)
				return false;
		} else if (!runDate.equals(other.runDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Build [id=" + id + ", output=" + output + ", buildResult="
				+ buildResult + ", duration=" + duration
				+ ", buildInformation=" + buildInformation + ", runDate="
				+ runDate + ", commitId=" + commitId + "]";
	}

}
