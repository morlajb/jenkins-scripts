//clear queue 
//https://github.com/jenkinsci/jenkins-scripts/blob/master/scriptler/clearBuildQueue.groovy

import hudson.model.*
	def queue = Hudson.instance.queue
	println "Queue contains ${queue.items.length} items"
	queue.clear()
	println "Queue cleared"
