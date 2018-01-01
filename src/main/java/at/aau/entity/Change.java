package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "changeIdSequence", initialValue = 1, allocationSize = 1, sequenceName="changeIdSequence")
public class Change  implements Serializable {
	private static final long serialVersionUID = -4573738303039912778L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "changeIdSequence")
	private Long id;
	
	private String oldCommitId;
	private String newCommitId;
	@Column(columnDefinition = "TEXT")
	private String oldValue;
	@Column(columnDefinition = "TEXT")
	private String newValue;
	@Column(columnDefinition = "TEXT")
	private String filePath;
	
	private String change;//ADD/DELETE/UPDATE
	private ChangeType changeCategory;
	private String changeType; 
	private String changeTypeCategory;
	
	private long commitId;
	
	@Column(columnDefinition = "TEXT")
	private String parentEntity;
	
	public Change(){}

	public Change(Long id, String oldCommitId, String newCommitId,
			String oldValue, String newValue, String filePath, String change,
			ChangeType changeCategory, String changeType,
			String changeTypeCategory, long commitId, String parentEntity) {
		super();
		this.id = id;
		this.oldCommitId = oldCommitId;
		this.newCommitId = newCommitId;
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.filePath = filePath;
		this.change = change;
		this.changeCategory = changeCategory;
		this.changeType = changeType;
		this.changeTypeCategory = changeTypeCategory;
		this.commitId = commitId;
		this.parentEntity=parentEntity;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOldCommitId() {
		return oldCommitId;
	}

	public void setOldCommitId(String oldCommitId) {
		this.oldCommitId = oldCommitId;
	}

	public String getNewCommitId() {
		return newCommitId;
	}

	public void setNewCommitId(String newCommitId) {
		this.newCommitId = newCommitId;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public ChangeType getChangeCategory() {
		return changeCategory;
	}

	public void setChangeCategory(ChangeType changeCategory) {
		this.changeCategory = changeCategory;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getChangeTypeCategory() {
		return changeTypeCategory;
	}

	public void setChangeTypeCategory(String changeTypeCategory) {
		this.changeTypeCategory = changeTypeCategory;
	}

	public long getCommitId() {
		return commitId;
	}

	public void setCommitId(long commitId) {
		this.commitId = commitId;
	}

	
	
	public String getParentEntity() {
		return parentEntity;
	}

	public void setParentEntity(String parentEntity) {
		this.parentEntity = parentEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((change == null) ? 0 : change.hashCode());
		result = prime * result
				+ ((changeCategory == null) ? 0 : changeCategory.hashCode());
		result = prime * result
				+ ((changeType == null) ? 0 : changeType.hashCode());
		result = prime
				* result
				+ ((changeTypeCategory == null) ? 0 : changeTypeCategory
						.hashCode());
		result = prime * result + (int) (commitId ^ (commitId >>> 32));
		result = prime * result
				+ ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((newCommitId == null) ? 0 : newCommitId.hashCode());
		result = prime * result
				+ ((newValue == null) ? 0 : newValue.hashCode());
		result = prime * result
				+ ((oldCommitId == null) ? 0 : oldCommitId.hashCode());
		result = prime * result
				+ ((oldValue == null) ? 0 : oldValue.hashCode());
		result = prime * result
				+ ((parentEntity == null) ? 0 : parentEntity.hashCode());
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
		Change other = (Change) obj;
		if (change == null) {
			if (other.change != null)
				return false;
		} else if (!change.equals(other.change))
			return false;
		if (changeCategory != other.changeCategory)
			return false;
		if (changeType == null) {
			if (other.changeType != null)
				return false;
		} else if (!changeType.equals(other.changeType))
			return false;
		if (changeTypeCategory == null) {
			if (other.changeTypeCategory != null)
				return false;
		} else if (!changeTypeCategory.equals(other.changeTypeCategory))
			return false;
		if (commitId != other.commitId)
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
		if (newValue == null) {
			if (other.newValue != null)
				return false;
		} else if (!newValue.equals(other.newValue))
			return false;
		if (oldCommitId == null) {
			if (other.oldCommitId != null)
				return false;
		} else if (!oldCommitId.equals(other.oldCommitId))
			return false;
		if (oldValue == null) {
			if (other.oldValue != null)
				return false;
		} else if (!oldValue.equals(other.oldValue))
			return false;
		if (parentEntity == null) {
			if (other.parentEntity != null)
				return false;
		} else if (!parentEntity.equals(other.parentEntity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Change [id=" + id + ", oldCommitId=" + oldCommitId
				+ ", newCommitId=" + newCommitId + ", oldValue=" + oldValue
				+ ", newValue=" + newValue + ", filePath=" + filePath
				+ ", change=" + change + ", changeCategory=" + changeCategory
				+ ", changeType=" + changeType + ", changeTypeCategory="
				+ changeTypeCategory + ", commitId=" + commitId
				+ ", parentEntity=" + parentEntity + "]";
	}

	
}
