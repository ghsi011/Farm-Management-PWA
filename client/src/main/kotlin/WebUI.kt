package client
import styled.*
import kotlinx.css.*
import react.*
import react.dom.*
import styled.styledDiv

class WebUI : RComponent<RProps, RState>() {
    override fun RBuilder.render() {

        child(Title::class){
            attrs.title_string = "farming app title"
        }

        h1 {
            +"Field view:"
        }

        img {
            attrs {
                src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
            }
        }
    }
}