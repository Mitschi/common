package at.aau.building;

import at.aau.entity.BuildResult;
import at.aau.entity.FineGrainedBuildResult;

import java.util.ArrayList;
import java.util.List;


public class BuildLog {
    private BuildDuration buildDuration;
    private BuildResult buildResult=BuildResult.UNKNOWN_FAILED; //use this later maybe
    private FineGrainedBuildResult fineGrainedBuildResult = FineGrainedBuildResult.UNKNOWN;
    private List<String> missingDependencies=new ArrayList<>();
    private List<CompilationDetail> missingTypes=new ArrayList<>();
    private List<String> failingPlugins=new ArrayList<>();
    private String failingModuleName;
    private boolean containsMavenLog=true;
    private String errorMessageLine;
    private String cycle1,cycle2;

    private String comment;

    public BuildLog(BuildDuration buildDuration, BuildResult buildResult, List<String> missingDependencies, List<String> failingPlugins, String failingModuleName, boolean containsMavenLog, String errorMessageLine, String cycle1, String cycle2) {
        this.buildDuration = buildDuration;
        this.buildResult = buildResult;
        this.missingDependencies = missingDependencies;
        this.failingPlugins = failingPlugins;
        this.failingModuleName=failingModuleName;
        this.containsMavenLog = containsMavenLog;
        this.errorMessageLine = errorMessageLine;
        this.cycle1 = cycle1;
        this.cycle2 = cycle2;
    }

    public BuildLog(BuildDuration buildDuration, BuildResult buildResult, List<String> missingDependencies, List<CompilationDetail> missingTypes, List<String> failingPlugins, String failingModuleName, boolean containsMavenLog, String errorMessageLine, String cycle1, String cycle2) {
        this.buildDuration = buildDuration;
        this.buildResult = buildResult;
        this.missingDependencies = missingDependencies;
        this.missingTypes = missingTypes;
        this.failingPlugins = failingPlugins;
        this.failingModuleName=failingModuleName;
        this.containsMavenLog = containsMavenLog;
        this.errorMessageLine = errorMessageLine;
        this.cycle1 = cycle1;
        this.cycle2 = cycle2;
    }

    public BuildLog() {

    }

    public BuildDuration getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(BuildDuration buildDuration) {
        this.buildDuration = buildDuration;
    }

    public BuildResult getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(BuildResult buildResult) {
        this.buildResult = buildResult;
    }

    public List<String> getMissingDependencies() {
        return missingDependencies;
    }

    public void setMissingDependencies(List<String> missingDependencies) {
        this.missingDependencies = missingDependencies;
    }

    public List<String> getFailingPlugins() {
        return failingPlugins;
    }

    public void setFailingPlugins(List<String> failingPlugins) {
        this.failingPlugins = failingPlugins;
    }

    public String getFailingModuleName() {
        return failingModuleName;
    }

    public void setFailingModuleName(String failingModuleName) {
        this.failingModuleName = failingModuleName;
    }

    public boolean isContainsMavenLog() {
        return containsMavenLog;
    }

    public void setContainsMavenLog(boolean containsMavenLog) {
        this.containsMavenLog = containsMavenLog;
    }

    public String getErrorMessageLine() {
        return errorMessageLine;
    }

    public void setErrorMessageLine(String errorMessageLine) {
        this.errorMessageLine = errorMessageLine;
    }

    public String getCycle1() {
        return cycle1;
    }

    public void setCycle1(String cycle1) {
        this.cycle1 = cycle1;
    }

    public String getCycle2() {
        return cycle2;
    }

    public void setCycle2(String cycle2) {
        this.cycle2 = cycle2;
    }

    public List<CompilationDetail> getMissingTypes() {
        return missingTypes;
    }

    public void setMissingTypes(List<CompilationDetail> missingTypes) {
        this.missingTypes = missingTypes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public FineGrainedBuildResult getFineGrainedBuildResult() {
        return fineGrainedBuildResult;
    }

    public void setFineGrainedBuildResult(FineGrainedBuildResult fineGrainedBuildResult) {
        this.fineGrainedBuildResult = fineGrainedBuildResult;
    }
}
