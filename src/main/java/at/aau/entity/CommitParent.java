package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "commitParentIdSequence", initialValue = 1, allocationSize = 1, sequenceName="commitParentIdSequence")

public class CommitParent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commitParentIdSequence")
    private Long id;

    private Long commitId;

    private Long parentCommitId;

    public CommitParent() {}

    public CommitParent(Long commitId, Long parentCommitId) {
        this.commitId = commitId;
        this.parentCommitId = parentCommitId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommitId() {
        return commitId;
    }

    public void setCommitId(Long commitId) {
        this.commitId = commitId;
    }

    public Long getParentCommitId() {
        return parentCommitId;
    }

    public void setParentCommitId(Long parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommitParent that = (CommitParent) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (commitId != null ? !commitId.equals(that.commitId) : that.commitId != null) return false;
        return parentCommitId != null ? parentCommitId.equals(that.parentCommitId) : that.parentCommitId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commitId != null ? commitId.hashCode() : 0);
        result = 31 * result + (parentCommitId != null ? parentCommitId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommitParent{" +
                "id=" + id +
                ", commitId=" + commitId +
                ", parentCommitId=" + parentCommitId +
                '}';
    }
}
