package client

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import styled.*
import kotlinx.css.*

class Field(val name: String, val size: Int, val crop: String)

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
        div("table100 ver3 m-b-110") {
            h1 {
                +"Field view:"
            }
            table() {
                thead {
                    tr("row100 head") {
                        th(classes = "cell100 column1") {
                            +"field name"
                        }
                        th(classes = "cell100 column2") {
                            +"field size"
                        }
                        th(classes = "cell100 column3") {
                            +"field crop"
                        }
                    }
                }
                for (field in field_array.iterator())

                    tr("row100 body") {
                        td("cell100 column1") {
                            +field.name
                        }
                        td("cell100 column2") {
                            +"${field.size}"
                        }
                        td("cell100 column3") {
                            +field.crop
                        }
                    }
            }
        }
    }
}