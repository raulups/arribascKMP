package org.arribasc.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform