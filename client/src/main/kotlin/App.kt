package client
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import react.dom.img

class App : RComponent<RProps, RState>() {
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