package com.github.x0f5c3.intellijtrunk.services

import com.intellij.openapi.project.Project
import com.github.x0f5c3.intellijtrunk.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
