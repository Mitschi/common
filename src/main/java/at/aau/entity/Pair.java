package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "pairIdSequence", initialValue = 1, allocationSize = 1, sequenceName = "pairIdSequence")
public class Pair implements Serializable{

	private static final long serialVersionUID = -3366267414473660828L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pairIdSequence")
	private Long id;
	
	private Long experimentId;
	private Long oldCommitId;
	private Long newCommitId;
	private String filePath;
	private String oldCommitIdHash;
	private String newCommitIdHash;
	private Boolean visited;
	
	public Pair(){};
	
	public Pair(Long id, Long experimentId, Long oldCommitId,Long newCommitId, String filePath,String oldCommitIdHash, String newCommitIdHash, Boolean visited){
		super();
		this.id = id;
		this.experimentId = experimentId;
		this.oldCommitId = oldCommitId;
		this.newCommitId = newCommitId;
		this.filePath = filePath;
		this.oldCommitIdHash = oldCommitIdHash;
		this.newCommitIdHash = newCommitIdHash;
		this.visited = visited;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExperimentId() {
		return experimentId;
	}

	public void setExperimentId(Long experimentId) {
		this.experimentId = experimentId;
	}

	public Long getOldCommitId() {
		return oldCommitId;
	}

	public void setOldCommitId(Long oldCommitId) {
		this.oldCommitId = oldCommitId;
	}

	public Long getNewCommitId() {
		return newCommitId;
	}

	public void setNewCommitId(Long newCommitId) {
		this.newCommitId = newCommitId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOldCommitIdHash() {
		return oldCommitIdHash;
	}

	public void setOldCommitIdHash(String oldCommitIdHash) {
		this.oldCommitIdHash = oldCommitIdHash;
	}

	public String getNewCommitIdHash() {
		return newCommitIdHash;
	}

	public void setNewCommitIdHash(String newCommitIdHash) {
		this.newCommitIdHash = newCommitIdHash;
	}

	public Boolean getVisited() {
		return visited;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((experimentId == null) ? 0 : experimentId.hashCode());
		result = prime * result
				+ ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((newCommitId == null) ? 0 : newCommitId.hashCode());
		result = prime * result
				+ ((newCommitIdHash == null) ? 0 : newCommitIdHash.hashCode());
		result = prime * result
				+ ((oldCommitId == null) ? 0 : oldCommitId.hashCode());
		result = prime * result
				+ ((oldCommitIdHash == null) ? 0 : oldCommitIdHash.hashCode());
		result = prime * result + ((visited == null) ? 0 : visited.hashCode());
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
		Pair other = (Pair) obj;
		if (experimentId == null) {
			if (other.experimentId != null)
				return false;
		} else if (!experimentId.equals(other.experimentId))
			return false;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (newCommitId == null) {
			if (other.newCommitId != null)
				return false;
		} else if (!newCommitId.equals(other.newCommitId))
			return false;
		if (newCommitIdHash == null) {
			if (other.newCommitIdHash != null)
				return false;
		} else if (!newCommitIdHash.equals(other.newCommitIdHash))
			return false;
		if (oldCommitId == null) {
			if (other.oldCommitId != null)
				return false;
		} else if (!oldCommitId.equals(other.oldCommitId))
			return false;
		if (oldCommitIdHash == null) {
			if (other.oldCommitIdHash != null)
				return false;
		} else if (!oldCommitIdHash.equals(other.oldCommitIdHash))
			return false;
		if (visited == null) {
			if (other.visited != null)
				return false;
		} else if (!visited.equals(other.visited))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pair [id=" + id + ", experimentId=" + experimentId
				+ ", oldCommitId=" + oldCommitId + ", newCommitId="
				+ newCommitId + ", filePath=" + filePath + ", oldCommitIdHash="
				+ oldCommitIdHash + ", newCommitIdHash=" + newCommitIdHash
				+ ", visited=" + visited + "]";
	}

	
}
