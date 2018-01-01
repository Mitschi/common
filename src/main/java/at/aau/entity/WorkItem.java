package at.aau.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@SequenceGenerator(name = "workItemIdSequence", initialValue = 1, allocationSize = 1, sequenceName="workItemIdSequence")
public class WorkItem implements Serializable{
	private static final long serialVersionUID = -8711830146354834548L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workItemIdSequence")
	private Long id;
	private String workItemName;
	@OneToMany(mappedBy="workItemId")
	private List<Commit> commits;
	private long projectId;
	
	private String issueType;
	//helper attributes
	private Date firstoccurance;
	
	//Source Code Changes
	private Long bodyPartMethodBody=0L;
	private Long bodyPartStructureStatements=0L;
	private Long bodyPartClassBody=0L;
	private Long declarationPartAccessModifier=0L;
	private Long declarationPartFinalModifier=0L;
	private Long declarationPartAttributeDeclaration=0L;
	private Long declarationPartMethodDeclaration=0L;
	private Long declarationPartClassDeclaration=0L;
	private Long otherDocumentation=0L;
	private Long otherUnclassified=0L;
	
	//Commit Categories Hattori et al.
	private Long correctiveEngineering=0L;
	private Long forwardEngineering=0L;
	private Long reEngineering=0L;
	private Long management=0L;
	
	//Base Model McIntosh et al.
	private Long numberOfFiles=0L;
	private Double priorBuildCoChanges=0D;
	private Long testFilesAdded=0L;
	private Long testFilesDeleted=0L;
	private Long testFilesRenamed=0L;
	private Long sourceFilesAdded=0L;
	private Long sourceFilesDeleted=0L;
	private Long sourceFilesRenamed=0L;
	
	private Boolean buildChanging;
	private Boolean fineGrainedbuildChanging;

	
	public WorkItem(){}

	public WorkItem(Long id, String workItemName, List<Commit> commits,
			long projectId, String issueType) {
		super();
		this.id = id;
		this.workItemName = workItemName;
		this.commits = commits;
		this.projectId = projectId;
		this.issueType = issueType;
	}

	public WorkItem(Long id, String workItemName, List<Commit> commits,
			long projectId, String issueType, Date firstoccurance,
			Long bodyPartMethodBody, Long bodyPartStructureStatements,
			Long bodyPartClassBody, Long declarationPartAccessModifier,
			Long declarationPartFinalModifier,
			Long declarationPartAttributeDeclaration,
			Long declarationPartMethodDeclaration,
			Long declarationPartClassDeclaration, Long otherDocumentation,
			Long otherUnclassified, Long correctiveEngineering,
			Long forwardEngineering, Long reEngineering, Long management,
			Long numberOfFiles, Double priorBuildCoChanges,
			Long testFilesAdded, Long testFilesDeleted, Long testFilesRenamed,
			Long sourceFilesAdded, Long sourceFilesDeleted,
			Long sourceFilesRenamed, Boolean buildChanging,
			Boolean fineGrainedbuildChanging) {
		super();
		this.id = id;
		this.workItemName = workItemName;
		this.commits = commits;
		this.projectId = projectId;
		this.issueType = issueType;
		this.firstoccurance = firstoccurance;
		this.bodyPartMethodBody = bodyPartMethodBody;
		this.bodyPartStructureStatements = bodyPartStructureStatements;
		this.bodyPartClassBody = bodyPartClassBody;
		this.declarationPartAccessModifier = declarationPartAccessModifier;
		this.declarationPartFinalModifier = declarationPartFinalModifier;
		this.declarationPartAttributeDeclaration = declarationPartAttributeDeclaration;
		this.declarationPartMethodDeclaration = declarationPartMethodDeclaration;
		this.declarationPartClassDeclaration = declarationPartClassDeclaration;
		this.otherDocumentation = otherDocumentation;
		this.otherUnclassified = otherUnclassified;
		this.correctiveEngineering = correctiveEngineering;
		this.forwardEngineering = forwardEngineering;
		this.reEngineering = reEngineering;
		this.management = management;
		this.numberOfFiles = numberOfFiles;
		this.priorBuildCoChanges = priorBuildCoChanges;
		this.testFilesAdded = testFilesAdded;
		this.testFilesDeleted = testFilesDeleted;
		this.testFilesRenamed = testFilesRenamed;
		this.sourceFilesAdded = sourceFilesAdded;
		this.sourceFilesDeleted = sourceFilesDeleted;
		this.sourceFilesRenamed = sourceFilesRenamed;
		this.buildChanging = buildChanging;
		this.fineGrainedbuildChanging = fineGrainedbuildChanging;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWorkItemName() {
		return workItemName;
	}

	public void setWorkItemName(String workItemName) {
		this.workItemName = workItemName;
	}

	public List<Commit> getCommits() {
		return commits;
	}

	public void setCommits(List<Commit> commits) {
		this.commits = commits;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Date getFirstoccurance() {
		return firstoccurance;
	}

	public void setFirstoccurance(Date firstoccurance) {
		this.firstoccurance = firstoccurance;
	}

	public Long getBodyPartMethodBody() {
		return bodyPartMethodBody;
	}

	public void setBodyPartMethodBody(Long bodyPartMethodBody) {
		this.bodyPartMethodBody = bodyPartMethodBody;
	}

	public Long getBodyPartStructureStatements() {
		return bodyPartStructureStatements;
	}

	public void setBodyPartStructureStatements(Long bodyPartStructureStatements) {
		this.bodyPartStructureStatements = bodyPartStructureStatements;
	}

	public Long getBodyPartClassBody() {
		return bodyPartClassBody;
	}

	public void setBodyPartClassBody(Long bodyPartClassBody) {
		this.bodyPartClassBody = bodyPartClassBody;
	}

	public Long getDeclarationPartAccessModifier() {
		return declarationPartAccessModifier;
	}

	public void setDeclarationPartAccessModifier(Long declarationPartAccessModifier) {
		this.declarationPartAccessModifier = declarationPartAccessModifier;
	}

	public Long getDeclarationPartFinalModifier() {
		return declarationPartFinalModifier;
	}

	public void setDeclarationPartFinalModifier(Long declarationPartFinalModifier) {
		this.declarationPartFinalModifier = declarationPartFinalModifier;
	}

	public Long getDeclarationPartAttributeDeclaration() {
		return declarationPartAttributeDeclaration;
	}

	public void setDeclarationPartAttributeDeclaration(
			Long declarationPartAttributeDeclaration) {
		this.declarationPartAttributeDeclaration = declarationPartAttributeDeclaration;
	}

	public Long getDeclarationPartMethodDeclaration() {
		return declarationPartMethodDeclaration;
	}

	public void setDeclarationPartMethodDeclaration(
			Long declarationPartMethodDeclaration) {
		this.declarationPartMethodDeclaration = declarationPartMethodDeclaration;
	}

	public Long getDeclarationPartClassDeclaration() {
		return declarationPartClassDeclaration;
	}

	public void setDeclarationPartClassDeclaration(
			Long declarationPartClassDeclaration) {
		this.declarationPartClassDeclaration = declarationPartClassDeclaration;
	}

	public Long getOtherDocumentation() {
		return otherDocumentation;
	}

	public void setOtherDocumentation(Long otherDocumentation) {
		this.otherDocumentation = otherDocumentation;
	}

	public Long getOtherUnclassified() {
		return otherUnclassified;
	}

	public void setOtherUnclassified(Long otherUnclassified) {
		this.otherUnclassified = otherUnclassified;
	}

	public Long getCorrectiveEngineering() {
		return correctiveEngineering;
	}

	public void setCorrectiveEngineering(Long correctiveEngineering) {
		this.correctiveEngineering = correctiveEngineering;
	}

	public Long getForwardEngineering() {
		return forwardEngineering;
	}

	public void setForwardEngineering(Long forwardEngineering) {
		this.forwardEngineering = forwardEngineering;
	}

	public Long getReEngineering() {
		return reEngineering;
	}

	public void setReEngineering(Long reEngineering) {
		this.reEngineering = reEngineering;
	}

	public Long getManagement() {
		return management;
	}

	public void setManagement(Long management) {
		this.management = management;
	}

	public Long getNumberOfFiles() {
		return numberOfFiles;
	}

	public void setNumberOfFiles(Long numberOfFiles) {
		this.numberOfFiles = numberOfFiles;
	}

	public Double getPriorBuildCoChanges() {
		return priorBuildCoChanges;
	}

	public void setPriorBuildCoChanges(Double priorBuildCoChanges) {
		this.priorBuildCoChanges = priorBuildCoChanges;
	}

	public Long getTestFilesAdded() {
		return testFilesAdded;
	}

	public void setTestFilesAdded(Long testFilesAdded) {
		this.testFilesAdded = testFilesAdded;
	}

	public Long getTestFilesDeleted() {
		return testFilesDeleted;
	}

	public void setTestFilesDeleted(Long testFilesDeleted) {
		this.testFilesDeleted = testFilesDeleted;
	}

	public Long getTestFilesRenamed() {
		return testFilesRenamed;
	}

	public void setTestFilesRenamed(Long testFilesRenamed) {
		this.testFilesRenamed = testFilesRenamed;
	}

	public Long getSourceFilesAdded() {
		return sourceFilesAdded;
	}

	public void setSourceFilesAdded(Long sourceFilesAdded) {
		this.sourceFilesAdded = sourceFilesAdded;
	}

	public Long getSourceFilesDeleted() {
		return sourceFilesDeleted;
	}

	public void setSourceFilesDeleted(Long sourceFilesDeleted) {
		this.sourceFilesDeleted = sourceFilesDeleted;
	}

	public Long getSourceFilesRenamed() {
		return sourceFilesRenamed;
	}

	public void setSourceFilesRenamed(Long sourceFilesRenamed) {
		this.sourceFilesRenamed = sourceFilesRenamed;
	}

	public Boolean getBuildChanging() {
		return buildChanging;
	}

	public void setBuildChanging(Boolean buildChanging) {
		this.buildChanging = buildChanging;
	}

	public Boolean getFineGrainedbuildChanging() {
		return fineGrainedbuildChanging;
	}

	public void setFineGrainedbuildChanging(Boolean fineGrainedbuildChanging) {
		this.fineGrainedbuildChanging = fineGrainedbuildChanging;
	}

	@Override
	public String toString() {
		return "WorkItem [id=" + id + ", workItemName=" + workItemName
				+ ", projectId=" + projectId + ", issueType=" + issueType
				+ ", firstoccurance=" + firstoccurance
				+ ", bodyPartMethodBody=" + bodyPartMethodBody
				+ ", bodyPartStructureStatements="
				+ bodyPartStructureStatements + ", bodyPartClassBody="
				+ bodyPartClassBody + ", declarationPartAccessModifier="
				+ declarationPartAccessModifier
				+ ", declarationPartFinalModifier="
				+ declarationPartFinalModifier
				+ ", declarationPartAttributeDeclaration="
				+ declarationPartAttributeDeclaration
				+ ", declarationPartMethodDeclaration="
				+ declarationPartMethodDeclaration
				+ ", declarationPartClassDeclaration="
				+ declarationPartClassDeclaration + ", otherDocumentation="
				+ otherDocumentation + ", otherUnclassified="
				+ otherUnclassified + ", correctiveEngineering="
				+ correctiveEngineering + ", forwardEngineering="
				+ forwardEngineering + ", reEngineering=" + reEngineering
				+ ", management=" + management + ", numberOfFiles="
				+ numberOfFiles + ", priorBuildCoChanges="
				+ priorBuildCoChanges + ", testFilesAdded=" + testFilesAdded
				+ ", testFilesDeleted=" + testFilesDeleted
				+ ", testFilesRenamed=" + testFilesRenamed
				+ ", sourceFilesAdded=" + sourceFilesAdded
				+ ", sourceFilesDeleted=" + sourceFilesDeleted
				+ ", sourceFilesRenamed=" + sourceFilesRenamed
				+ ", buildChanging=" + buildChanging
				+ ", fineGrainedbuildChanging=" + fineGrainedbuildChanging
				+ "]";
	}
	
	
	
}
