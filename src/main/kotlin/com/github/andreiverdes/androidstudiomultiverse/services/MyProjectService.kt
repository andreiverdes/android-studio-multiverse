package com.github.andreiverdes.androidstudiomultiverse.services

import com.intellij.openapi.project.Project
import com.github.andreiverdes.androidstudiomultiverse.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
