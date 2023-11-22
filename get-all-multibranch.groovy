import jenkins.branch.MultiBranchProject
import jenkins.model.Jenkins

Jenkins.instance.getAllItems(MultiBranchProject.class).each { project ->
    println("Multibranch Pipeline: ${project.fullName}")
    project.getItems().each { item ->
        println("  Branch: ${item.name}")
    }
    println("\n")
}
