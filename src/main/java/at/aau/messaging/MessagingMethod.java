package at.aau.messaging;

import java.io.Serializable;

public class MessagingMethod implements Serializable {
    private Long id;

    private String name;
    private String returnValue;
    private String parameters;
    private String fullDefinition;

    public MessagingMethod(){}
    public MessagingMethod(Long id, String name, String returnValue, String parameters, String fullDefinition) {
        this.id = id;
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
    public String toString() {
        return "MessagingMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", returnValue='" + returnValue + '\'' +
                ", parameters='" + parameters + '\'' +
                ", fullDefinition='" + fullDefinition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagingMethod that = (MessagingMethod) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (returnValue != null ? !returnValue.equals(that.returnValue) : that.returnValue != null) return false;
        if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null) return false;
        return fullDefinition != null ? fullDefinition.equals(that.fullDefinition) : that.fullDefinition == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (returnValue != null ? returnValue.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (fullDefinition != null ? fullDefinition.hashCode() : 0);
        return result;
    }
}
