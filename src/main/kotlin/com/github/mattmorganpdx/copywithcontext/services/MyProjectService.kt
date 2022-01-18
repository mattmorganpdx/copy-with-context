package com.github.mattmorganpdx.copywithcontext.services

import com.intellij.openapi.project.Project
import com.github.mattmorganpdx.copywithcontext.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
