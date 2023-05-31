package materials.lesson18.patterns.structure.fasade;

public class Sprint {

    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//
//        Developer developer = new Developer();
//
//        developer.doJobBeForeDeathLine(bugTracker);
//
//        bugTracker.endSprint();
//        developer.doJobBeForeDeathLine(bugTracker);


        WorkFlowFasade workFlowFasade = new WorkFlowFasade();
        workFlowFasade.solveProblems();


    }
}
