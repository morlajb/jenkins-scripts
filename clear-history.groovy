def jobName = "job-name"  
def job = Jenkins.instance.getItem(jobName)  
job.getBuilds().each { it.delete() }  
job.nextBuildNumber = 1   
job.save()
