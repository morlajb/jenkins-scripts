// list of jobs with git and trigger schedule
import hudson.triggers.*;
import hudson.maven.MavenModuleSet;
import hudson.tasks.*;
import hudson.plugins.git.*;
import org.eclipse.jgit.transport.RemoteConfig;
import org.eclipse.jgit.transport.URIish;

println("--- SCM Polling for FreeStyle jobs ---");
List<FreeStyleProject> freeStyleProjectList = Jenkins.getInstance().getAllItems(FreeStyleProject.class);
for (FreeStyleProject freeStyleProject : freeStyleProjectList) {
  SCMTrigger scmTrigger = freeStyleProject.getSCMTrigger();
  scm = freeStyleProject.scm;
  
  if (scm instanceof hudson.plugins.git.GitSCM) {
    for (RemoteConfig cfg : scm.getRepositories()) {
      for (URIish uri : cfg.getURIs()) {
       // println("SCM " + uri.toString() + " for project " + freeStyleProject.getFullName());    
      }
    } 
  }
  
  //println ( scm.getRepositories().getURIs().toString() )
  
  if (scmTrigger!= null) {
    String spec = scmTrigger.getSpec();
    if (spec != null) {
      
      //if (spec == "* * * * *") {
        //  println(freeStyleProject.getFullName() + " with spec " + spec);
      
         if (scm instanceof hudson.plugins.git.GitSCM) {
             for (RemoteConfig cfg : scm.getRepositories()) {
                 for (URIish uri : cfg.getURIs()) {
                     println(freeStyleProject.getFullName() + " " + uri.toString() + " with spec " + spec);    
                 }
             } 
         }
      //}
    }
  }
}
