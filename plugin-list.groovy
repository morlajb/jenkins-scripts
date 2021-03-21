ArrayList pluginsList = Jenkins.instance.pluginManager.plugins
pluginsList.sort{ it.shortName }.each{
 plugin -> 
 println ("${plugin.getShortName()}:${plugin.getVersion()}")
}
return "done"
