package client

import client.components.Field
import client.components.FieldTable
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import styled.*
import kotlinx.css.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {

        val f = Field("home", 10, "lemon")
        val field_array: Array<Field> = arrayOf(f,
            Field("shezer", 15, "orange"),
            Field("field2", 15, "orange"),
            Field("field3", 15, "orange"),
            Field("field4", 15, "orange"),
            Field("field5", 15, "orange"),
            Field("field6", 15, "orange"),
        )

        child(Title::class) {
            attrs.title_string = "farming app title"
        }

        child(FieldTable::class) {
            attrs.field_array = field_array
        }

    }
}