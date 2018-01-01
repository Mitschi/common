package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator(name = "clazzIdSequence", initialValue = 1, allocationSize = 1, sequenceName="clazzIdSequence")
public class Clazz implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clazzIdSequence")
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String fullQualifiedName;

	private Long jarId;

    @Column(columnDefinition = "TEXT")
    private String packageName;

    @Column(columnDefinition = "TEXT")
    private String clazzName;

    @OneToMany(mappedBy="clazzId")
    private List<Method> methods=new ArrayList<Method>();

	public Clazz(){}

	@Deprecated
    public Clazz(Long id,String fullQualifiedName, Long jarId, List<Method> methods) {
        this.id=id;
	    this.fullQualifiedName = fullQualifiedName;
        this.jarId = jarId;
        this.methods = methods;
    }

    public Clazz(Long id,String fullQualifiedName, Long jarId, List<Method> methods, String clazzName) {
        this.id=id;
        this.fullQualifiedName = fullQualifiedName;
        this.jarId = jarId;
        this.methods = methods;
        this.clazzName = clazzName;
    }

    public Clazz(Long id,String fullQualifiedName, Long jarId, List<Method> methods, String clazzName, String packageName) {
        this.id=id;
        this.fullQualifiedName = fullQualifiedName;
        this.jarId = jarId;
        this.methods = methods;
        this.clazzName = clazzName;
        this.packageName = packageName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullQualifiedName() {
        return fullQualifiedName;
    }

    public void setFullQualifiedName(String fullQualifiedName) {
        this.fullQualifiedName = fullQualifiedName;
    }

    public Long getJarId() {
        return jarId;
    }

    public void setJarId(Long jarId) {
        this.jarId = jarId;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clazz clazz = (Clazz) o;

        if (id != null ? !id.equals(clazz.id) : clazz.id != null) return false;
        if (fullQualifiedName != null ? !fullQualifiedName.equals(clazz.fullQualifiedName) : clazz.fullQualifiedName != null)
            return false;
        if (jarId != null ? !jarId.equals(clazz.jarId) : clazz.jarId != null) return false;
        return methods != null ? methods.equals(clazz.methods) : clazz.methods == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullQualifiedName != null ? fullQualifiedName.hashCode() : 0);
        result = 31 * result + (jarId != null ? jarId.hashCode() : 0);
        result = 31 * result + (methods != null ? methods.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", fullQualifiedName='" + fullQualifiedName + '\'' +
                ", jarId=" + jarId +
                ", clazzName='" + clazzName + '\'' +
                ", methods=" + methods +
                '}';
    }
}
