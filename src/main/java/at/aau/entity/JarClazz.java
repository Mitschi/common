package at.aau.entity;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "jarClazzIdSequence", initialValue = 1, allocationSize = 1, sequenceName="jarClazzIdSequence")
public class JarClazz {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jarClazzIdSequence")
	private Long id;
	
	private Long jarId;
	private Long clazzId;
	public JarClazz(Long id, Long jarId, Long clazzId) {
		super();
		this.id = id;
		this.jarId = jarId;
		this.clazzId = clazzId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getJarId() {
		return jarId;
	}
	public void setJarId(Long jarId) {
		this.jarId = jarId;
	}
	public Long getClazzId() {
		return clazzId;
	}
	public void setClazzId(Long clazzId) {
		this.clazzId = clazzId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clazzId == null) ? 0 : clazzId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jarId == null) ? 0 : jarId.hashCode());
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
		JarClazz other = (JarClazz) obj;
		if (clazzId == null) {
			if (other.clazzId != null)
				return false;
		} else if (!clazzId.equals(other.clazzId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jarId == null) {
			if (other.jarId != null)
				return false;
		} else if (!jarId.equals(other.jarId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JarClazz [id=" + id + ", jarId=" + jarId + ", clazzId="
				+ clazzId + "]";
	}
	
}
