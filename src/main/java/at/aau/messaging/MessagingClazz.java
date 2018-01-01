package at.aau.messaging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MessagingClazz implements Serializable {
    private Long id;

    private String fullQualifiedName;

    private List<MessagingMethod> methods= new ArrayList<>();

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

    public MessagingClazz(){}
    public MessagingClazz(Long id, String fullQualifiedName, List<MessagingMethod> methods) {
        this.id = id;
        this.fullQualifiedName = fullQualifiedName;
        this.methods = methods;
    }

    public List<MessagingMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<MessagingMethod> methods) {
        this.methods = methods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagingClazz that = (MessagingClazz) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fullQualifiedName != null ? !fullQualifiedName.equals(that.fullQualifiedName) : that.fullQualifiedName != null)
            return false;
        return methods != null ? methods.equals(that.methods) : that.methods == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullQualifiedName != null ? fullQualifiedName.hashCode() : 0);
        result = 31 * result + (methods != null ? methods.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessagingClazz{" +
                "id=" + id +
                ", fullQualifiedName='" + fullQualifiedName + '\'' +
                ", methods=" + methods +
                '}';
    }
}
