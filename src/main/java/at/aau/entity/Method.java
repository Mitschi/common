package at.aau.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "methodIdSequence", initialValue = 1, allocationSize = 1, sequenceName="methodIdSequence")
public class Method {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "methodIdSequence")
	private Long id;

	private Long clazzId;

    @Column(columnDefinition = "TEXT")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String returnValue;

    @Column(columnDefinition = "TEXT")
    private String parameters;

    @Column(columnDefinition = "TEXT")
    private String fullDefinition;

	public Method(){}

    public Method(Long id,Long clazzId, String name, String returnValue, String parameters, String fullDefinition) {
	    this.id=id;
        this.clazzId = clazzId;
        this.name = name;
        this.returnValue = returnValue;
        this.parameters = parameters;
        this.fullDefinition = fullDefinition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getFullDefinition() {
        return fullDefinition;
    }

    public void setFullDefinition(String fullDefinition) {
        this.fullDefinition = fullDefinition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Method method = (Method) o;

        if (id != null ? !id.equals(method.id) : method.id != null) return false;
        if (clazzId != null ? !clazzId.equals(method.clazzId) : method.clazzId != null) return false;
        if (name != null ? !name.equals(method.name) : method.name != null) return false;
        if (returnValue != null ? !returnValue.equals(method.returnValue) : method.returnValue != null) return false;
        if (parameters != null ? !parameters.equals(method.parameters) : method.parameters != null) return false;
        return fullDefinition != null ? fullDefinition.equals(method.fullDefinition) : method.fullDefinition == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (clazzId != null ? clazzId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (returnValue != null ? returnValue.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (fullDefinition != null ? fullDefinition.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Method{" +
                "id=" + id +
                ", clazzId=" + clazzId +
                ", name='" + name + '\'' +
                ", returnValue='" + returnValue + '\'' +
                ", parameters='" + parameters + '\'' +
                ", fullDefinition='" + fullDefinition + '\'' +
                '}';
    }
}
