package demo

import tornadofx.Stylesheet
import tornadofx.*

class Styles : Stylesheet() {
    init {
        label {
            fontSize = 20.px;
            backgroundColor += c("#cecece")
        }
    }
}