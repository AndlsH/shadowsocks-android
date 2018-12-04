package com.github.ssa.plugin

import com.github.ssa.Core.app

object NoPlugin : Plugin() {
    override val id: String get() = ""
    override val label: CharSequence get() = app.getText(com.github.ssa.core.R.string.plugin_disabled)
}
