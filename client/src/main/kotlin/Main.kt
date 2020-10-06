package client

import kotlinx.browser.document
import kotlinx.css.*
import react.child
import react.dom.h1
import react.dom.render
import styled.*
import styled.injectGlobal

fun main() {
    val styles = CSSBuilder().apply {
        html {
            width = LinearDimension("100%")
            height = LinearDimension("100%")
        }
        body {
            margin = "0"
            padding = "0"
            width = LinearDimension("100%")
            height = LinearDimension("100%")
            backgroundColor = Color.cadetBlue
        }
        "#root" {
            width = LinearDimension("100%")
            height = LinearDimension("100%")
            textAlign = TextAlign.center
        }
    }

    injectGlobal(styles.toString())

    render(document.getElementById("root")) {
        child(PwaBackend)
        child(App::class){ }
    }
}
