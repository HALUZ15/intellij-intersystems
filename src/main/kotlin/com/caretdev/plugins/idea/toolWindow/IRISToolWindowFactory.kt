package com.caretdev.plugins.idea.toolWindow

import com.caretdev.plugins.idea.InterSystemsIcons
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.Content
import com.intellij.ui.content.ContentFactory

class IRISToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val irisToolWindow = IRISToolWindow(toolWindow)
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content: Content = contentFactory.createContent(irisToolWindow.content, "", false)
        toolWindow.contentManager.addContent(content)
        toolWindow.setIcon(InterSystemsIcons.ICON)
    }
}
