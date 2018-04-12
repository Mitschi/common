package at.aau.building;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 29.11.17.
 */
public class CompilationDetail {
//[ERROR] /Users/chris/Desktop/tmpTEST/fastjson/src/main/java/com/alibaba/fastjson/support/retrofit/Retrofit2ConverterFactory.java:[137,20] cannot find symbol
//[ERROR] symbol:   variable RequestBody
//[ERROR] location: class com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.RequestBodyConverter<T>

    private int lineNumber; //137
    private int colNumber;  //20
    private String file;    //  /Users/chris/...
    private String type;    //variable
    private String name;    //RequestBody
    private String location;//class: com.alibaba...
    private List<String> offendingClasses = new ArrayList<>(); //classes that don't go together (type mismatch)

    public CompilationDetail(){}
    public CompilationDetail(int lineNumber, int colNumber, String file, String type, String name, String location, List<String> offendingClasses) {
        this.lineNumber = lineNumber;
        this.colNumber = colNumber;
        this.file = file;
        this.type = type;
        this.name = name;
        this.location = location;
        this.offendingClasses = offendingClasses;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getColNumber() {
        return colNumber;
    }

    public void setColNumber(int colNumber) {
        this.colNumber = colNumber;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getOffendingClasses() {
        return offendingClasses;
    }

    public void setOffendingClasses(List<String> offendingClasses) {
        this.offendingClasses = offendingClasses;
    }

    @Override
    public String toString() {
        return "CompilationDetail{" +
                "lineNumber=" + lineNumber +
                ", colNumber=" + colNumber +
                ", file='" + file + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", offendingClasses=" + offendingClasses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompilationDetail that = (CompilationDetail) o;

        if (lineNumber != that.lineNumber) return false;
        if (colNumber != that.colNumber) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        return offendingClasses != null ? offendingClasses.equals(that.offendingClasses) : that.offendingClasses == null;
    }

    @Override
    public int hashCode() {
        int result = lineNumber;
        result = 31 * result + colNumber;
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (offendingClasses != null ? offendingClasses.hashCode() : 0);
        return result;
    }
}
