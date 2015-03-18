package org.whispersystems.jobqueue.jobs;

import org.whispersystems.jobqueue.JobParameters;
import org.whispersystems.jobqueue.requirements.Requirement;

import java.util.concurrent.TimeUnit;

public class RequirementTestJob extends TestJob {

  public RequirementTestJob(Requirement requirement) {
    this(requirement, false, 0);
  }

  public RequirementTestJob(Requirement requirement, boolean needsWakeLock, long timeout) {
    super(JobParameters.newBuilder()
                       .withRequirement(requirement)
                       .withWakeLock(needsWakeLock, timeout, TimeUnit.MILLISECONDS)
                       .create());
  }

}
