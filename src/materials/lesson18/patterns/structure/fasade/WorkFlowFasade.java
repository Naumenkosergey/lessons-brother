package materials.lesson18.patterns.structure.fasade;

public class WorkFlowFasade {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeForeDeathLine(bugTracker);
    }
}
