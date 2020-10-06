package client.components

import react.*
import react.dom.*

data class Field(val name: String, val size: Int, val crop: String)

external interface FieldTableProps : RProps {
    var field_array: Array<Field>
}

class FieldTable : RComponent<FieldTableProps, RState>() {
    override fun RBuilder.render() {
        div("limiter") {
            div("wrap-table100") {
                div("table100 ver3 m-b-110") {
                    table {
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
                    }
                    div("table100-body js-pscroll") {
                        table {
                            for (field in props.field_array.iterator())

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
        }
    }
}

fun RBuilder.title(handler: FieldTableProps.() -> Unit): ReactElement {
    return child(FieldTable::class) {
        this.attrs(handler)
    }
}