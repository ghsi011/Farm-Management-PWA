package client

import kotlinx.css.*
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

class WebUI : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1 {
            +"KotlinConf Explorer"
        }
        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                +"John Doe: Building and breaking things"
            }
        }
    }
}