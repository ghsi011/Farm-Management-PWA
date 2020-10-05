package client

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import react.*

external interface TitleProps: RProps {
    var title_string: String
}

class Title : RComponent<TitleProps, RState>() {
    override fun RBuilder.render() {
        h1{
            key = props.title_string
            +"${props.title_string}:"
        }
    }
}

fun RBuilder.title(handler: TitleProps.() -> Unit): ReactElement {
    return child(Title::class) {
        this.attrs(handler)
    }
}