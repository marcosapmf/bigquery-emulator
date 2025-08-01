package com.liferay.bigquery.emulator.job;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.liferay.bigquery.emulator.model.GetQueryResultsResponse;
import com.liferay.bigquery.emulator.model.Job;
import com.liferay.bigquery.emulator.model.JobConfiguration;
import com.liferay.bigquery.emulator.model.JobReference;
import com.liferay.bigquery.emulator.model.JobStatistics;
import com.liferay.bigquery.emulator.model.JobStatistics2;
import com.liferay.bigquery.emulator.model.JobStatus;
import com.liferay.bigquery.emulator.model.SessionInfo;

public class JobManager {

	public static Job addJob(Job job) {
		JobConfiguration configuration = job.getConfiguration();
		
		configuration.setDryRun(false);
    	
    	JobStatus jobStatus = new JobStatus();
    	
    	jobStatus.setState("PENDING");
    	
    	job.setStatus(jobStatus);
    	
    	JobStatistics jobStatistics = new JobStatistics();
    	
    	JobStatistics2 jobStatistics2 = new JobStatistics2();
    	
    	jobStatistics2.setStatementType("QUERY");
    	
		jobStatistics.setQuery(jobStatistics2);
    	
    	SessionInfo sessionInfo = new SessionInfo();
    	
		sessionInfo.setSessionId(String.valueOf(UUID.randomUUID()));
    	
		jobStatistics.setSessionInfo(sessionInfo);
		
		Date date = new Date();
		
		jobStatistics.setEndTime(String.valueOf(date.getTime()));
		jobStatistics.setStartTime(String.valueOf(date.getTime()));
    	
		job.setStatistics(jobStatistics);

		JobReference jobReference = job.getJobReference();

		_jobs.put(jobReference.getJobId(), job);
		
		return job;
	}
	
	public static Job getJob(String jobId) {
		return _jobs.get(jobId);
	}
	
	public static void removeJob(String jobId) {
		_jobs.remove(jobId);
		_queryResultResponses.remove(jobId);
	}
	
	public static Job addGetQueryResultsResponse(String jobId, GetQueryResultsResponse getQueryResultsResponse) {
		Job job = _jobs.get(jobId);
		
		if (job == null) {
			throw new IllegalArgumentException("getQueryResultsResponse not found.");
		}
		
		_queryResultResponses.put(jobId, getQueryResultsResponse);
		
		JobStatus jobStatus = new JobStatus();
    	
    	jobStatus.setState("DONE");
    	
    	job.setStatus(jobStatus);
    	
    	return job;
	}
	
	public static GetQueryResultsResponse getGetQueryResultsResponse(String jobId) {
		GetQueryResultsResponse getQueryResultsResponse = _queryResultResponses.get(jobId);
		
		if (getQueryResultsResponse == null) {
			throw new IllegalArgumentException("getQueryResultsResponse not found.");
		}
		
		return getQueryResultsResponse;
	}
	
	private static Map<String, Job> _jobs = new HashMap<String, Job>();
	private static Map<String, GetQueryResultsResponse> _queryResultResponses =
			new HashMap<String, GetQueryResultsResponse>();
}
