package at.aau.entity;

public enum FineGrainedBuildResult {
    UNKNOWN,
    CLEAN,
    VALIDATION,
    PRE_PROCESSING,
    COMPILATION_PRODUCTION,COMPILATION_TEST, COMPILATION_SUPPORT,
    TESTING_UNIT,TESTING_INTEGRATION,TESTING_NON_FUNCTIONAL,TESTING_CROSSCUTTING,
    PACKAGING,
    ANALYSIS_STATIC,ANALYSIS_DYNAMIC,
    DEPLOYMENT_LOCAL,DEPLOYMENT_REMOTE,
    EXTERNAL_TASKS,
    DOCUMENTATION,
    RELEASE_PREPARATION,
    SUPPORT,
    DEPENDENCIES
}