package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;

//import java.util.Date;


@Entity
@SequenceGenerator(name = "experimentIdSequence", initialValue = 1, allocationSize = 1, sequenceName = "experimentIdSequence")
public class Experiment implements Serializable {

	private static final long serialVersionUID = -2250796873616544761L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experimentIdSequence")
	private Long id;
	private String name;
	private Long experimentSize;

	public Experiment(){}
	
	public Experiment(Long id, String name, Long experimentSize){
		super();
		this.id = id;
		this.name = name;
		this.experimentSize = experimentSize;
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

	public Long getExperimentSize() {
		return experimentSize;
	}

	public void setExperimentSize(Long experimentSize) {
		this.experimentSize = experimentSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((experimentSize == null) ? 0 : experimentSize.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Experiment other = (Experiment) obj;
		if (experimentSize == null) {
			if (other.experimentSize != null)
				return false;
		} else if (!experimentSize.equals(other.experimentSize))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Experiment [id=" + id + ", name=" + name + ", experimentSize=" + experimentSize + "]";
	}
	
}